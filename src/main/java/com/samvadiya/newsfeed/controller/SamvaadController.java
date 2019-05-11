package com.samvadiya.newsfeed.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.samvadiya.newsfeed.dao.SamvaadDao;

@Controller()
@RequestMapping("/samvaad")
public class SamvaadController {
@Autowired public SamvaadDao samvaadDao;	

@RequestMapping("/test")	
public ModelAndView test()
{
	System.out.println("I am test");
return new ModelAndView("test");
}
@RequestMapping("/getSamvaad")	
public ModelAndView getSamvaad()
{
	ModelAndView mav=new ModelAndView("test");
	try{
//List<SamvaadDomain> list=samvaadDao.getSamvaad("pankaj1234");
//mav.addObject("samvaad", list);
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}

return  mav;

}

}
