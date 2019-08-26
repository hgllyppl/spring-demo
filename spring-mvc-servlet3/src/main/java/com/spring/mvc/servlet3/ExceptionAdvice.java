package com.spring.mvc.servlet3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xin on 2019/8/25.
 */
@RestControllerAdvice
public class ExceptionAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ExceptionHandler
    public Object handleException(Exception e) {
        LOGGER.error(e.getMessage(), e);
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("code", 1);
        map.put("msg", "error");
        return map;
    }
}
