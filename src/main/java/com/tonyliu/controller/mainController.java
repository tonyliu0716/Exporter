package com.tonyliu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tao on 8/3/17.
 */

@Controller
public class mainController {

    @RequestMapping("/")
    public String mainPage() {
        return "index";
    }

}
