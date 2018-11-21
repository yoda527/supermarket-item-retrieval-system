package com.alibaba.xinan.sirs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XinAnzzZ
 * @date 2018/11/21 10:45
 */
@Controller
public class PageController {

    @RequestMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }
}
