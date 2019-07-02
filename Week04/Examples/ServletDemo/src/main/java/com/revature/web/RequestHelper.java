package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.MovieServiceImpl;
import com.revature.service.UserServiceImpl;

/*
 * Our Request is a class that returns objects to our Request Dispatcher Servlet.
 */
public class RequestHelper {

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
			return new MovieServiceImpl().insertMovie(req, resp);
			
		default:
			return "ENDPOINT NOT YET IMPLEMENTED";
		}
		
	}
}
