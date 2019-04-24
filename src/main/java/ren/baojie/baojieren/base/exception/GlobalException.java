package ren.baojie.baojieren.base.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaojieError defaultExcep(HttpServletRequest req, Exception e, HandlerMethod method) {
        log.error("接口:[{}]", req.getRequestURI());
        log.error("异常:", e);
        return BaojieError.SYS_ERR;
    }

    @ExceptionHandler(BaojieException.class)
    @ResponseBody
    public BaojieError baojieExcep(HttpServletRequest req, BaojieException e, HandlerMethod method) {
        log.error("接口:[{}]", req.getRequestURI());
        log.error("异常:", e);
        return e.getError();
    }
}
