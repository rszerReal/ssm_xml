package com.itheima.exception;

import com.itheima.domain.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    //对出现异常的情况进行拦截，并将其处理成统一的页面数据结果格式
    public Result doBusinessException(BusinessException e) {
        return new Result(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception e) {
        //redis发送真正的异常信息给运维人员e.getMessage()
        return new Result(500, "请稍候重试");
    }

}