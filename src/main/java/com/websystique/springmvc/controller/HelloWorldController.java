package com.websystique.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		model.addAttribute("vanban", "Day la van ban thu nhat");
		return "welcome";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		model.addAttribute("vanban2", "Day la van ban 2");
		return "welcome";
	}

	/* PathVariable */
	@RequestMapping(value = "/facebook/{username}/{password}")
	public ModelAndView thongTin(@PathVariable("username") String name, @PathVariable("password") String pass) {
		ModelAndView model = new ModelAndView("ThongTinND");
		model.addObject("slogan", "Thong Tin User " + name);
		model.addObject("timmatkhau", "Mat khau user " + name + ": " + pass);
		return model;
	}

	@RequestMapping(value = "/facebook2/{username}/{password}")
	public ModelAndView thongTin2(@PathVariable Map<String, String> us_mk) {
		ModelAndView model = new ModelAndView("ThongTinND");
		model.addObject("slogan", "Thong Tin User " + us_mk.get("username"));
		model.addObject("timmatkhau", "Mat khau user " + us_mk.get("password"));
		return model;
	}

	/* requestparam */
	@RequestMapping(value = "dangnhapfb")
	public String login(ModelMap model, @RequestParam("id") String id, @RequestParam("pass") String pass) {
		if (id.equals("trung") && pass.equals("123")) {
			model.addAttribute("mess", "Dang nhap thanh cong");
		} else {
			model.addAttribute("mess", "Sai thong tin dang nhap");
		}
		return "login";
	}
}
