package com.tonyliu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by tonyliu on 8/2/17.
 */
@RestController
public class UploadFileController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    public String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }

}
