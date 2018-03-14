package com.fixed.asset.common;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class MailUtil {

 private String charset = "UTF-8";

 private String to; // 收件人

 private String from; // 发件人

 private String fromNickName;// 发件人昵称

 private String host; // SMTP主机

 private String password = ""; // 发件人邮箱密码

 private String subject = ""; // 邮件主题

 private String content = ""; // 邮件正文

 private boolean auth = true; // 邮件认证

 private String comments; // 备注

 private String contentType = "text/plain";// 邮件格式

 private HashMap<String, String> file = new HashMap<String, String>(); // 附件文件集合

 private Properties props;

 private String username;// 邮箱用户名

 public MailUtil() {
 }

 public MailUtil(String to, String from, String smtpServer, String username,
   String password, String subject, String content) {
  this.to = to;
  this.from = from;
  this.host = smtpServer;
  this.password = password;
  this.subject = subject;
  this.content = content;
  this.setContentType("text/html; charset=utf-8");
 }
 

 /**
  * 发送邮件 boolean 成功为true，反之为false
  * 
  * @throws Exception
  */
 public void sendMail() throws Exception {
  if (getTo() == null || getFrom() == null || getHost() == null) {
   throw new Exception("参数不完成,请检查SMTP服务地址,发件人,收件人的参数.");
  }

  MimeMessage msg = new MimeMessage(getSession());

  //添加发送人
  AddFrom(msg);

  // 发送多个邮件,以空格为分隔符
  InternetAddress[] address = InternetAddress.parse(getTo());
  msg.setRecipients(Message.RecipientType.TO, address);

  //添加主题
  msg.setSubject(transferChinese(getSubject()));

  // 构造Multipart
  Multipart mp = new MimeMultipart();

  // 向Multipart添加正文
  MimeBodyPart mbpContent = new MimeBodyPart();
  mbpContent.setContent(getContent(), getContentType());
  // 向MimeMessage添加（Multipart代表正文）
  mp.addBodyPart(mbpContent);

  // 向Multipart添加附件
  addAccessories(mp);

  // 向Multipart添加MimeMessage
  msg.setContent(mp);

  if (getComments() != null) {
   msg.setHeader("Comments", getComments());
  }
  msg.setSentDate(new Date());
  // 发送邮件
  Transport.send(msg);
 }

 /**
  * @param msg
  * @throws MessagingException
  * @throws AddressException
  */
 private void AddFrom(MimeMessage msg) throws MessagingException,
   AddressException {
  if (getFromNickName() != null) {
   try {
    msg.setFrom(new InternetAddress(getFrom(),
      transferChinese(getFromNickName())));
   } catch (UnsupportedEncodingException e) {
    msg.setFrom(new InternetAddress(getFrom()));
   }
  } else {
   msg.setFrom(new InternetAddress(getFrom()));
  }
 }

 /**
  * 设置MAIL认证
  * 
  * @param auth
  *            boolean
  */
 private void setMailAuth(boolean auth) {
  if (props == null) {
   props = System.getProperties();
  }
  props.put("mail.smtp.auth", String.valueOf(auth));

 }

 /**
  * 构造mail session
  * 
  * @return Session
  */
 private Session getSession() {
  Properties props = System.getProperties();
  props.put("mail.smtp.host", getHost());
  setMailAuth(isAuth());
  if (getFrom().indexOf("@") > 0) {
   username = getFrom().substring(0, getFrom().indexOf("@"));
  } else {
   username = getFrom();
  }
  Session session = Session.getDefaultInstance(props,
    new Authenticator() {
     public PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(username,
        getPassword());
     }
    });
  return session;
 }

 /**
  * 向Multipart添加附件
  * 
  * @param mp
  *            Multipart
  * @throws MessagingException
  */
 private void addAccessories(Multipart mp) throws MessagingException {
  if (getFile().size() > 0) {
   Iterator<String> iterator = getFile().keySet().iterator();
   String filename;
   String tfilename;
   while (iterator.hasNext()) {
    MimeBodyPart mbpFile = new MimeBodyPart();
    filename = iterator.next();
    FileDataSource fds = new FileDataSource(filename);
    mbpFile.setDataHandler(new DataHandler(fds));
    mbpFile.setFileName(fds.getName());
    tfilename = getFile().get(filename);
    mbpFile.setFileName(transferChinese(tfilename));
    // 向MimeMessage添加（Multipart代表附件）
    mp.addBodyPart(mbpFile);
   }
  }
 }

 /**
  * 把主题转换为中文
  */
 private String transferChinese(String strText) {
  try {
   strText = MimeUtility.encodeText(strText, getCharset(), "B");
  } catch (Exception e) {
   e.printStackTrace();
  }
  return strText;
 }

 /**
  * 设置邮件格式和字符集 例如:"text/html"或"text/plain"
  * 
  * @param contentType
  * 邮件格式和字符集 默认"text/plain"
  */
 public void setContentType(String contentType) {
  this.contentType = contentType;
 }

 /**
  * 往附件组合中添加附件
  */
 public void attachfile(String fname) {
  String rfname = fname;
  if (fname.lastIndexOf("\\") > 0) {
   rfname = fname.substring(fname.lastIndexOf("\\") + 1);
  }
  file.put(fname, rfname);
 }

 /**
  * 往附件组合中添加附件,并重命名
  */
 public void attachfile(String fname, String tfname) {
  file.put(fname, tfname);
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public HashMap<String, String> getFile() {
  return file;
 }

 public void setFile(HashMap<String, String> file) {
  this.file = file;
 }

 public String getTo() {
  return to;
 }

 public String getFrom() {
  return from;
 }

 public String getHost() {
  return host;
 }

 public String getSubject() {
  return subject;
 }

 public String getContent() {
  return content;
 }

 public void setTo(String to) {
  this.to = to;
 }

 public void setFrom(String from) {
  this.from = from;
 }

 public void setHost(String host) {
  this.host = host;
 }

 public void setPassWord(String pwd) {
  this.password = pwd;
 }

 public void setSubject(String subject) {
  this.subject = subject;
 }

 public void setContent(String content) {
  this.content = content;
 }

 public boolean isAuth() {
  return auth;
 }

 public void setAuth(boolean auth) {
  this.auth = auth;
 }

 public String getContentType() {
  if (getCharset() != null && !contentType.endsWith(getCharset())) {
   contentType += ";charset=" + getCharset();
  }
  return contentType;
 }

 public String getFromNickName() {
  return fromNickName;
 }

 public void setFromNickName(String fromNickName) {
  this.fromNickName = fromNickName;
 }

 public String getComments() {
  return comments;
 }

 public void setComments(String comments) {
  this.comments = comments;
 }

 public String getCharset() {
  return charset;
 }

 public void setCharset(String charset) {
  this.charset = charset;
 }

}

