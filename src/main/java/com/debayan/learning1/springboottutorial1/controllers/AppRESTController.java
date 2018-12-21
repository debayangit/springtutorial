package com.debayan.learning1.springboottutorial1.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRESTController implements ErrorController{

	@RequestMapping(value= "/helo")
	public String saysHi() {
		return "Hi bby";
	}
	
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}

   
}
