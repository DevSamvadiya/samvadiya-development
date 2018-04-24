/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samvadiya.member.profile.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author avenger
 */
@Controller
@RequestMapping(value="/")
public class UserProfileController {
    
@RequestMapping(value="/Home")  
public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception { 
    System.out.println("i am HomePage====");
    ModelAndView modelAndView = new ModelAndView("home");
    return modelAndView;
   
    }   
    
    
@RequestMapping(value="/profile")  
public ModelAndView profile(HttpServletRequest request, HttpServletResponse response) throws Exception { 
    System.out.println("i am HomePage====");
    ModelAndView modelAndView = new ModelAndView("user.profile");
    return modelAndView;
   
    }

@RequestMapping(value="/messages")  
public ModelAndView message(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView modelAndView = new ModelAndView("user.message");
    return modelAndView;
   
    }

    
}
