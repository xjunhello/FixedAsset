package com.fixed.asset.common;
/**
 * 自定义异常
* @ClassName: BusinessException 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author xinjun.zhang
* @date 2016年10月13日 上午10:33:03 
*
 */
public class BusinessException extends Exception {
	
	public BusinessException(String code, String name, String descrition,
			Exception throwable) {
		super();
		this.code = code;
		this.name = name;
		this.descrition = descrition;
		this.throwable = throwable;
	}
	
	public BusinessException(String code, String name, String descrition) {
		super();
		this.code = code;
		this.name = name;
		this.descrition = descrition;
	}

	public BusinessException(String name, String descrition) {
		super();
		this.name = name;
		this.descrition = descrition;
	}

	/**
	 * 错误码
	 */
	private String code="0000";
	/**
	 * 错误名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String descrition;
	private Exception throwable;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public Exception getThrowable() {
		return throwable;
	}
	public void setThrowable(Exception throwable) {
		this.throwable = throwable;
	}
}
