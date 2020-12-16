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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dongovi2020.admin.member.service.MemberService;
import dongovi2020.base.common.BaseRestful;
import dongovi2020.base.common.ResultData;
import dongovi2020.common.model.united.MemberVO;



/**
 * MemberRestful
 * @author extoller
 * @since 2020.12.16 
 */
@Controller
public class MemberRestful extends BaseRestful {

	private static final Logger logger = LoggerFactory.getLogger(MemberRestful.class);

	@Autowired
	private MemberService memberService;

	/// ===== Teacher Member =====
	
	/**
	 * Member Login
	 * @param request
	 * @param param
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/api/member/loginMember.ajax") 
	public ResponseEntity<Map<String, Object>> memberLogin(HttpServletRequest request, @RequestBody MemberVO param) {
		
		ResultData resultData = new ResultData(param);
		
		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			MemberVO vo = memberService.searchMember(param);
			// password check
			if ( vo != null && vo.getTchrEmpNoId() != null && vo.getUsrPwd() != null && param.getUsrPwd() != null ) {
				String realPwd = vo.getUsrPwd(); 
				String inputPwd = param.getUsrPwd(); 
				if ( realPwd.equals(inputPwd) ) { 
					setSessionLoginMember(request, vo); // session allocation 
					resultData.setLoginMemberKey(vo.getTchrEmpNoId()); // 로그인 후 회원 키 할당
				}
			}
			
			if (vo!=null) { vo.setUsrPwd(null); }

			resultData = new ResultData(true, vo);

		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
		} 
		
		return resultData.getResponseEntity();
	}
	

	/**
	 * 회원 정보 조회 search Member => searchMember
	 * 
	 * @param request
	 * @param param
	 * @return ResponseEntity
	 */
	@ResponseBody
	@RequestMapping(value = "/api/member/searchMember.ajax")
	public ResponseEntity<Map<String, Object>> apiSearchMember(HttpServletRequest request) {
		
		ResultData resultData = new ResultData();
		
		try {
			String loginMemberKey = getSessionMemberKey(request);
			MemberVO param = new MemberVO();
			param.setTchrEmpNoId(loginMemberKey); // 세션에서 crtMbrIdx 가져오기
			
			MemberVO vo = null;
			if ( loginMemberKey != null && loginMemberKey.length() > 0 ) {
				vo = memberService.searchMember(param);
				if (vo!=null) { vo.setUsrPwd(null); }
			}
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
		}
		return resultData.getResponseEntity();
	}
	
	/**
	 * 회원 정보 변경 => modifyMember
	 * 
	 * @param request
	 * @param param
	 * @return ResponseEntity
	 */
	@ResponseBody
	@RequestMapping(value = "/api/member/modifyMember")
	public ResponseEntity<Map<String, Object>> apiModifyMember(HttpServletRequest request, @RequestBody MemberVO param) {

		ResultData resultData = new ResultData();
		
		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);
			
			MemberVO vo = new MemberVO();
			vo.setTchrEmpNoId(loginMemberKey); // 세션에서 crtMbrIdx 가져오기

			if ( loginMemberKey != null && loginMemberKey.length() > 0 ) {
				vo = memberService.searchMember(vo);
				if ( vo != null && param != null ) { 
					param.setTchrEmpNoId(loginMemberKey); // 세션에서 crtMbrIdx 가져오기
					String nowPwd = vo.getUsrPwd(); 
					String checkPwd = param.getUsrPwd();
					// logger.debug(nowPwd);
					// logger.debug(checkPwd);
					if ( nowPwd == null) { nowPwd = ""; }
					if ( checkPwd == null) { checkPwd = ""; }
					if ( nowPwd.equals(checkPwd)) {
						int iResult = memberService.modifyMember(param);
						logger.debug(Integer.toString(iResult));
						
						vo = memberService.searchMember(param);
						vo.setUsrPwd(null);
						resultData = new ResultData(true, vo);
					} else {
						resultData = new ResultData(-1, "비밀번호가 정확하지 않습니다. 확인 후 다시 시도하여 주시기 바랍니다. ", vo);
					}
				}
			}

		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
		}
		return resultData.getResponseEntity();
	}

	/**
	 * 회원 비밀번호 변경 => modifyMemberPassword
	 * 
	 * @param request
	 * @param param
	 * @return ResponseEntity
	 */
	@ResponseBody
	@RequestMapping(value = "/api/member/modifyMemberPassword")
	public ResponseEntity<Map<String, Object>> apiModifyMemberPassword(HttpServletRequest request, @RequestBody MemberVO param) {

		ResultData resultData = new ResultData();
		
		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);
			
			MemberVO vo = new MemberVO();
			vo.setTchrEmpNoId(loginMemberKey); // 세션에서 crtMbrIdx 가져오기

			if ( loginMemberKey != null && loginMemberKey.length() > 0 ) {
				vo = memberService.searchMember(vo);
				if ( vo != null && param != null ) { 
					param.setTchrEmpNoId(loginMemberKey); // 세션에서 crtMbrIdx 가져오기
					String nowPwd = vo.getUsrPwd(); 
					String checkPwd = param.getUsrPwd();
					// logger.debug(nowPwd);
					// logger.debug(checkPwd);
					if ( nowPwd == null) { nowPwd = ""; }
					if ( checkPwd == null) { checkPwd = ""; }
					if ( nowPwd.equals(checkPwd)) {
						param.setUsrPwd(param.getUsrPswdNew()); // 저장할 패스워드로 대치함
						int iResult = memberService.modifyMemberPassword(param);
						logger.debug(Integer.toString(iResult));
						
						vo = memberService.searchMember(param);
						vo.setUsrPwd(null);
						resultData = new ResultData(true, vo);
					} else {
						resultData = new ResultData(-1, "비밀번호가 정확하지 않습니다. 확인 후 다시 시도하여 주시기 바랍니다. ", vo);
					}
				}
			}

		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
		}
		return resultData.getResponseEntity();
	}
	
	/**
	 * 회원 로그아웃 logout
	 * 
	 * @param request
	 * @param param
	 * @return ResponseEntity
	 */
	@ResponseBody
	@PostMapping(value = "/api/member/logoutMember") // , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> apiLogoutMember(HttpServletRequest request) {

		ResultData resultData = new ResultData();
		
		try {
			setSessionLogoutMember(request);
			resultData = new ResultData(true);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
		}
		return resultData.getResponseEntity();
	}
}
