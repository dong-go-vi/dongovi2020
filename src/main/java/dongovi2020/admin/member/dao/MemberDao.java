package dongovi2020.admin.member.dao;

import org.springframework.stereotype.Repository;

import dongovi2020.base.common.BaseDao;
import dongovi2020.common.model.united.MemberVO;


/**
 * MemberDao
 * @author extoller
 * @since 2020.12.16 
 */
@Repository
public class MemberDao extends BaseDao {

	/// ===== Member ===== =======================================================================

	/**
	 * selectMember => 테이블: TB_TCHR - Member | 교사
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MemberVO selectMember(MemberVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.admin.member.dao.selectTeacher", param);
	}


	/**
	 * updateMember => 테이블: TB_TCHR - Member | 교사
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateMember(MemberVO model) throws Exception {
		return sqlSession.update("dongovi2020.admin.member.dao.updateTeacher", model);
	}


}
