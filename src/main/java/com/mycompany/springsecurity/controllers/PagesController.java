/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author tommib
 * 
 * Teit tätä läpi
 * https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#multiple-httpsecurity
 */
@Controller
public class PagesController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("Olen aktivoitu");
        return "login";
    }
}
