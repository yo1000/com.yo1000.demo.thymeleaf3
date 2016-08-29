package com.yo1000.demo.thymeleaf3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yo1000
 */
@Controller
@RequestMapping
public class DemoController {
    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("demoText", "hoge hoge fuga fuga");
        return "demo";
    }
}
