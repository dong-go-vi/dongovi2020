package dongovi2020.admin.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	@RequestMapping("/index")
	public String index() throws Exception {
		return "index";
	}
	
	@RequestMapping("/team")
	public String team() throws Exception {
		return "team";
	}
	
	@RequestMapping("/teacher")
	public String teacher() throws Exception {
		return "teacher";
	}

	
}
