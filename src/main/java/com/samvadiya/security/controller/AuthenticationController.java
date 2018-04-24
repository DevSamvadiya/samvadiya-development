package com.samvadiya.security.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {
    Logger logger = Logger.getLogger(AuthenticationController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    @ResponseBody
    public ModelAndView getLoginPage(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception { //System.out.println("getLoginPage controller called");
              System.out.println("i am getLoginPage invoked====");
     
            ModelAndView modelAndView = new ModelAndView("index");           
         
            return modelAndView;
   
    }
}
