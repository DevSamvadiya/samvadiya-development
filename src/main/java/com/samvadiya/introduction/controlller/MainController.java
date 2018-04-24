/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samvadiya.introduction.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;


/**
 *
 * @author avenger
 */
@Controller("/auth")
public class MainController {
@RequestMapping("/Home")
public ModelAndView home()
{
return new ModelAndView("");


}
    
    
    
}
