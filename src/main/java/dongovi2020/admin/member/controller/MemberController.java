package dongovi2020.admin.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {

	@RequestMapping("/member/memberLogin.pop")
	public String memberLoginPop() throws Exception {
		return "member/memberLogin.pop";
	}

}
