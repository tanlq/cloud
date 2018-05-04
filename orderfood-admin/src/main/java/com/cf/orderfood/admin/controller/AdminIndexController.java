package com.cf.orderfood.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminIndexController {

    @RequestMapping(value = {"/", "/index", ""})
    public String index() {
        return "index";
    }
}
