package com.agile.schoolmanagementsystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

import com.agile.schoolbackend.dao.UserDAO;
import com.agile.schoolbackend.dto.User;

@Controller
public class MasterPageController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index(HttpSession session) {

		User user=(User)session.getAttribute("user");
		ModelAndView mav = new ModelAndView("masterpage");
		mav.addObject("page", "home");
		mav.addObject("pageTitle", "home");
		mav.addObject("user", user);
		return mav;

	}

	

}
