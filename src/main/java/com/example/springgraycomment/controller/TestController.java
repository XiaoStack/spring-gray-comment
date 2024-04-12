package com.example.springgraycomment.controller;

import com.example.springgraycomment.common.GrayConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
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
     * 当前环境
     */
    @Value("${spring.cloud.nacos.discovery.metadata.grayTag:false}")
    private String grayTagConfig;

    /**
     * getComment
     */
    @GetMapping("/getComment")
    public String getComment(@RequestHeader(required = false) String grayTag) {
        System.out.println("header grayTag:" + grayTag);
        boolean isGray = GrayConstant.GRAY_VALUE.equals(grayTagConfig);
        String serviceName = isGray ? "comment-gray" : "comment-normal";
        System.out.println("当前环境:" + serviceName);
        return "加载自服务 " + serviceName + " 的评论：" + (isGray ? "灰度灰度" : "正常正常");
    }
}
