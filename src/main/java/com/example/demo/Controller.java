package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @RequestMapping(value="/save" , method=RequestMethod.GET)
	public String m() {
		System.out.println("helllo...");
		return "Helllo ....";
	}
}
