package com.tonyliu.controller;

import com.tonyliu.entity.Course;
import com.tonyliu.entity.Xblock;
import com.tonyliu.service.XblockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tao on 8/3/17.
 */

@RestController
public class TesterController {

    @Autowired
    private XblockService service;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/getXblocks")
    public List<Xblock> getXblocks() {
        System.out.println("getting data from OpenEdx database.");
        return service.getXblocks();
    }

    @RequestMapping(value = "/getCourseId", method = RequestMethod.GET)
    public List<Course> getAllCourseId() {
        return service.getCourses();
    }

}
