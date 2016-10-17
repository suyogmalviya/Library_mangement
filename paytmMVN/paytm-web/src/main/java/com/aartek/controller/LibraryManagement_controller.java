package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.service.LibraryService;

@Controller
public class LibraryManagement_controller {

	
	
/*	@Autowired
	private LibraryService libraryService; */
	
	/* @RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
		   return "index";
	   }*/
	
	@RequestMapping(value="/OnlineLibrary",method=RequestMethod.GET)
	 
	   public String LibraryPageDisplay() {
		return "LibraryManagment";
	   }
		
		
		
	}

