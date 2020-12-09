package dongovi2020.biz01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dongovi2020.biz01.dao.BizBasicDao;
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
 * BizBasicService
 * @author tata creator
 * @since 2020.12.05 
 */
@Service
public class BizBasicService {

	/** */
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(BizBasicService.class);

	@Autowired
	private BizBasicDao bizBasicDao;

	/// ===== CommonCode ===== =======================================================================

	/**
	 * search CommonCode => selectCommonCode
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public CommonCodeVO searchCommonCode(CommonCodeVO param) throws Exception {
		return bizBasicDao.selectCommonCode(param);
	}

	/**
	 * search CommonCode List => selectCommonCodeList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<CommonCodeVO> searchCommonCodeList(CommonCodeVO param) throws Exception {
		return bizBasicDao.selectCommonCodeList(param);
	}

	/**
	 * search CommonCode List Count => selectCommonCodeListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchCommonCodeListCount(CommonCodeVO param) throws Exception {
		return bizBasicDao.selectCommonCodeListCount(param);
	}

	/**
	 * add CommonCode => insertCommonCode
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addCommonCode(CommonCodeVO model) throws Exception {
		return bizBasicDao.insertCommonCode(model);
	}

	/**
	 * modify CommonCode => updateCommonCode
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyCommonCode(CommonCodeVO model) throws Exception {
		return bizBasicDao.updateCommonCode(model);
	}

	/**
	 * remove CommonCode => deleteCommonCode
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeCommonCode(CommonCodeVO model) throws Exception {
		return bizBasicDao.deleteCommonCode(model);
	}

	/// ===== Lesson ===== =======================================================================

	/**
	 * search Lesson => selectLesson
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonVO searchLesson(LessonVO param) throws Exception {
		return bizBasicDao.selectLesson(param);
	}

	/**
	 * search Lesson List => selectLessonList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonVO> searchLessonList(LessonVO param) throws Exception {
		return bizBasicDao.selectLessonList(param);
	}

	/**
	 * search Lesson List Count => selectLessonListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonListCount(LessonVO param) throws Exception {
		return bizBasicDao.selectLessonListCount(param);
	}

	/**
	 * add Lesson => insertLesson
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLesson(LessonVO model) throws Exception {
		return bizBasicDao.insertLesson(model);
	}

	/**
	 * modify Lesson => updateLesson
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLesson(LessonVO model) throws Exception {
		return bizBasicDao.updateLesson(model);
	}

	/**
	 * remove Lesson => deleteLesson
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLesson(LessonVO model) throws Exception {
		return bizBasicDao.deleteLesson(model);
	}

	/// ===== LessonArea ===== =======================================================================

	/**
	 * search LessonArea => selectLessonArea
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonAreaVO searchLessonArea(LessonAreaVO param) throws Exception {
		return bizBasicDao.selectLessonArea(param);
	}

	/**
	 * search LessonArea List => selectLessonAreaList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonAreaVO> searchLessonAreaList(LessonAreaVO param) throws Exception {
		return bizBasicDao.selectLessonAreaList(param);
	}

	/**
	 * search LessonArea List Count => selectLessonAreaListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonAreaListCount(LessonAreaVO param) throws Exception {
		return bizBasicDao.selectLessonAreaListCount(param);
	}

	/**
	 * add LessonArea => insertLessonArea
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonArea(LessonAreaVO model) throws Exception {
		return bizBasicDao.insertLessonArea(model);
	}

	/**
	 * modify LessonArea => updateLessonArea
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonArea(LessonAreaVO model) throws Exception {
		return bizBasicDao.updateLessonArea(model);
	}

	/**
	 * remove LessonArea => deleteLessonArea
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonArea(LessonAreaVO model) throws Exception {
		return bizBasicDao.deleteLessonArea(model);
	}

	/// ===== LessonForm ===== =======================================================================

	/**
	 * search LessonForm => selectLessonForm
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonFormVO searchLessonForm(LessonFormVO param) throws Exception {
		return bizBasicDao.selectLessonForm(param);
	}

	/**
	 * search LessonForm List => selectLessonFormList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonFormVO> searchLessonFormList(LessonFormVO param) throws Exception {
		return bizBasicDao.selectLessonFormList(param);
	}

	/**
	 * search LessonForm List Count => selectLessonFormListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonFormListCount(LessonFormVO param) throws Exception {
		return bizBasicDao.selectLessonFormListCount(param);
	}

	/**
	 * add LessonForm => insertLessonForm
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonForm(LessonFormVO model) throws Exception {
		return bizBasicDao.insertLessonForm(model);
	}

	/**
	 * modify LessonForm => updateLessonForm
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonForm(LessonFormVO model) throws Exception {
		return bizBasicDao.updateLessonForm(model);
	}

	/**
	 * remove LessonForm => deleteLessonForm
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonForm(LessonFormVO model) throws Exception {
		return bizBasicDao.deleteLessonForm(model);
	}

	/// ===== LessonPlace ===== =======================================================================

	/**
	 * search LessonPlace => selectLessonPlace
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonPlaceVO searchLessonPlace(LessonPlaceVO param) throws Exception {
		return bizBasicDao.selectLessonPlace(param);
	}

	/**
	 * search LessonPlace List => selectLessonPlaceList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonPlaceVO> searchLessonPlaceList(LessonPlaceVO param) throws Exception {
		return bizBasicDao.selectLessonPlaceList(param);
	}

	/**
	 * search LessonPlace List Count => selectLessonPlaceListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonPlaceListCount(LessonPlaceVO param) throws Exception {
		return bizBasicDao.selectLessonPlaceListCount(param);
	}

	/**
	 * add LessonPlace => insertLessonPlace
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonPlace(LessonPlaceVO model) throws Exception {
		return bizBasicDao.insertLessonPlace(model);
	}

	/**
	 * modify LessonPlace => updateLessonPlace
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonPlace(LessonPlaceVO model) throws Exception {
		return bizBasicDao.updateLessonPlace(model);
	}

	/**
	 * remove LessonPlace => deleteLessonPlace
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonPlace(LessonPlaceVO model) throws Exception {
		return bizBasicDao.deleteLessonPlace(model);
	}

	/// ===== LessonStudentConstitue ===== =======================================================================

	/**
	 * search LessonStudentConstitue => selectLessonStudentConstitue
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonStudentConstitueVO searchLessonStudentConstitue(LessonStudentConstitueVO param) throws Exception {
		return bizBasicDao.selectLessonStudentConstitue(param);
	}

	/**
	 * search LessonStudentConstitue List => selectLessonStudentConstitueList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonStudentConstitueVO> searchLessonStudentConstitueList(LessonStudentConstitueVO param) throws Exception {
		return bizBasicDao.selectLessonStudentConstitueList(param);
	}

	/**
	 * search LessonStudentConstitue List Count => selectLessonStudentConstitueListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonStudentConstitueListCount(LessonStudentConstitueVO param) throws Exception {
		return bizBasicDao.selectLessonStudentConstitueListCount(param);
	}

	/**
	 * add LessonStudentConstitue => insertLessonStudentConstitue
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		return bizBasicDao.insertLessonStudentConstitue(model);
	}

	/**
	 * modify LessonStudentConstitue => updateLessonStudentConstitue
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		return bizBasicDao.updateLessonStudentConstitue(model);
	}

	/**
	 * remove LessonStudentConstitue => deleteLessonStudentConstitue
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonStudentConstitue(LessonStudentConstitueVO model) throws Exception {
		return bizBasicDao.deleteLessonStudentConstitue(model);
	}

	/// ===== LessonStudentTuitionDeposit ===== =======================================================================

	/**
	 * search LessonStudentTuitionDeposit => selectLessonStudentTuitionDeposit
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonStudentTuitionDepositVO searchLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO param) throws Exception {
		return bizBasicDao.selectLessonStudentTuitionDeposit(param);
	}

	/**
	 * search LessonStudentTuitionDeposit List => selectLessonStudentTuitionDepositList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonStudentTuitionDepositVO> searchLessonStudentTuitionDepositList(LessonStudentTuitionDepositVO param) throws Exception {
		return bizBasicDao.selectLessonStudentTuitionDepositList(param);
	}

	/**
	 * search LessonStudentTuitionDeposit List Count => selectLessonStudentTuitionDepositListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonStudentTuitionDepositListCount(LessonStudentTuitionDepositVO param) throws Exception {
		return bizBasicDao.selectLessonStudentTuitionDepositListCount(param);
	}

	/**
	 * add LessonStudentTuitionDeposit => insertLessonStudentTuitionDeposit
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		return bizBasicDao.insertLessonStudentTuitionDeposit(model);
	}

	/**
	 * modify LessonStudentTuitionDeposit => updateLessonStudentTuitionDeposit
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		return bizBasicDao.updateLessonStudentTuitionDeposit(model);
	}

	/**
	 * remove LessonStudentTuitionDeposit => deleteLessonStudentTuitionDeposit
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonStudentTuitionDeposit(LessonStudentTuitionDepositVO model) throws Exception {
		return bizBasicDao.deleteLessonStudentTuitionDeposit(model);
	}

	/// ===== LessonTrun ===== =======================================================================

	/**
	 * search LessonTrun => selectLessonTrun
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonTrunVO searchLessonTrun(LessonTrunVO param) throws Exception {
		return bizBasicDao.selectLessonTrun(param);
	}

	/**
	 * search LessonTrun List => selectLessonTrunList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonTrunVO> searchLessonTrunList(LessonTrunVO param) throws Exception {
		return bizBasicDao.selectLessonTrunList(param);
	}

	/**
	 * search LessonTrun List Count => selectLessonTrunListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonTrunListCount(LessonTrunVO param) throws Exception {
		return bizBasicDao.selectLessonTrunListCount(param);
	}

	/**
	 * add LessonTrun => insertLessonTrun
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonTrun(LessonTrunVO model) throws Exception {
		return bizBasicDao.insertLessonTrun(model);
	}

	/**
	 * modify LessonTrun => updateLessonTrun
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonTrun(LessonTrunVO model) throws Exception {
		return bizBasicDao.updateLessonTrun(model);
	}

	/**
	 * remove LessonTrun => deleteLessonTrun
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonTrun(LessonTrunVO model) throws Exception {
		return bizBasicDao.deleteLessonTrun(model);
	}

	/// ===== LessonTurnStudentPaticipation ===== =======================================================================

	/**
	 * search LessonTurnStudentPaticipation => selectLessonTurnStudentPaticipation
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LessonTurnStudentPaticipationVO searchLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO param) throws Exception {
		return bizBasicDao.selectLessonTurnStudentPaticipation(param);
	}

	/**
	 * search LessonTurnStudentPaticipation List => selectLessonTurnStudentPaticipationList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LessonTurnStudentPaticipationVO> searchLessonTurnStudentPaticipationList(LessonTurnStudentPaticipationVO param) throws Exception {
		return bizBasicDao.selectLessonTurnStudentPaticipationList(param);
	}

	/**
	 * search LessonTurnStudentPaticipation List Count => selectLessonTurnStudentPaticipationListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLessonTurnStudentPaticipationListCount(LessonTurnStudentPaticipationVO param) throws Exception {
		return bizBasicDao.selectLessonTurnStudentPaticipationListCount(param);
	}

	/**
	 * add LessonTurnStudentPaticipation => insertLessonTurnStudentPaticipation
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		return bizBasicDao.insertLessonTurnStudentPaticipation(model);
	}

	/**
	 * modify LessonTurnStudentPaticipation => updateLessonTurnStudentPaticipation
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		return bizBasicDao.updateLessonTurnStudentPaticipation(model);
	}

	/**
	 * remove LessonTurnStudentPaticipation => deleteLessonTurnStudentPaticipation
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLessonTurnStudentPaticipation(LessonTurnStudentPaticipationVO model) throws Exception {
		return bizBasicDao.deleteLessonTurnStudentPaticipation(model);
	}

	/// ===== LectureFeePay ===== =======================================================================

	/**
	 * search LectureFeePay => selectLectureFeePay
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LectureFeePayVO searchLectureFeePay(LectureFeePayVO param) throws Exception {
		return bizBasicDao.selectLectureFeePay(param);
	}

	/**
	 * search LectureFeePay List => selectLectureFeePayList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LectureFeePayVO> searchLectureFeePayList(LectureFeePayVO param) throws Exception {
		return bizBasicDao.selectLectureFeePayList(param);
	}

	/**
	 * search LectureFeePay List Count => selectLectureFeePayListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLectureFeePayListCount(LectureFeePayVO param) throws Exception {
		return bizBasicDao.selectLectureFeePayListCount(param);
	}

	/**
	 * add LectureFeePay => insertLectureFeePay
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLectureFeePay(LectureFeePayVO model) throws Exception {
		return bizBasicDao.insertLectureFeePay(model);
	}

	/**
	 * modify LectureFeePay => updateLectureFeePay
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLectureFeePay(LectureFeePayVO model) throws Exception {
		return bizBasicDao.updateLectureFeePay(model);
	}

	/**
	 * remove LectureFeePay => deleteLectureFeePay
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLectureFeePay(LectureFeePayVO model) throws Exception {
		return bizBasicDao.deleteLectureFeePay(model);
	}

	/// ===== LectureFeePayAddDetail ===== =======================================================================

	/**
	 * search LectureFeePayAddDetail => selectLectureFeePayAddDetail
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public LectureFeePayAddDetailVO searchLectureFeePayAddDetail(LectureFeePayAddDetailVO param) throws Exception {
		return bizBasicDao.selectLectureFeePayAddDetail(param);
	}

	/**
	 * search LectureFeePayAddDetail List => selectLectureFeePayAddDetailList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<LectureFeePayAddDetailVO> searchLectureFeePayAddDetailList(LectureFeePayAddDetailVO param) throws Exception {
		return bizBasicDao.selectLectureFeePayAddDetailList(param);
	}

	/**
	 * search LectureFeePayAddDetail List Count => selectLectureFeePayAddDetailListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchLectureFeePayAddDetailListCount(LectureFeePayAddDetailVO param) throws Exception {
		return bizBasicDao.selectLectureFeePayAddDetailListCount(param);
	}

	/**
	 * add LectureFeePayAddDetail => insertLectureFeePayAddDetail
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		return bizBasicDao.insertLectureFeePayAddDetail(model);
	}

	/**
	 * modify LectureFeePayAddDetail => updateLectureFeePayAddDetail
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		return bizBasicDao.updateLectureFeePayAddDetail(model);
	}

	/**
	 * remove LectureFeePayAddDetail => deleteLectureFeePayAddDetail
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeLectureFeePayAddDetail(LectureFeePayAddDetailVO model) throws Exception {
		return bizBasicDao.deleteLectureFeePayAddDetail(model);
	}

	/// ===== Menu ===== =======================================================================

	/**
	 * search Menu => selectMenu
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MenuVO searchMenu(MenuVO param) throws Exception {
		return bizBasicDao.selectMenu(param);
	}

	/**
	 * search Menu List => selectMenuList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuVO> searchMenuList(MenuVO param) throws Exception {
		return bizBasicDao.selectMenuList(param);
	}

	/**
	 * search Menu List Count => selectMenuListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchMenuListCount(MenuVO param) throws Exception {
		return bizBasicDao.selectMenuListCount(param);
	}

	/**
	 * add Menu => insertMenu
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addMenu(MenuVO model) throws Exception {
		return bizBasicDao.insertMenu(model);
	}

	/**
	 * modify Menu => updateMenu
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyMenu(MenuVO model) throws Exception {
		return bizBasicDao.updateMenu(model);
	}

	/**
	 * remove Menu => deleteMenu
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeMenu(MenuVO model) throws Exception {
		return bizBasicDao.deleteMenu(model);
	}

	/// ===== MenuAccessLog ===== =======================================================================

	/**
	 * search MenuAccessLog => selectMenuAccessLog
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MenuAccessLogVO searchMenuAccessLog(MenuAccessLogVO param) throws Exception {
		return bizBasicDao.selectMenuAccessLog(param);
	}

	/**
	 * search MenuAccessLog List => selectMenuAccessLogList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuAccessLogVO> searchMenuAccessLogList(MenuAccessLogVO param) throws Exception {
		return bizBasicDao.selectMenuAccessLogList(param);
	}

	/**
	 * search MenuAccessLog List Count => selectMenuAccessLogListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchMenuAccessLogListCount(MenuAccessLogVO param) throws Exception {
		return bizBasicDao.selectMenuAccessLogListCount(param);
	}

	/**
	 * add MenuAccessLog => insertMenuAccessLog
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addMenuAccessLog(MenuAccessLogVO model) throws Exception {
		return bizBasicDao.insertMenuAccessLog(model);
	}

	/**
	 * modify MenuAccessLog => updateMenuAccessLog
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyMenuAccessLog(MenuAccessLogVO model) throws Exception {
		return bizBasicDao.updateMenuAccessLog(model);
	}

	/**
	 * remove MenuAccessLog => deleteMenuAccessLog
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeMenuAccessLog(MenuAccessLogVO model) throws Exception {
		return bizBasicDao.deleteMenuAccessLog(model);
	}

	/// ===== MenuAuth ===== =======================================================================

	/**
	 * search MenuAuth => selectMenuAuth
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MenuAuthVO searchMenuAuth(MenuAuthVO param) throws Exception {
		return bizBasicDao.selectMenuAuth(param);
	}

	/**
	 * search MenuAuth List => selectMenuAuthList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MenuAuthVO> searchMenuAuthList(MenuAuthVO param) throws Exception {
		return bizBasicDao.selectMenuAuthList(param);
	}

	/**
	 * search MenuAuth List Count => selectMenuAuthListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchMenuAuthListCount(MenuAuthVO param) throws Exception {
		return bizBasicDao.selectMenuAuthListCount(param);
	}

	/**
	 * add MenuAuth => insertMenuAuth
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addMenuAuth(MenuAuthVO model) throws Exception {
		return bizBasicDao.insertMenuAuth(model);
	}

	/**
	 * modify MenuAuth => updateMenuAuth
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyMenuAuth(MenuAuthVO model) throws Exception {
		return bizBasicDao.updateMenuAuth(model);
	}

	/**
	 * remove MenuAuth => deleteMenuAuth
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeMenuAuth(MenuAuthVO model) throws Exception {
		return bizBasicDao.deleteMenuAuth(model);
	}

	/// ===== MessageSend ===== =======================================================================

	/**
	 * search MessageSend => selectMessageSend
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MessageSendVO searchMessageSend(MessageSendVO param) throws Exception {
		return bizBasicDao.selectMessageSend(param);
	}

	/**
	 * search MessageSend List => selectMessageSendList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<MessageSendVO> searchMessageSendList(MessageSendVO param) throws Exception {
		return bizBasicDao.selectMessageSendList(param);
	}

	/**
	 * search MessageSend List Count => selectMessageSendListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchMessageSendListCount(MessageSendVO param) throws Exception {
		return bizBasicDao.selectMessageSendListCount(param);
	}

	/**
	 * add MessageSend => insertMessageSend
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addMessageSend(MessageSendVO model) throws Exception {
		return bizBasicDao.insertMessageSend(model);
	}

	/**
	 * modify MessageSend => updateMessageSend
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyMessageSend(MessageSendVO model) throws Exception {
		return bizBasicDao.updateMessageSend(model);
	}

	/**
	 * remove MessageSend => deleteMessageSend
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeMessageSend(MessageSendVO model) throws Exception {
		return bizBasicDao.deleteMessageSend(model);
	}

	/// ===== Student ===== =======================================================================

	/**
	 * search Student => selectStudent
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public StudentVO searchStudent(StudentVO param) throws Exception {
		return bizBasicDao.selectStudent(param);
	}

	/**
	 * search Student List => selectStudentList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<StudentVO> searchStudentList(StudentVO param) throws Exception {
		return bizBasicDao.selectStudentList(param);
	}

	/**
	 * search Student List Count => selectStudentListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchStudentListCount(StudentVO param) throws Exception {
		return bizBasicDao.selectStudentListCount(param);
	}

	/**
	 * add Student => insertStudent
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addStudent(StudentVO model) throws Exception {
		return bizBasicDao.insertStudent(model);
	}

	/**
	 * modify Student => updateStudent
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyStudent(StudentVO model) throws Exception {
		return bizBasicDao.updateStudent(model);
	}

	/**
	 * remove Student => deleteStudent
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeStudent(StudentVO model) throws Exception {
		return bizBasicDao.deleteStudent(model);
	}

	/// ===== SystemLoginLog ===== =======================================================================

	/**
	 * search SystemLoginLog => selectSystemLoginLog
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SystemLoginLogVO searchSystemLoginLog(SystemLoginLogVO param) throws Exception {
		return bizBasicDao.selectSystemLoginLog(param);
	}

	/**
	 * search SystemLoginLog List => selectSystemLoginLogList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<SystemLoginLogVO> searchSystemLoginLogList(SystemLoginLogVO param) throws Exception {
		return bizBasicDao.selectSystemLoginLogList(param);
	}

	/**
	 * search SystemLoginLog List Count => selectSystemLoginLogListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchSystemLoginLogListCount(SystemLoginLogVO param) throws Exception {
		return bizBasicDao.selectSystemLoginLogListCount(param);
	}

	/**
	 * add SystemLoginLog => insertSystemLoginLog
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addSystemLoginLog(SystemLoginLogVO model) throws Exception {
		return bizBasicDao.insertSystemLoginLog(model);
	}

	/**
	 * modify SystemLoginLog => updateSystemLoginLog
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifySystemLoginLog(SystemLoginLogVO model) throws Exception {
		return bizBasicDao.updateSystemLoginLog(model);
	}

	/**
	 * remove SystemLoginLog => deleteSystemLoginLog
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeSystemLoginLog(SystemLoginLogVO model) throws Exception {
		return bizBasicDao.deleteSystemLoginLog(model);
	}

	/// ===== SystemUser ===== =======================================================================

	/**
	 * search SystemUser => selectSystemUser
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SystemUserVO searchSystemUser(SystemUserVO param) throws Exception {
		return bizBasicDao.selectSystemUser(param);
	}

	/**
	 * search SystemUser List => selectSystemUserList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<SystemUserVO> searchSystemUserList(SystemUserVO param) throws Exception {
		return bizBasicDao.selectSystemUserList(param);
	}

	/**
	 * search SystemUser List Count => selectSystemUserListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchSystemUserListCount(SystemUserVO param) throws Exception {
		return bizBasicDao.selectSystemUserListCount(param);
	}

	/**
	 * add SystemUser => insertSystemUser
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addSystemUser(SystemUserVO model) throws Exception {
		return bizBasicDao.insertSystemUser(model);
	}

	/**
	 * modify SystemUser => updateSystemUser
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifySystemUser(SystemUserVO model) throws Exception {
		return bizBasicDao.updateSystemUser(model);
	}

	/**
	 * remove SystemUser => deleteSystemUser
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeSystemUser(SystemUserVO model) throws Exception {
		return bizBasicDao.deleteSystemUser(model);
	}

	/// ===== Teacher ===== =======================================================================

	/**
	 * search Teacher => selectTeacher
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TeacherVO searchTeacher(TeacherVO param) throws Exception {
		return bizBasicDao.selectTeacher(param);
	}

	/**
	 * search Teacher List => selectTeacherList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeacherVO> searchTeacherList(TeacherVO param) throws Exception {
		return bizBasicDao.selectTeacherList(param);
	}

	/**
	 * search Teacher List Count => selectTeacherListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchTeacherListCount(TeacherVO param) throws Exception {
		return bizBasicDao.selectTeacherListCount(param);
	}

	/**
	 * add Teacher => insertTeacher
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addTeacher(TeacherVO model) throws Exception {
		return bizBasicDao.insertTeacher(model);
	}

	/**
	 * modify Teacher => updateTeacher
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyTeacher(TeacherVO model) throws Exception {
		return bizBasicDao.updateTeacher(model);
	}

	/**
	 * remove Teacher => deleteTeacher
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeTeacher(TeacherVO model) throws Exception {
		return bizBasicDao.deleteTeacher(model);
	}

	/// ===== TeacherLectureFee ===== =======================================================================

	/**
	 * search TeacherLectureFee => selectTeacherLectureFee
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TeacherLectureFeeVO searchTeacherLectureFee(TeacherLectureFeeVO param) throws Exception {
		return bizBasicDao.selectTeacherLectureFee(param);
	}

	/**
	 * search TeacherLectureFee List => selectTeacherLectureFeeList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeacherLectureFeeVO> searchTeacherLectureFeeList(TeacherLectureFeeVO param) throws Exception {
		return bizBasicDao.selectTeacherLectureFeeList(param);
	}

	/**
	 * search TeacherLectureFee List Count => selectTeacherLectureFeeListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchTeacherLectureFeeListCount(TeacherLectureFeeVO param) throws Exception {
		return bizBasicDao.selectTeacherLectureFeeListCount(param);
	}

	/**
	 * add TeacherLectureFee => insertTeacherLectureFee
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		return bizBasicDao.insertTeacherLectureFee(model);
	}

	/**
	 * modify TeacherLectureFee => updateTeacherLectureFee
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		return bizBasicDao.updateTeacherLectureFee(model);
	}

	/**
	 * remove TeacherLectureFee => deleteTeacherLectureFee
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeTeacherLectureFee(TeacherLectureFeeVO model) throws Exception {
		return bizBasicDao.deleteTeacherLectureFee(model);
	}

	/// ===== Team ===== =======================================================================

	/**
	 * search Team => selectTeam
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public TeamVO searchTeam(TeamVO param) throws Exception {
		return bizBasicDao.selectTeam(param);
	}

	/**
	 * search Team List => selectTeamList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<TeamVO> searchTeamList(TeamVO param) throws Exception {
		return bizBasicDao.selectTeamList(param);
	}

	/**
	 * search Team List Count => selectTeamListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchTeamListCount(TeamVO param) throws Exception {
		return bizBasicDao.selectTeamListCount(param);
	}

	/**
	 * add Team => insertTeam
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addTeam(TeamVO model) throws Exception {
		return bizBasicDao.insertTeam(model);
	}

	/**
	 * modify Team => updateTeam
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyTeam(TeamVO model) throws Exception {
		return bizBasicDao.updateTeam(model);
	}

	/**
	 * remove Team => deleteTeam
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeTeam(TeamVO model) throws Exception {
		return bizBasicDao.deleteTeam(model);
	}

	/// ===== UnpaidSend ===== =======================================================================

	/**
	 * search UnpaidSend => selectUnpaidSend
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public UnpaidSendVO searchUnpaidSend(UnpaidSendVO param) throws Exception {
		return bizBasicDao.selectUnpaidSend(param);
	}

	/**
	 * search UnpaidSend List => selectUnpaidSendList
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public List<UnpaidSendVO> searchUnpaidSendList(UnpaidSendVO param) throws Exception {
		return bizBasicDao.selectUnpaidSendList(param);
	}

	/**
	 * search UnpaidSend List Count => selectUnpaidSendListCount
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public int searchUnpaidSendListCount(UnpaidSendVO param) throws Exception {
		return bizBasicDao.selectUnpaidSendListCount(param);
	}

	/**
	 * add UnpaidSend => insertUnpaidSend
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int addUnpaidSend(UnpaidSendVO model) throws Exception {
		return bizBasicDao.insertUnpaidSend(model);
	}

	/**
	 * modify UnpaidSend => updateUnpaidSend
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int modifyUnpaidSend(UnpaidSendVO model) throws Exception {
		return bizBasicDao.updateUnpaidSend(model);
	}

	/**
	 * remove UnpaidSend => deleteUnpaidSend
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public int removeUnpaidSend(UnpaidSendVO model) throws Exception {
		return bizBasicDao.deleteUnpaidSend(model);
	}



}
