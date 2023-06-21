package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

import jakarta.validation.Valid;

@Controller
public class HomeController {

@Autowired
UserService userService;
	
	@RequestMapping("/home")
	public String gethome(Model m) {

		
		return "home";
	}
	@RequestMapping("/form")
	public ModelAndView getform()
	{
		return new ModelAndView("empform","command",new User());
	}
	
	
	
	@RequestMapping(value="/processform2" ,method=RequestMethod.POST)
	public String getform2(@Valid @ModelAttribute("command") User u,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			//System.out.println(result);
			
			return "empform";
		}
		 userService.save(u);
		 return "redirect:/home";
}
}
