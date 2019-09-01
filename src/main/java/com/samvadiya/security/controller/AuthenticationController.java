package com.samvadiya.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.samvadiya.security.domain.LoginDomain;

/**
 * @author avenger
 *
 */
@Controller
public class AuthenticationController {
    Logger logger = Logger.getLogger(AuthenticationController.class);

    /**
     * @param acceptLanguage
     * @param userAgent
     * @param request
     * @param response
     * @param loginDomain
     * @return
     * @throws Exception
     */
    @RequestMapping(value = { "/", "/login", "/registration", "/welcome",
	    "/index" }, method = RequestMethod.GET, produces = "text/html")
    public ModelAndView getMainPage(@RequestHeader(value = "Accept-Language") String acceptLanguage,
	    @RequestHeader(value = "User-Agent", defaultValue = "unknown") String userAgent, HttpServletRequest request,
	    HttpServletResponse response, @ModelAttribute("loginDomain") LoginDomain loginDomain) throws Exception {
	// System.out.println("getLoginPage controller called");
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("user.index.page");

	return modelAndView;
    }

    /**
     * @param acceptLanguage
     * @param userAgent
     * @param request
     * @param response
     * @param loginDomain
     * @return
     * @throws Exception
     */
    @RequestMapping(value = { "/", "/login" }, method = RequestMethod.POST, produces = "text/html")
    public ModelAndView getLoginPage(@RequestHeader(value = "Accept-Language") String acceptLanguage,
	    @RequestHeader(value = "User-Agent", defaultValue = "unknown") String userAgent, HttpServletRequest request,
	    HttpServletResponse response, @ModelAttribute("loginDomain") LoginDomain loginDomain) throws Exception {
	// System.out.println("getLoginPage controller called");
	System.out.println("i am getLoginPage email====" + loginDomain.getEmail() + ",Pass=="
		+ loginDomain.getPassword() + "\nacceptLanguage= " + acceptLanguage + "\nuserAgent==" + userAgent);
	ModelAndView modelAndView = new ModelAndView();
	HttpSession session = request.getSession(false);
	System.out.println("session=======" + session);

	if (session != null && session.getAttribute("security") != null) {
	    modelAndView.addObject(loginDomain);
	    modelAndView.setViewName("index");
	} else {
	    modelAndView.setViewName("user.index.page");
	}

	return modelAndView;
    }

    /**
     * @param loginDomain
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = { "/create_new_user",
	    "/reset_password" }, method = RequestMethod.POST, produces = "text/html")
    public ModelAndView loginPage(@ModelAttribute("loginDomain") LoginDomain loginDomain, HttpServletRequest request,
	    HttpServletResponse response) throws Exception {
	// System.out.println("getLoginPage controller called");
	System.out.println("i am loginPage email====" + loginDomain.getEmail() + " password=="
		+ loginDomain.getPassword() + " Name===" + request.getParameter("email"));
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject(loginDomain);
	modelAndView.setViewName("user.home");

	return modelAndView;
    }

}
