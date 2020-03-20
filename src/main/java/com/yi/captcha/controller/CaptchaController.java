package com.yi.captcha.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptchaController {

    @GetMapping("/captcha")
    public String getCaptcha() {
        return "CAPTCHA";
    }


}
