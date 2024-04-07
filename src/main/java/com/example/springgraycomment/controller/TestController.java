package com.example.springgraycomment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XXXX
 *
 * @author yinyong
 * @version 1.0
 * @classname TestControoler
 * @date 2024/3/26 23:26
 */
@RestController
@RequestMapping(value = "/api/test")
public class TestController {
    /**
     * getUser
     */
    @GetMapping(value = "getUser")
    public String getUser() {
        System.out.println("comment-getUser");
        return "comment-getUser";
    }
}
