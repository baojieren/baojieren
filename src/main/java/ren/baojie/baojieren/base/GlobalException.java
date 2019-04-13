package ren.baojie.baojieren.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class GlobalException {

    @ExceptionHandler({RuntimeException.class, Exception.class})
    public void handExce(HttpServletRequest req, Exception e, HandlerMethod method) {
        log.error("接口：[{}]", req.getRequestURI());
        log.error("异常：[{}]", e);
    }
}
