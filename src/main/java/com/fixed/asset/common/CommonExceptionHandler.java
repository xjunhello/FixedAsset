package com.fixed.asset.common;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
/**
 * 通用异常处理
* @ClassName: CommonExceptionHandler 
* @Description: url请求被返回通用错误页面，ajax请求错误信息被封装到 code，desc字段 
* @author xinjun.zhang
* @date 2016年10月13日 下午1:17:49 
*
 */
public class CommonExceptionHandler  implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		String errorcode;
		String errortext;
		if(ex instanceof BusinessException){
			errorcode =( (BusinessException)ex).getCode()+"|"+( (BusinessException)ex).getName();
			errortext = ( (BusinessException)ex).getDescrition();
		}else{
			errorcode = "系统异常";
			errortext = ex.getMessage();
		}
		
		String requestType  = request.getHeader("X-Requested-With");
		if(requestType!=null&&requestType.equals("XMLHttpRequest")){
			//ajax
			JsonMessage.sendBack(response, new JsonMessage(response, false, errorcode, errortext));
			return null;
		}else{
			//url
			ModelAndView view = new ModelAndView("error");
			view.addObject("errorcode",errorcode);
			view.addObject("errortext",errortext);
			view.addObject("ex", ex);
			return    view;
		}
        
	}

}
