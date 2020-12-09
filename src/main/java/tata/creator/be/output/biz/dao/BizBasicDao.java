package tata.creator.be.output.biz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import dongovi2020.base.common.BaseDao;

import tata.creator.be.output.common.model.extend.CommonCodeVO;
import tata.creator.be.output.common.model.extend.LessonVO;
import tata.creator.be.output.common.model.extend.LessonAreaVO;
import tata.creator.be.output.common.model.extend.LessonFormVO;
import tata.creator.be.output.common.model.extend.LessonPlaceVO;
import tata.creator.be.output.common.model.extend.LessonStudentConstitueVO;
import tata.creator.be.output.common.model.extend.LessonStudentTuitionDepositVO;
import tata.creator.be.output.common.model.extend.LessonTrunVO;
import tata.creator.be.output.common.model.extend.LessonTurnStudentPaticipationVO;
import tata.creator.be.output.common.model.extend.LectureFeePayVO;
import tata.creator.be.output.common.model.extend.LectureFeePayAddDetailVO;
import tata.creator.be.output.common.model.extend.MenuVO;
import tata.creator.be.output.common.model.extend.MenuAccessLogVO;
import tata.creator.be.output.common.model.extend.MenuAuthVO;
import tata.creator.be.output.common.model.extend.MessageSendVO;
import tata.creator.be.output.common.model.extend.StudentVO;
import tata.creator.be.output.common.model.extend.SystemLoginLogVO;
import tata.creator.be.output.common.model.extend.SystemUserVO;
import tata.creator.be.output.common.model.extend.TeacherVO;
import tata.creator.be.output.common.model.extend.TeacherLectureFeeVO;
import tata.creator.be.output.common.model.extend.TeamVO;
import tata.creator.be.output.common.model.extend.UnpaidSendVO;


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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectCommonCode", param);
	}

	/**
	 * selectCommonCodeList => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<CommonCodeVO> selectCommonCodeList(CommonCodeVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectCommonCodeList", param);
	}

	/**
	 * selectCommonCodeListCount => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectCommonCodeListCount(CommonCodeVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectCommonCodeListCount", param);
	}

	/**
	 * insertCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertCommonCode(CommonCodeVO model) throws Exception {
		return sqlSession.insert("tata.creator.be.output.common.mapper.insertCommonCode", model);

	}

	/**
	 * updateCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateCommonCode(CommonCodeVO model) throws Exception {
		return sqlSession.update("tata.creator.be.output.common.mapper.updateCommonCode", model);
	}

	/**
	 * deleteCommonCode => 테이블: TB_CMN_CD - CommonCode | 공통 코드
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteCommonCode(CommonCodeVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteCommonCode", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLesson", param);
	}

	/**
	 * selectLessonList => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonVO> selectLessonList(LessonVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonList", param);
	}

	/**
	 * selectLessonListCount => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonListCount(LessonVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonListCount", param);
	}

	/**
	 * insertLesson => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLesson(LessonVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLesson", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLesson", model);
	}

	/**
	 * deleteLesson => 테이블: TB_LSN - Lesson  | 수업
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLesson(LessonVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLesson", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonArea", param);
	}

	/**
	 * selectLessonAreaList => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonAreaVO> selectLessonAreaList(LessonAreaVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonAreaList", param);
	}

	/**
	 * selectLessonAreaListCount => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonAreaListCount(LessonAreaVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonAreaListCount", param);
	}

	/**
	 * insertLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonArea(LessonAreaVO model) throws Exception {
		return sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonArea", model);

	}

	/**
	 * updateLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonArea(LessonAreaVO model) throws Exception {
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonArea", model);
	}

	/**
	 * deleteLessonArea => 테이블: TB_LSN_ARA - LessonArea | 수업 지역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonArea(LessonAreaVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonArea", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonForm", param);
	}

	/**
	 * selectLessonFormList => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonFormVO> selectLessonFormList(LessonFormVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonFormList", param);
	}

	/**
	 * selectLessonFormListCount => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonFormListCount(LessonFormVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonFormListCount", param);
	}

	/**
	 * insertLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonForm(LessonFormVO model) throws Exception {
		return sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonForm", model);

	}

	/**
	 * updateLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonForm(LessonFormVO model) throws Exception {
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonForm", model);
	}

	/**
	 * deleteLessonForm => 테이블: TB_LSN_FRM - LessonForm | 수업 형태
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonForm(LessonFormVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonForm", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonPlace", param);
	}

	/**
	 * selectLessonPlaceList => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonPlaceVO> selectLessonPlaceList(LessonPlaceVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonPlaceList", param);
	}

	/**
	 * selectLessonPlaceListCount => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonPlaceListCount(LessonPlaceVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonPlaceListCount", param);
	}

	/**
	 * insertLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonPlace(LessonPlaceVO model) throws Exception {
		return sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonPlace", model);

	}

	/**
	 * updateLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int updateLessonPlace(LessonPlaceVO model) throws Exception {
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonPlace", model);
	}

	/**
	 * deleteLessonPlace => 테이블: TB_LSN_PLC - LessonPlace | 수업 장소
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonPlace(LessonPlaceVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonPlace", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonStudentConstitue", param);
	}

	/**
	 * selectLessonStudentConstitueList => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonStudentConstitueVO> selectLessonStudentConstitueList(LessonStudentConstitueVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonStudentConstitueList", param);
	}

	/**
	 * selectLessonStudentConstitueListCount => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonStudentConstitueListCount(LessonStudentConstitueVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonStudentConstitueListCount", param);
	}

	/**
	 * insertLessonStudentConstitue => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonStudentConstitue", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonStudentConstitue", model);
	}

	/**
	 * deleteLessonStudentConstitue => 테이블: TB_LSN_STDNT_CSTT - LessonStudentConstitue | 수업 학생 구성
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonStudentConstitue", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonStudentTuitionDeposit", param);
	}

	/**
	 * selectLessonStudentTuitionDepositList => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonStudentTuitionDepositVO> selectLessonStudentTuitionDepositList(LessonStudentTuitionDepositVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonStudentTuitionDepositList", param);
	}

	/**
	 * selectLessonStudentTuitionDepositListCount => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonStudentTuitionDepositListCount(LessonStudentTuitionDepositVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonStudentTuitionDepositListCount", param);
	}

	/**
	 * insertLessonStudentTuitionDeposit => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonStudentTuitionDeposit", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonStudentTuitionDeposit", model);
	}

	/**
	 * deleteLessonStudentTuitionDeposit => 테이블: TB_LSN_STDNT_TTN_DPST - LessonStudentTuitionDeposit | 수업 학생 수강료 입금
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonStudentTuitionDeposit", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonTrun", param);
	}

	/**
	 * selectLessonTrunList => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonTrunVO> selectLessonTrunList(LessonTrunVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonTrunList", param);
	}

	/**
	 * selectLessonTrunListCount => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonTrunListCount(LessonTrunVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonTrunListCount", param);
	}

	/**
	 * insertLessonTrun => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonTrun(LessonTrunVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonTrun", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonTrun", model);
	}

	/**
	 * deleteLessonTrun => 테이블: TB_LSN_TRN - LessonTrun | 수업 회차
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonTrun(LessonTrunVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonTrun", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonTurnStudentPaticipation", param);
	}

	/**
	 * selectLessonTurnStudentPaticipationList => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonTurnStudentPaticipationVO> selectLessonTurnStudentPaticipationList(LessonTurnStudentPaticipationVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLessonTurnStudentPaticipationList", param);
	}

	/**
	 * selectLessonTurnStudentPaticipationListCount => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLessonTurnStudentPaticipationListCount(LessonTurnStudentPaticipationVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLessonTurnStudentPaticipationListCount", param);
	}

	/**
	 * insertLessonTurnStudentPaticipation => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLessonTurnStudentPaticipation", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLessonTurnStudentPaticipation", model);
	}

	/**
	 * deleteLessonTurnStudentPaticipation => 테이블: TB_LSN_TRN_STDNT_PTCPT - LessonTurnStudentPaticipation | 수업 회차 학생 참여
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLessonTurnStudentPaticipation", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLectureFeePay", param);
	}

	/**
	 * selectLectureFeePayList => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LectureFeePayVO> selectLectureFeePayList(LectureFeePayVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLectureFeePayList", param);
	}

	/**
	 * selectLectureFeePayListCount => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLectureFeePayListCount(LectureFeePayVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLectureFeePayListCount", param);
	}

	/**
	 * insertLectureFeePay => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLectureFeePay(LectureFeePayVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLectureFeePay", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLectureFeePay", model);
	}

	/**
	 * deleteLectureFeePay => 테이블: TB_LTR_FEE_PAY - LectureFeePay | 강의료 지급
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLectureFeePay(LectureFeePayVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLectureFeePay", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLectureFeePayAddDetail", param);
	}

	/**
	 * selectLectureFeePayAddDetailList => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LectureFeePayAddDetailVO> selectLectureFeePayAddDetailList(LectureFeePayAddDetailVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectLectureFeePayAddDetailList", param);
	}

	/**
	 * selectLectureFeePayAddDetailListCount => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectLectureFeePayAddDetailListCount(LectureFeePayAddDetailVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectLectureFeePayAddDetailListCount", param);
	}

	/**
	 * insertLectureFeePayAddDetail => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertLectureFeePayAddDetail", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateLectureFeePayAddDetail", model);
	}

	/**
	 * deleteLectureFeePayAddDetail => 테이블: TB_LTR_FEE_PAY_ADD_DTL - LectureFeePayAddDetail | 강의료 지급 추가 내역
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteLectureFeePayAddDetail", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMenu", param);
	}

	/**
	 * selectMenuList => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuVO> selectMenuList(MenuVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectMenuList", param);
	}

	/**
	 * selectMenuListCount => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMenuListCount(MenuVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMenuListCount", param);
	}

	/**
	 * insertMenu => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMenu(MenuVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertMenu", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateMenu", model);
	}

	/**
	 * deleteMenu => 테이블: TB_MNU - Menu | 메뉴
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMenu(MenuVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteMenu", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMenuAccessLog", param);
	}

	/**
	 * selectMenuAccessLogList => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuAccessLogVO> selectMenuAccessLogList(MenuAccessLogVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectMenuAccessLogList", param);
	}

	/**
	 * selectMenuAccessLogListCount => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMenuAccessLogListCount(MenuAccessLogVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMenuAccessLogListCount", param);
	}

	/**
	 * insertMenuAccessLog => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMenuAccessLog(MenuAccessLogVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertMenuAccessLog", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateMenuAccessLog", model);
	}

	/**
	 * deleteMenuAccessLog => 테이블: TB_MNU_ACS_LOG - MenuAccessLog | 메뉴 접근 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMenuAccessLog(MenuAccessLogVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteMenuAccessLog", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMenuAuth", param);
	}

	/**
	 * selectMenuAuthList => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuAuthVO> selectMenuAuthList(MenuAuthVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectMenuAuthList", param);
	}

	/**
	 * selectMenuAuthListCount => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMenuAuthListCount(MenuAuthVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMenuAuthListCount", param);
	}

	/**
	 * insertMenuAuth => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMenuAuth(MenuAuthVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertMenuAuth", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateMenuAuth", model);
	}

	/**
	 * deleteMenuAuth => 테이블: TB_MNU_ATH - MenuAuth | 메뉴 권한
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMenuAuth(MenuAuthVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteMenuAuth", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMessageSend", param);
	}

	/**
	 * selectMessageSendList => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MessageSendVO> selectMessageSendList(MessageSendVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectMessageSendList", param);
	}

	/**
	 * selectMessageSendListCount => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectMessageSendListCount(MessageSendVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectMessageSendListCount", param);
	}

	/**
	 * insertMessageSend => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertMessageSend(MessageSendVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertMessageSend", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateMessageSend", model);
	}

	/**
	 * deleteMessageSend => 테이블: TB_MSG_SND - MessageSend | 메세지 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteMessageSend(MessageSendVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteMessageSend", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectStudent", param);
	}

	/**
	 * selectStudentList => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<StudentVO> selectStudentList(StudentVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectStudentList", param);
	}

	/**
	 * selectStudentListCount => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectStudentListCount(StudentVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectStudentListCount", param);
	}

	/**
	 * insertStudent => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertStudent(StudentVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertStudent", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateStudent", model);
	}

	/**
	 * deleteStudent => 테이블: TB_STDNT - Student | 학생
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteStudent(StudentVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteStudent", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectSystemLoginLog", param);
	}

	/**
	 * selectSystemLoginLogList => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<SystemLoginLogVO> selectSystemLoginLogList(SystemLoginLogVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectSystemLoginLogList", param);
	}

	/**
	 * selectSystemLoginLogListCount => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectSystemLoginLogListCount(SystemLoginLogVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectSystemLoginLogListCount", param);
	}

	/**
	 * insertSystemLoginLog => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertSystemLoginLog(SystemLoginLogVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertSystemLoginLog", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateSystemLoginLog", model);
	}

	/**
	 * deleteSystemLoginLog => 테이블: TB_SYS_LGN_LOG - SystemLoginLog | 시스템 로그인 로그
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteSystemLoginLog(SystemLoginLogVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteSystemLoginLog", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectSystemUser", param);
	}

	/**
	 * selectSystemUserList => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<SystemUserVO> selectSystemUserList(SystemUserVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectSystemUserList", param);
	}

	/**
	 * selectSystemUserListCount => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectSystemUserListCount(SystemUserVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectSystemUserListCount", param);
	}

	/**
	 * insertSystemUser => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertSystemUser(SystemUserVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertSystemUser", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateSystemUser", model);
	}

	/**
	 * deleteSystemUser => 테이블: TB_SYS_USR - SystemUser | 시스템 사용자
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteSystemUser(SystemUserVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteSystemUser", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectTeacher", param);
	}

	/**
	 * selectTeacherList => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeacherVO> selectTeacherList(TeacherVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectTeacherList", param);
	}

	/**
	 * selectTeacherListCount => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectTeacherListCount(TeacherVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectTeacherListCount", param);
	}

	/**
	 * insertTeacher => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertTeacher(TeacherVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertTeacher", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateTeacher", model);
	}

	/**
	 * deleteTeacher => 테이블: TB_TCHR - Teacher | 교사
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteTeacher(TeacherVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteTeacher", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectTeacherLectureFee", param);
	}

	/**
	 * selectTeacherLectureFeeList => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeacherLectureFeeVO> selectTeacherLectureFeeList(TeacherLectureFeeVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectTeacherLectureFeeList", param);
	}

	/**
	 * selectTeacherLectureFeeListCount => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectTeacherLectureFeeListCount(TeacherLectureFeeVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectTeacherLectureFeeListCount", param);
	}

	/**
	 * insertTeacherLectureFee => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertTeacherLectureFee", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateTeacherLectureFee", model);
	}

	/**
	 * deleteTeacherLectureFee => 테이블: TB_TCHR_LTR_FEE - TeacherLectureFee | 교사 강의료
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteTeacherLectureFee", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectTeam", param);
	}

	/**
	 * selectTeamList => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeamVO> selectTeamList(TeamVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectTeamList", param);
	}

	/**
	 * selectTeamListCount => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectTeamListCount(TeamVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectTeamListCount", param);
	}

	/**
	 * insertTeam => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertTeam(TeamVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertTeam", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateTeam", model);
	}

	/**
	 * deleteTeam => 테이블: TB_TEAM - Team | 팀
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteTeam(TeamVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteTeam", model);
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
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectUnpaidSend", param);
	}

	/**
	 * selectUnpaidSendList => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<UnpaidSendVO> selectUnpaidSendList(UnpaidSendVO param) throws Exception {
		return sqlSession.selectList("tata.creator.be.output.common.mapper.selectUnpaidSendList", param);
	}

	/**
	 * selectUnpaidSendListCount => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int selectUnpaidSendListCount(UnpaidSendVO param) throws Exception {
		return sqlSession.selectOne("tata.creator.be.output.common.mapper.selectUnpaidSendListCount", param);
	}

	/**
	 * insertUnpaidSend => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int insertUnpaidSend(UnpaidSendVO model) throws Exception {
		sqlSession.insert("tata.creator.be.output.common.mapper.insertUnpaidSend", model);
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
		return sqlSession.update("tata.creator.be.output.common.mapper.updateUnpaidSend", model);
	}

	/**
	 * deleteUnpaidSend => 테이블: TB_UNPD_SND - UnpaidSend | 미납 발송
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public int deleteUnpaidSend(UnpaidSendVO model) throws Exception {
		return sqlSession.delete("tata.creator.be.output.common.mapper.deleteUnpaidSend", model);
	}



}
