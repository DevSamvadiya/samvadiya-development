/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samvadiya.member.profile.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samvadiya.security.domain.LoginDomain;

/**
 *
 * @author avenger
 */
@Controller
@RequestMapping(value = "/")
public class UserProfileController {

    /**
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/home")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception {
	System.out.println("I am home getting data from db");
	ModelAndView modelAndView = new ModelAndView("user.home");
	return modelAndView;

    }

    /**
     * @param request
     * @param response
     * @param loginDomain
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/profile")
    public ModelAndView profile(HttpServletRequest request, HttpServletResponse response,
	    @ModelAttribute("loginDomain") LoginDomain loginDomain) throws Exception {
	System.out.println("i am HomePage====");
	ModelAndView modelAndView = new ModelAndView("user.profile");
	return modelAndView;

    }

    /**
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/chaupal")
    public ModelAndView chaupal(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ModelAndView modelAndView = new ModelAndView("user.chaupal");
	return modelAndView;
    }

    /**
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/test")
    public ModelAndView message(HttpServletRequest request, HttpServletResponse response) throws Exception {
	ModelAndView modelAndView = new ModelAndView("test");
	return modelAndView;

    }

}
