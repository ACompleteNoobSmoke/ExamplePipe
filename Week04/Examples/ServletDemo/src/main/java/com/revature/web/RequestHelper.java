package com.revature.web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.service.MovieServiceImpl;
import com.revature.service.UserServiceImpl;

/*
 * Our Request is a class that returns objects to our Request Dispatcher Servlet.
 */
public class RequestHelper {
	
	public static final Logger LOGGY = LogManager.getLogger(RequestHelper.class);

	public static Object processGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		final String URI = req.getRequestURI().replace("/ServletDemo/getflixapi", "");
		
		switch(URI) {
		
		case "/movie/all":
			return new MovieServiceImpl().getAllMovies();
			
		default:
			return "RESOURCE NOT FOUND";
		}
	}
	
public static Object processPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		final String URI = req.getRequestURI().replace("/ServletDemo/getflixapi", "");
		
		switch(URI) {
		
		case "/login":
			if(new UserServiceImpl().isValidUser(req, resp)) {
				resp.setStatus(200);
				return "Login Successful";
			}else {
				resp.sendError(403);
				return "Login was not successful";
			}
		
		case "/movie/create":
			String body = req.getReader().lines().collect(Collectors.joining());
			LOGGY.info("The movie info is: "+ body);
			return new MovieServiceImpl().insertMovie(req, resp);
			
		default:
			return "ENDPOINT NOT YET IMPLEMENTED";
		}
		
	}
}
