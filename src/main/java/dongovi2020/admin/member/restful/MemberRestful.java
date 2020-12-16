package dongovi2020.admin.member.restful;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import dongovi2020.admin.member.service.MemberService;
import dongovi2020.base.common.BaseRestful;
import dongovi2020.base.common.ResultData;
import dongovi2020.common.model.united.MemberVO;



/**
 * BizBasicRestful
 * @author tata creator
 * @since 2020.12.05 
 */
@Controller
public class MemberRestful extends BaseRestful {

	private static final Logger logger = LoggerFactory.getLogger(MemberRestful.class);

	@Autowired
	private MemberService memberService;

	@ResponseBody
	@PostMapping(value = "/api/member/memberLogin.ajax") 
	public ResponseEntity<Map<String, Object>> memberLogin(HttpServletRequest request, @RequestBody MemberVO param) {
		
		int crtMbrIdx = getSessionLoginCurationMemberIdx(request);
		ResultData resultData = new ResultData(param);
//		resultData.setLoginCrtMbrIdx(crtMbrIdx);
//		
//		try {
//			int iResult = curationMemberService.addCurationMember(param);
//			param.setCrtMbrIdx(iResult); // key setting
//			
//			resultData = new ResultData("S002", true, param);
//		} catch (Exception e) {
//			logger.error("Error:"+e.getMessage());
//		} 
		
		return resultData.getResponseEntity();
	}
}
