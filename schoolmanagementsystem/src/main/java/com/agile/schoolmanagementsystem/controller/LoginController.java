package com.agile.schoolmanagementsystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.agile.schoolbackend.dao.UserDAO;
import com.agile.schoolbackend.dto.User;

@Controller
public class LoginController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView showLoginForm(HttpSession session){
		if(session.getAttribute("user")!=null){
			ModelAndView mav = new ModelAndView("masterpage");
			mav.addObject("page","home");
			mav.addObject("pageTitle","home");
			return mav;
		}
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView logOut(HttpSession session){
		System.out.println("logout");
		if(session !=null && session.getAttribute("user")!=null){
			System.out.println(((User)session.getAttribute("user")).getUsername());
			session.setAttribute("user", null);
		}
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value =  "/login" ,method=RequestMethod.POST)
	public ModelAndView verifyLogin(@RequestParam String username,
			@RequestParam String password,HttpSession session) {

		

		if(!username.equals("admin")|| !password.equals("admin")){
			ModelAndView mav = new ModelAndView("login");
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("masterpage");
		
		User user = new User();
		user.setId(1);
		user.setName("Ramy");
		user.setUsername(username);
		user.setPassword(password);
		user.setMenus(userDAO.getMenus(user));
		mav.addObject("user", user);
		mav.addObject("page", "home");
		mav.addObject("pageTitle","home");
		session.setAttribute("user", user);		
		return mav;

	}
}
