package com.example.springgraycomment.controller;

import com.example.springgraycomment.common.GrayConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
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
    public String getUser(@RequestHeader(required = false) String grayTag) {
        return GrayConstant.GRAY_VALUE.equals(grayTag) ? "来自灰度服务的评论" : "来自正常服务的评论";
    }
}
