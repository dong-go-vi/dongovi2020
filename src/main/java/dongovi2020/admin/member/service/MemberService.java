package dongovi2020.admin.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dongovi2020.admin.member.dao.MemberDao;
import dongovi2020.common.model.united.MemberVO;

/**
 * MemberService
 * @author extoller
 * @since 2020.12.16 
 */
@Service
public class MemberService {


	/** */
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

	@Autowired
	private MemberDao memberDao;
	
	
	/**
	 * search Member(Teacher) => selectMember
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MemberVO searchMember(MemberVO param) throws Exception {
		return memberDao.selectMember(param);
	}
	
	/**
	 * modify Member(Teacher) => updateMember
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyMember(MemberVO model) throws Exception {
		return memberDao.updateMember(model);
	}

	public int modifyMemberPassword(MemberVO param) {
		// TODO Auto-generated method stub
		return 0;
	}

}
