package com.mindtree.controller;

import java.sql.SQLException;
import java.util.LinkedList;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.exception.InvalidInputException;
import com.mindtree.exception.SqlException;
import com.mindtree.services.FootballMatchManager;

@EnableAutoConfiguration
@Controller
public class HomeController implements ErrorController {

	private static final String PATH = "/error";

	public HomeController() {

	}

	@RequestMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	@Override
	public String getErrorPath() {

		System.out.println("error path ");
		return PATH;
	}

	@RequestMapping(value = "/")
	public String serveBase() {
		String result = "Hello!";

		return result;
	}

	@RequestMapping(value = "/home", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public  String serveHome() {

		return "";
	}
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public @ResponseBody String addDetails(@RequestParam("ftn") String ftn1,@RequestParam("stn") String stn1,@RequestParam("date") String date1,@RequestParam("ftg") String ftg1,@RequestParam("stg") String stg1) throws ClassNotFoundException, SqlException, InvalidInputException {
		FootballMatchManager m=new FootballMatchManager();
		m.Insertion(ftn1,stn1,date1,ftg1,stg1);
		return ftn1;
	}
	@RequestMapping(value = "/show", method=RequestMethod.GET)
	public @ResponseBody LinkedList showDetails(@RequestParam("tn") String name) throws ClassNotFoundException, SqlException, InvalidInputException {
		FootballMatchManager m=new FootballMatchManager();
		LinkedList l=m.display(name);
		//System.out.println(s);
		return l;
	}


}
