package dongovi2020.base.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import dongovi2020.common.model.united.MemberVO;


@Controller
public class BaseRestful {

	protected static final Logger logger = LoggerFactory.getLogger(BaseRestful.class);

	// ----- properties -----
	protected static final String USER_KEY_NAME = "TCHR_EMP_NO_ID";
	protected static final String USER_INFO_USR_DIV_CD = "USR_DIV_CD";
	protected static final String USER_INFO_TCHR_NK = "TCHR_NK";
	protected static final String USER_INFO_RLY_NM = "RLY_NM";
	protected static final String USER_INFO_TEAM_IDX = "TEAM_IDX";
	protected static final String USER_INFO_TEAM_NM = "TEAM_NM";
	
	protected static final String MSG_S000 = "정상적으로 처리되었습니다.";
	protected static final String MSG_E000 = "처리 중 에러가 발생하였습니다.";

	// ----- session handling ----- 
	
	/**
	 * 세션에서 회원 번호 가져오기; 없을 경우 레슨몬 회원에서 가져오기 시도;
	 * @param request
	 * @return int
	 */
	protected String getSessionMemberKey(HttpServletRequest request) {
		String memberKey = null; 
		try {
			memberKey = (String)request.getSession().getAttribute(BaseRestful.USER_KEY_NAME);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			e = null; 
		}
		return memberKey;
	}

	/**
	 * 세션에서 회원 정보 가져오기
	 * @param request
	 * @return MemberVO
	 */
	protected MemberVO getSessionLoginMember(HttpServletRequest request) {
		MemberVO vo = null; 
		try {
			vo = new MemberVO();
			vo.setTchrEmpNoId((String)request.getSession().getAttribute(BaseRestful.USER_KEY_NAME));
			vo.setUsrDivCd((String)request.getSession().getAttribute(BaseRestful.USER_INFO_USR_DIV_CD));
			vo.setTchrNk((String)request.getSession().getAttribute(BaseRestful.USER_INFO_TCHR_NK));
			vo.setRlyNm((String)request.getSession().getAttribute(BaseRestful.USER_INFO_RLY_NM));
			vo.setTeamIdx((Integer)request.getSession().getAttribute(BaseRestful.USER_INFO_TEAM_IDX));
			// vo.setTeamNm((String)request.getSession().getAttribute(BaseRestful.USER_INFO_TEAM_NM));
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			e = null; 
		}
		return vo;
	}
	
	/**
	 * 세션에 회원 정보 설정하기
	 * @param request
	 * @return
	 */
	protected void setSessionLoginMember(HttpServletRequest request, MemberVO vo) {
 
		try {
			if ( vo == null ) {
				vo = new MemberVO();
			}
			
			HttpSession session = request.getSession();
			
			session.setAttribute(BaseRestful.USER_KEY_NAME, vo.getTchrEmpNoId());
			session.setAttribute(BaseRestful.USER_INFO_USR_DIV_CD, vo.getUsrDivCd());
			session.setAttribute(BaseRestful.USER_INFO_TCHR_NK, vo.getTchrNk());
			session.setAttribute(BaseRestful.USER_INFO_RLY_NM, vo.getRlyNm());
			session.setAttribute(BaseRestful.USER_INFO_TEAM_IDX, vo.getTeamIdx());
			session.setAttribute(BaseRestful.USER_INFO_TEAM_NM, ""); // vo.getTeamNm()

		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			e = null; 
		} finally {
			vo = null;
		}
	}

	/**
	 * 세션에 회원 정보 삭제하기 
	 * @param request
	 * @return
	 */
	protected void setSessionLogoutMember(HttpServletRequest request) {
 
		try {
			HttpSession session = request.getSession();
			session.removeAttribute(BaseRestful.USER_KEY_NAME);
			session.removeAttribute(BaseRestful.USER_INFO_USR_DIV_CD);
			session.removeAttribute(BaseRestful.USER_INFO_TCHR_NK);
			session.removeAttribute(BaseRestful.USER_INFO_RLY_NM);
			session.removeAttribute(BaseRestful.USER_INFO_TEAM_NM);
			// session.invalidate(); // 모든 세션 정보 삭제
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			e = null; 
		}
	}

	// ----- / session handling ----- 
	

}
