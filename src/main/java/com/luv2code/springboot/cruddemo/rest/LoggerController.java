package com.luv2code.springboot.cruddemo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User: Vu
 * Date: 26.05.2023
 * Time: 10:24
 */
@RestController
public class LoggerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/log")
    public String hello(){
        LOGGER.info("this is sample info message");
        LOGGER.warn("this is sample warn message");
        LOGGER.error("this is sample error message");
        LOGGER.debug("this is sample debug message");
        return "hello simplifying tech ";

    }
}