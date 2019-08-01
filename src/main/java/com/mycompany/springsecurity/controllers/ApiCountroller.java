/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springsecurity.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tommib
 */
@RestController
public class ApiCountroller {
    
    @RequestMapping("/api/users")
    public String users(){
        return "Tommi";
    }
}
