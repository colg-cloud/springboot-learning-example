package org.spring.springboot.exception;

import org.spring.springboot.result.ErrorInfoInterface;
import org.spring.springboot.result.GlobalErrorInfoException;
import org.spring.springboot.result.ResultBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一错误码异常处理
 *
 * @author colg
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {

	@ExceptionHandler(value = GlobalErrorInfoException.class)
	public ResultBody errorHandlerOverJson(HttpServletRequest request, GlobalErrorInfoException exception) {
		ErrorInfoInterface errorInfo = exception.getErrorInfo();
		ResultBody result = new ResultBody(errorInfo);
		return result;
	}
}
