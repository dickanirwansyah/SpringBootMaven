/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicka.springboot.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dickajava
 */
@Controller
public class ControllerHome {
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index(@RequestParam(value = "nama", required = false)String nama, Model model){
        model.addAttribute("nama", nama);
        model.addAttribute("tanggal", new Date());
        return "home";
    }
    
}
