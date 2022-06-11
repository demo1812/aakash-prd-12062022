package com.aakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aakash.model.aakash;


@Controller
public class aakashcontroller {

	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/view")
	public String view(aakash aakash)
	{
		if(aakash.getAname().equals("Komal") && aakash.getApass().equals("Komal@123"))

		{
			return "view.jsp";
		}	
		return "error.jsp";
	}

}
