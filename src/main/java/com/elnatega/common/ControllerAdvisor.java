package com.elnatega.common;

import com.elnatega.common.error.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvisor {
    private final Logger logger = LoggerFactory.getLogger(ControllerAdvisor.class);

    @ExceptionHandler(Error.class)
    public ErrorResponse handleExecptions(Error ex) {
        logger.error("error");
        return new ErrorResponse(404, "Failed");
    }
}