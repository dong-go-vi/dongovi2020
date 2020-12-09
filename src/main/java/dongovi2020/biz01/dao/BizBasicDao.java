package dongovi2020.biz01.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import dongovi2020.base.common.BaseDao;

import dongovi2020.common.model.extend.CommonCodeVO;
import dongovi2020.common.model.extend.LectureFeePayAddDetailVO;
import dongovi2020.common.model.extend.LectureFeePayVO;
import dongovi2020.common.model.extend.LessonAreaVO;
import dongovi2020.common.model.extend.LessonFormVO;
import dongovi2020.common.model.extend.LessonPlaceVO;
import dongovi2020.common.model.extend.LessonStudentConstitueVO;
import dongovi2020.common.model.extend.LessonStudentTuitionDepositVO;
import dongovi2020.common.model.extend.LessonTrunVO;
import dongovi2020.common.model.extend.LessonTurnStudentPaticipationVO;
import dongovi2020.common.model.extend.LessonVO;
import dongovi2020.common.model.extend.MenuAccessLogVO;
import dongovi2020.common.model.extend.MenuAuthVO;
import dongovi2020.common.model.extend.MenuVO;
import dongovi2020.common.model.extend.MessageSendVO;
import dongovi2020.common.model.extend.StudentVO;
import dongovi2020.common.model.extend.SystemLoginLogVO;
import dongovi2020.common.model.extend.SystemUserVO;
import dongovi2020.common.model.extend.TeacherLectureFeeVO;
import dongovi2020.common.model.extend.TeacherVO;
import dongovi2020.common.model.extend.TeamVO;
import dongovi2020.common.model.extend.UnpaidSendVO;


/**
 * BizBasicDao
 * @author tata creator
 * @since 2020.12.05 
 */
@Repository
public class BizBasicDao extends BaseDao {

	/// ===== CommonCode ===== =======================================================================

