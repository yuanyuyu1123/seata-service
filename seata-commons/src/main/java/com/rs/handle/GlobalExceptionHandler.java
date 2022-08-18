package com.rs.handle;

import com.rs.response.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 网关统一异常处理
 *
 * @author ruoyi
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private final static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    public AjaxResult handleFeignException(Exception e) throws Exception {
        log.error(e.getMessage(), e);

        // 如果某个自定义异常有@ResponseStatus注解，就继续抛出
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        return AjaxResult.error("服务器内部异常");
    }

    @ExceptionHandler(Exception.class)
    public AjaxResult handleException(Exception e) throws Exception {
        log.debug("handleException信息: {}", e.getMessage());
        // 如果某个自定义异常有@ResponseStatus注解，就继续抛出
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }
        // 实际项目中应该这样写，防止用户看到详细的异常信息
        // return new Result().failure().message.message("操作失败");
        return AjaxResult.error("服务器异常");
    }

}