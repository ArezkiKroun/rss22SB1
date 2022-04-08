package fr.univrouen.rss22.Controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Item;




	@RestController
	public class IndexController {
	@GetMapping("/")
	public String index() {
	return "Hello rss22 !";
	}

	

	}
	