	/**
	 * selectCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public CommonCodeVO selectCommonCode(CommonCodeVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectCommonCode", param);
	}

	/**
	 * selectCommonCodeList => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<CommonCodeVO> selectCommonCodeList(CommonCodeVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectCommonCodeList", param);
	}

	/**
	 * selectCommonCodeListCount => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectCommonCodeListCount(CommonCodeVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectCommonCodeListCount", param);
	}

	/**
	 * insertCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertCommonCode(CommonCodeVO model) throws Exception {
		return sqlSession.insert("dongovi2020.biz01.dao.insertCommonCode", model);

	}

	/**
	 * updateCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateCommonCode(CommonCodeVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateCommonCode", model);
	}

	/**
	 * deleteCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteCommonCode(CommonCodeVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteCommonCode", model);
	}

	/// ===== Lesson ===== =======================================================================

	/**
	 * selectLesson => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonVO selectLesson(LessonVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLesson", param);
	}

	/**
	 * selectLessonList => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonVO> selectLessonList(LessonVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonList", param);
	}

	/**
	 * selectLessonListCount => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonListCount(LessonVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonListCount", param);
	}

	/**
	 * insertLesson => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLesson(LessonVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLesson", model);
		return model.getLsnIdx();

	}

	/**
	 * updateLesson => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLesson(LessonVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLesson", model);
	}

	/**
	 * deleteLesson => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLesson(LessonVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLesson", model);
	}

	/// ===== LessonArea ===== =======================================================================

	/**
	 * selectLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonAreaVO selectLessonArea(LessonAreaVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonArea", param);
	}

	/**
	 * selectLessonAreaList => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonAreaVO> selectLessonAreaList(LessonAreaVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonAreaList", param);
	}

	/**
	 * selectLessonAreaListCount => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonAreaListCount(LessonAreaVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonAreaListCount", param);
	}

	/**
	 * insertLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonArea(LessonAreaVO model) throws Exception {
		return sqlSession.insert("dongovi2020.biz01.dao.insertLessonArea", model);

	}

	/**
	 * updateLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonArea(LessonAreaVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonArea", model);
	}

	/**
	 * deleteLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonArea(LessonAreaVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonArea", model);
	}

	/// ===== LessonForm ===== =======================================================================

	/**
	 * selectLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonFormVO selectLessonForm(LessonFormVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonForm", param);
	}

	/**
	 * selectLessonFormList => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonFormVO> selectLessonFormList(LessonFormVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonFormList", param);
	}

	/**
	 * selectLessonFormListCount => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonFormListCount(LessonFormVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonFormListCount", param);
	}

	/**
	 * insertLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonForm(LessonFormVO model) throws Exception {
		return sqlSession.insert("dongovi2020.biz01.dao.insertLessonForm", model);

	}

	/**
	 * updateLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonForm(LessonFormVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonForm", model);
	}

	/**
	 * deleteLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonForm(LessonFormVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonForm", model);
	}

	/// ===== LessonPlace ===== =======================================================================

	/**
	 * selectLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonPlaceVO selectLessonPlace(LessonPlaceVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonPlace", param);
	}

	/**
	 * selectLessonPlaceList => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonPlaceVO> selectLessonPlaceList(LessonPlaceVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonPlaceList", param);
	}

	/**
	 * selectLessonPlaceListCount => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonPlaceListCount(LessonPlaceVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonPlaceListCount", param);
	}

	/**
	 * insertLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonPlace(LessonPlaceVO model) throws Exception {
		return sqlSession.insert("dongovi2020.biz01.dao.insertLessonPlace", model);

	}

	/**
	 * updateLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonPlace(LessonPlaceVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonPlace", model);
	}

	/**
	 * deleteLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonPlace(LessonPlaceVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonPlace", model);
	}

	/// ===== LessonStudentConstitue ===== =======================================================================

	/**
	 * selectLessonStudentConstitue => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonStudentConstitueVO selectLessonStudentConstitue(LessonStudentConstitueVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonStudentConstitue", param);
	}

	/**
	 * selectLessonStudentConstitueList => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonStudentConstitueVO> selectLessonStudentConstitueList(LessonStudentConstitueVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonStudentConstitueList", param);
	}

	/**
	 * selectLessonStudentConstitueListCount => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonStudentConstitueListCount(LessonStudentConstitueVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonStudentConstitueListCount", param);
	}

	/**
	 * insertLessonStudentConstitue => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLessonStudentConstitue", model);
		return model.getLsnStdntCsttIdx();

	}

	/**
	 * updateLessonStudentConstitue => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonStudentConstitue", model);
	}

	/**
	 * deleteLessonStudentConstitue => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonStudentConstitue", model);
	}

	/// ===== LessonStudentTuitionDeposit ===== =======================================================================

	/**
	 * selectLessonStudentTuitionDeposit => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonStudentTuitionDepositVO selectLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonStudentTuitionDeposit", param);
	}

	/**
	 * selectLessonStudentTuitionDepositList => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonStudentTuitionDepositVO> selectLessonStudentTuitionDepositList(LessonStudentTuitionDepositVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonStudentTuitionDepositList", param);
	}

	/**
	 * selectLessonStudentTuitionDepositListCount => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonStudentTuitionDepositListCount(LessonStudentTuitionDepositVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonStudentTuitionDepositListCount", param);
	}

	/**
	 * insertLessonStudentTuitionDeposit => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLessonStudentTuitionDeposit", model);
		return model.getLsnStdntTtnDpstIdx();

	}

	/**
	 * updateLessonStudentTuitionDeposit => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonStudentTuitionDeposit", model);
	}

	/**
	 * deleteLessonStudentTuitionDeposit => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonStudentTuitionDeposit", model);
	}

	/// ===== LessonTrun ===== =======================================================================

	/**
	 * selectLessonTrun => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonTrunVO selectLessonTrun(LessonTrunVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonTrun", param);
	}

	/**
	 * selectLessonTrunList => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonTrunVO> selectLessonTrunList(LessonTrunVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonTrunList", param);
	}

	/**
	 * selectLessonTrunListCount => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonTrunListCount(LessonTrunVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonTrunListCount", param);
	}

	/**
	 * insertLessonTrun => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonTrun(LessonTrunVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLessonTrun", model);
		return model.getLsnTrnIdx();

	}

	/**
	 * updateLessonTrun => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonTrun(LessonTrunVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonTrun", model);
	}

	/**
	 * deleteLessonTrun => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonTrun(LessonTrunVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonTrun", model);
	}

	/// ===== LessonTurnStudentPaticipation ===== =======================================================================

	/**
	 * selectLessonTurnStudentPaticipation => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonTurnStudentPaticipationVO selectLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonTurnStudentPaticipation", param);
	}

	/**
	 * selectLessonTurnStudentPaticipationList => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonTurnStudentPaticipationVO> selectLessonTurnStudentPaticipationList(LessonTurnStudentPaticipationVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLessonTurnStudentPaticipationList", param);
	}

	/**
	 * selectLessonTurnStudentPaticipationListCount => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonTurnStudentPaticipationListCount(LessonTurnStudentPaticipationVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLessonTurnStudentPaticipationListCount", param);
	}

	/**
	 * insertLessonTurnStudentPaticipation => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLessonTurnStudentPaticipation", model);
		return model.getLsnTrnStdntPtcptIdx();

	}

	/**
	 * updateLessonTurnStudentPaticipation => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLessonTurnStudentPaticipation", model);
	}

	/**
	 * deleteLessonTurnStudentPaticipation => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLessonTurnStudentPaticipation", model);
	}

	/// ===== LectureFeePay ===== =======================================================================

	/**
	 * selectLectureFeePay => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LectureFeePayVO selectLectureFeePay(LectureFeePayVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLectureFeePay", param);
	}

	/**
	 * selectLectureFeePayList => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LectureFeePayVO> selectLectureFeePayList(LectureFeePayVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLectureFeePayList", param);
	}

	/**
	 * selectLectureFeePayListCount => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLectureFeePayListCount(LectureFeePayVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLectureFeePayListCount", param);
	}

	/**
	 * insertLectureFeePay => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLectureFeePay(LectureFeePayVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLectureFeePay", model);
		return model.getLtrFeePayIdx();

	}

	/**
	 * updateLectureFeePay => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLectureFeePay(LectureFeePayVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLectureFeePay", model);
	}

	/**
	 * deleteLectureFeePay => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLectureFeePay(LectureFeePayVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLectureFeePay", model);
	}

	/// ===== LectureFeePayAddDetail ===== =======================================================================

	/**
	 * selectLectureFeePayAddDetail => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LectureFeePayAddDetailVO selectLectureFeePayAddDetail(LectureFeePayAddDetailVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLectureFeePayAddDetail", param);
	}

	/**
	 * selectLectureFeePayAddDetailList => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LectureFeePayAddDetailVO> selectLectureFeePayAddDetailList(LectureFeePayAddDetailVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectLectureFeePayAddDetailList", param);
	}

	/**
	 * selectLectureFeePayAddDetailListCount => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLectureFeePayAddDetailListCount(LectureFeePayAddDetailVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectLectureFeePayAddDetailListCount", param);
	}

	/**
	 * insertLectureFeePayAddDetail => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertLectureFeePayAddDetail", model);
		return model.getLtrFeePayAddDtlIdx();

	}

	/**
	 * updateLectureFeePayAddDetail => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateLectureFeePayAddDetail", model);
	}

	/**
	 * deleteLectureFeePayAddDetail => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteLectureFeePayAddDetail", model);
	}

	/// ===== Menu ===== =======================================================================

	/**
	 * selectMenu => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MenuVO selectMenu(MenuVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMenu", param);
	}

	/**
	 * selectMenuList => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuVO> selectMenuList(MenuVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectMenuList", param);
	}

	/**
	 * selectMenuListCount => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMenuListCount(MenuVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMenuListCount", param);
	}

	/**
	 * insertMenu => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMenu(MenuVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertMenu", model);
		return model.getMnuIdx();

	}

	/**
	 * updateMenu => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateMenu(MenuVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateMenu", model);
	}

	/**
	 * deleteMenu => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMenu(MenuVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteMenu", model);
	}

	/// ===== MenuAccessLog ===== =======================================================================

	/**
	 * selectMenuAccessLog => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MenuAccessLogVO selectMenuAccessLog(MenuAccessLogVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMenuAccessLog", param);
	}

	/**
	 * selectMenuAccessLogList => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuAccessLogVO> selectMenuAccessLogList(MenuAccessLogVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectMenuAccessLogList", param);
	}

	/**
	 * selectMenuAccessLogListCount => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMenuAccessLogListCount(MenuAccessLogVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMenuAccessLogListCount", param);
	}

	/**
	 * insertMenuAccessLog => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMenuAccessLog(MenuAccessLogVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertMenuAccessLog", model);
		return model.getIdx();

	}

	/**
	 * updateMenuAccessLog => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateMenuAccessLog(MenuAccessLogVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateMenuAccessLog", model);
	}

	/**
	 * deleteMenuAccessLog => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMenuAccessLog(MenuAccessLogVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteMenuAccessLog", model);
	}

	/// ===== MenuAuth ===== =======================================================================

	/**
	 * selectMenuAuth => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MenuAuthVO selectMenuAuth(MenuAuthVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMenuAuth", param);
	}

	/**
	 * selectMenuAuthList => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuAuthVO> selectMenuAuthList(MenuAuthVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectMenuAuthList", param);
	}

	/**
	 * selectMenuAuthListCount => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMenuAuthListCount(MenuAuthVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMenuAuthListCount", param);
	}

	/**
	 * insertMenuAuth => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMenuAuth(MenuAuthVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertMenuAuth", model);
		return model.getMnuAthIdx();

	}

	/**
	 * updateMenuAuth => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateMenuAuth(MenuAuthVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateMenuAuth", model);
	}

	/**
	 * deleteMenuAuth => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMenuAuth(MenuAuthVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteMenuAuth", model);
	}

	/// ===== MessageSend ===== =======================================================================

	/**
	 * selectMessageSend => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MessageSendVO selectMessageSend(MessageSendVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMessageSend", param);
	}

	/**
	 * selectMessageSendList => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MessageSendVO> selectMessageSendList(MessageSendVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectMessageSendList", param);
	}

	/**
	 * selectMessageSendListCount => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMessageSendListCount(MessageSendVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectMessageSendListCount", param);
	}

	/**
	 * insertMessageSend => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMessageSend(MessageSendVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertMessageSend", model);
		return model.getMsgSndIdx();

	}

	/**
	 * updateMessageSend => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateMessageSend(MessageSendVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateMessageSend", model);
	}

	/**
	 * deleteMessageSend => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMessageSend(MessageSendVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteMessageSend", model);
	}

	/// ===== Student ===== =======================================================================

	/**
	 * selectStudent => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public StudentVO selectStudent(StudentVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectStudent", param);
	}

	/**
	 * selectStudentList => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<StudentVO> selectStudentList(StudentVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectStudentList", param);
	}

	/**
	 * selectStudentListCount => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectStudentListCount(StudentVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectStudentListCount", param);
	}

	/**
	 * insertStudent => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertStudent(StudentVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertStudent", model);
		return model.getStdntIdx();

	}

	/**
	 * updateStudent => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateStudent(StudentVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateStudent", model);
	}

	/**
	 * deleteStudent => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteStudent(StudentVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteStudent", model);
	}

	/// ===== SystemLoginLog ===== =======================================================================

	/**
	 * selectSystemLoginLog => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SystemLoginLogVO selectSystemLoginLog(SystemLoginLogVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectSystemLoginLog", param);
	}

	/**
	 * selectSystemLoginLogList => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<SystemLoginLogVO> selectSystemLoginLogList(SystemLoginLogVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectSystemLoginLogList", param);
	}

	/**
	 * selectSystemLoginLogListCount => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectSystemLoginLogListCount(SystemLoginLogVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectSystemLoginLogListCount", param);
	}

	/**
	 * insertSystemLoginLog => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertSystemLoginLog(SystemLoginLogVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertSystemLoginLog", model);
		return model.getIdx();

	}

	/**
	 * updateSystemLoginLog => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateSystemLoginLog(SystemLoginLogVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateSystemLoginLog", model);
	}

	/**
	 * deleteSystemLoginLog => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteSystemLoginLog(SystemLoginLogVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteSystemLoginLog", model);
	}

	/// ===== SystemUser ===== =======================================================================

	/**
	 * selectSystemUser => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SystemUserVO selectSystemUser(SystemUserVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectSystemUser", param);
	}

	/**
	 * selectSystemUserList => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<SystemUserVO> selectSystemUserList(SystemUserVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectSystemUserList", param);
	}

	/**
	 * selectSystemUserListCount => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectSystemUserListCount(SystemUserVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectSystemUserListCount", param);
	}

	/**
	 * insertSystemUser => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertSystemUser(SystemUserVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertSystemUser", model);
		return model.getUsrIdx();

	}

	/**
	 * updateSystemUser => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateSystemUser(SystemUserVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateSystemUser", model);
	}

	/**
	 * deleteSystemUser => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteSystemUser(SystemUserVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteSystemUser", model);
	}

	/// ===== Teacher ===== =======================================================================

	/**
	 * selectTeacher => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TeacherVO selectTeacher(TeacherVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectTeacher", param);
	}

	/**
	 * selectTeacherList => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeacherVO> selectTeacherList(TeacherVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectTeacherList", param);
	}

	/**
	 * selectTeacherListCount => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectTeacherListCount(TeacherVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectTeacherListCount", param);
	}

	/**
	 * insertTeacher => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertTeacher(TeacherVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertTeacher", model);
		return model.getTchrIdx();

	}

	/**
	 * updateTeacher => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateTeacher(TeacherVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateTeacher", model);
	}

	/**
	 * deleteTeacher => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteTeacher(TeacherVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteTeacher", model);
	}

	/// ===== TeacherLectureFee ===== =======================================================================

	/**
	 * selectTeacherLectureFee => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TeacherLectureFeeVO selectTeacherLectureFee(TeacherLectureFeeVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectTeacherLectureFee", param);
	}

	/**
	 * selectTeacherLectureFeeList => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeacherLectureFeeVO> selectTeacherLectureFeeList(TeacherLectureFeeVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectTeacherLectureFeeList", param);
	}

	/**
	 * selectTeacherLectureFeeListCount => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectTeacherLectureFeeListCount(TeacherLectureFeeVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectTeacherLectureFeeListCount", param);
	}

	/**
	 * insertTeacherLectureFee => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertTeacherLectureFee", model);
		return model.getTchrLtrFeeIdx();

	}

	/**
	 * updateTeacherLectureFee => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateTeacherLectureFee", model);
	}

	/**
	 * deleteTeacherLectureFee => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteTeacherLectureFee", model);
	}

	/// ===== Team ===== =======================================================================

	/**
	 * selectTeam => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TeamVO selectTeam(TeamVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectTeam", param);
	}

	/**
	 * selectTeamList => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeamVO> selectTeamList(TeamVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectTeamList", param);
	}

	/**
	 * selectTeamListCount => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectTeamListCount(TeamVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectTeamListCount", param);
	}

	/**
	 * insertTeam => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertTeam(TeamVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertTeam", model);
		return model.getTeamIdx();

	}

	/**
	 * updateTeam => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateTeam(TeamVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateTeam", model);
	}

	/**
	 * deleteTeam => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteTeam(TeamVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteTeam", model);
	}

	/// ===== UnpaidSend ===== =======================================================================

	/**
	 * selectUnpaidSend => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public UnpaidSendVO selectUnpaidSend(UnpaidSendVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectUnpaidSend", param);
	}

	/**
	 * selectUnpaidSendList => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<UnpaidSendVO> selectUnpaidSendList(UnpaidSendVO param) throws Exception {
		return sqlSession.selectList("dongovi2020.biz01.dao.selectUnpaidSendList", param);
	}

	/**
	 * selectUnpaidSendListCount => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectUnpaidSendListCount(UnpaidSendVO param) throws Exception {
		return sqlSession.selectOne("dongovi2020.biz01.dao.selectUnpaidSendListCount", param);
	}

	/**
	 * insertUnpaidSend => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertUnpaidSend(UnpaidSendVO model) throws Exception {
		sqlSession.insert("dongovi2020.biz01.dao.insertUnpaidSend", model);
		return model.getUnpdSndIdx();

	}

	/**
	 * updateUnpaidSend => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateUnpaidSend(UnpaidSendVO model) throws Exception {
		return sqlSession.update("dongovi2020.biz01.dao.updateUnpaidSend", model);
	}

	/**
	 * deleteUnpaidSend => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteUnpaidSend(UnpaidSendVO model) throws Exception {
		return sqlSession.delete("dongovi2020.biz01.dao.deleteUnpaidSend", model);
	}



}
