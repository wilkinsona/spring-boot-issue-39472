package com.sun.demo.spring.cloud.gateway.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static final Log logger = LogFactory.getLog(RestController.class);

    @RequestMapping("/rest")
    String home() {
        logger.info("home() has been called");
        return "Hello World!";
    }
}
