package dongovi2020.zzz01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dongovi2020.zzz01.model.TestVO;


@Controller
public class TestController {

	@Autowired 
//	TestService testService;


	@RequestMapping(value = "/home")
	public String home() {
		return "index.html";
	}

	@RequestMapping("/test1")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test1");

		mav.addObject("name", "name111");
		mav.addObject("id", "id11");

		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		mav.addObject("list", testList);
		return mav;
	}

	@RequestMapping("/thymeleaf/tmlf01")
	public String thymeleafTest(Model model) {
		TestVO vo = new TestVO("devterius1", "캐케터1");
		model.addAttribute("model", vo);
		return "thymeleaf/tmlf01";
	}


	@RequestMapping("/common/zzz1")
	public String commonZzz1() throws Exception {
		return "common/zzz1";
	}

	@RequestMapping("/common/zzz1.pop")
	public String commonZzz1Pop() throws Exception {
		return "common/zzz1";
	}

	@RequestMapping("/zzz/zzz2")
	public String zzzZzz2() throws Exception {
		return "index";
	}

	@RequestMapping("/zzz/zzz2.pop")
	public String zzzZzz2Pop() throws Exception {
		return "common/zzz1";
	}
}
