package com.tonyliu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tao on 8/3/17.
 */

@RestController
public class TesterController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
