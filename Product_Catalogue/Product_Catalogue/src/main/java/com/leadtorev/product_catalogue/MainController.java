package com.leadtorev.product_catalogue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	
	@GetMapping("/index")
	public String index() {
		return "index.html";
	}
	
}
