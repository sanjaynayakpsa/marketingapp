package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pagecontroller {
	@RequestMapping("/viewpage")
public String viewCreatePage() {
	return "create";
}
}
