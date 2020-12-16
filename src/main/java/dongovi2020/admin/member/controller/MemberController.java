package dongovi2020.admin.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {

//	@Autowired 
//	TestService testService;





	@RequestMapping("/member/memberLogin.pop")
	public String zzzZzz2() throws Exception {
		return "member/memberLogin.pop";
	}

}
