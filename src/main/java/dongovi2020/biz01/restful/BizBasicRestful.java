package dongovi2020.biz01.restful;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dongovi2020.base.common.BaseRestful;
import dongovi2020.base.common.ResultData;
import dongovi2020.biz01.service.BizBasicService;
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
 * BizBasicRestful
 * 
 * @author tata creator
 * @since 2020.12.05
 */
@Controller
public class BizBasicRestful extends BaseRestful {

	private static final Logger logger = LoggerFactory.getLogger(BizBasicRestful.class);

	@Autowired
	private BizBasicService bizBasicService;

	/// ===== CommonCode =====
	/// =======================================================================

	/**
	 * search CommonCode => searchCommonCode
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchCommonCode")
	public ResponseEntity<Map<String, Object>> apiSearchCommonCode(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchCommonCode(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search CommonCode List => searchCommonCodeList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchCommonCodeList")
	public ResponseEntity<Map<String, Object>> apiSearchCommonCodeList(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchCommonCodeList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search CommonCode List for Page => searchCommonCodeList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchCommonCodeListCount")
	public ResponseEntity<Map<String, Object>> apiSearchCommonCodeListCount(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchCommonCodeListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save CommonCode => saveCommonCode
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveCommonCode")
	public ResponseEntity<Map<String, Object>> apiSaveCommonCode(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			CommonCodeVO vo = bizBasicService.searchCommonCode(param);
			if (vo == null) {
				iResult = bizBasicService.addCommonCode(param);
			} else {
				iResult = bizBasicService.modifyCommonCode(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add CommonCode => addCommonCode
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addCommonCode")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddCommonCode(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addCommonCode(param);

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify CommonCode => modifyCommonCode
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyCommonCode")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyCommonCode(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyCommonCode(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove CommonCode => removeCommonCode
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeCommonCode")
	public ResponseEntity<Map<String, Object>> apiRemoveCommonCode(HttpServletRequest request,
			@RequestBody CommonCodeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeCommonCode(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== Lesson =====
	/// =======================================================================

	/**
	 * search Lesson => searchLesson
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLesson")
	public ResponseEntity<Map<String, Object>> apiSearchLesson(HttpServletRequest request,
			@RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLesson(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Lesson List => searchLessonList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonList(HttpServletRequest request,
			@RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Lesson List for Page => searchLessonList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonListCount(HttpServletRequest request,
			@RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save Lesson => saveLesson
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLesson")
	public ResponseEntity<Map<String, Object>> apiSaveLesson(HttpServletRequest request, @RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonVO vo = bizBasicService.searchLesson(param);
			if (vo == null || vo.getLsnIdx() == 0) {
				iResult = bizBasicService.addLesson(param);
				param.setLsnIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLesson(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add Lesson => addLesson
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLesson")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLesson(HttpServletRequest request, @RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLesson(param);
			param.setLsnIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify Lesson => modifyLesson
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLesson")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLesson(HttpServletRequest request,
			@RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLesson(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove Lesson => removeLesson
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLesson")
	public ResponseEntity<Map<String, Object>> apiRemoveLesson(HttpServletRequest request,
			@RequestBody LessonVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLesson(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonArea =====
	/// =======================================================================

	/**
	 * search LessonArea => searchLessonArea
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonArea")
	public ResponseEntity<Map<String, Object>> apiSearchLessonArea(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonArea(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonArea List => searchLessonAreaList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonAreaList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonAreaList(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonAreaList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonArea List for Page => searchLessonAreaList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonAreaListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonAreaListCount(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonAreaListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonArea => saveLessonArea
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonArea")
	public ResponseEntity<Map<String, Object>> apiSaveLessonArea(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonAreaVO vo = bizBasicService.searchLessonArea(param);
			if (vo == null) {
				iResult = bizBasicService.addLessonArea(param);
			} else {
				iResult = bizBasicService.modifyLessonArea(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonArea => addLessonArea
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonArea")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonArea(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonArea(param);

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonArea => modifyLessonArea
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonArea")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonArea(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonArea(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonArea => removeLessonArea
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonArea")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonArea(HttpServletRequest request,
			@RequestBody LessonAreaVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonArea(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonForm =====
	/// =======================================================================

	/**
	 * search LessonForm => searchLessonForm
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonForm")
	public ResponseEntity<Map<String, Object>> apiSearchLessonForm(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonForm(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonForm List => searchLessonFormList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonFormList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonFormList(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonFormList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonForm List for Page => searchLessonFormList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonFormListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonFormListCount(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonFormListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonForm => saveLessonForm
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonForm")
	public ResponseEntity<Map<String, Object>> apiSaveLessonForm(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonFormVO vo = bizBasicService.searchLessonForm(param);
			if (vo == null) {
				iResult = bizBasicService.addLessonForm(param);
			} else {
				iResult = bizBasicService.modifyLessonForm(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonForm => addLessonForm
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonForm")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonForm(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonForm(param);

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonForm => modifyLessonForm
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonForm")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonForm(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonForm(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonForm => removeLessonForm
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonForm")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonForm(HttpServletRequest request,
			@RequestBody LessonFormVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonForm(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonPlace =====
	/// =======================================================================

	/**
	 * search LessonPlace => searchLessonPlace
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonPlace")
	public ResponseEntity<Map<String, Object>> apiSearchLessonPlace(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonPlace(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonPlace List => searchLessonPlaceList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonPlaceList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonPlaceList(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonPlaceList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonPlace List for Page => searchLessonPlaceList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonPlaceListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonPlaceListCount(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonPlaceListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonPlace => saveLessonPlace
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonPlace")
	public ResponseEntity<Map<String, Object>> apiSaveLessonPlace(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonPlaceVO vo = bizBasicService.searchLessonPlace(param);
			if (vo == null) {
				iResult = bizBasicService.addLessonPlace(param);
			} else {
				iResult = bizBasicService.modifyLessonPlace(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonPlace => addLessonPlace
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonPlace")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonPlace(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonPlace(param);

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonPlace => modifyLessonPlace
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonPlace")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonPlace(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonPlace(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonPlace => removeLessonPlace
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonPlace")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonPlace(HttpServletRequest request,
			@RequestBody LessonPlaceVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonPlace(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonStudentConstitue =====
	/// =======================================================================

	/**
	 * search LessonStudentConstitue => searchLessonStudentConstitue
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentConstitue")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentConstitue(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonStudentConstitue(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonStudentConstitue List => searchLessonStudentConstitueList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentConstitueList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentConstitueList(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonStudentConstitueList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonStudentConstitue List for Page =>
	 * searchLessonStudentConstitueList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentConstitueListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentConstitueListCount(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonStudentConstitueListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonStudentConstitue => saveLessonStudentConstitue
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonStudentConstitue")
	public ResponseEntity<Map<String, Object>> apiSaveLessonStudentConstitue(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonStudentConstitueVO vo = bizBasicService.searchLessonStudentConstitue(param);
			if (vo == null || vo.getLsnStdntCsttIdx() == 0) {
				iResult = bizBasicService.addLessonStudentConstitue(param);
				param.setLsnStdntCsttIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonStudentConstitue(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonStudentConstitue => addLessonStudentConstitue
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonStudentConstitue")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonStudentConstitue(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonStudentConstitue(param);
			param.setLsnStdntCsttIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonStudentConstitue => modifyLessonStudentConstitue
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonStudentConstitue")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonStudentConstitue(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonStudentConstitue(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonStudentConstitue => removeLessonStudentConstitue
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonStudentConstitue")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonStudentConstitue(HttpServletRequest request,
			@RequestBody LessonStudentConstitueVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonStudentConstitue(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonStudentTuitionDeposit =====
	/// =======================================================================

	/**
	 * search LessonStudentTuitionDeposit => searchLessonStudentTuitionDeposit
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentTuitionDeposit")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentTuitionDeposit(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonStudentTuitionDeposit(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonStudentTuitionDeposit List =>
	 * searchLessonStudentTuitionDepositList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentTuitionDepositList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentTuitionDepositList(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonStudentTuitionDepositList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonStudentTuitionDeposit List for Page =>
	 * searchLessonStudentTuitionDepositList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentTuitionDepositListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentTuitionDepositListCount(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonStudentTuitionDepositListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonStudentTuitionDeposit => saveLessonStudentTuitionDeposit
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonStudentTuitionDeposit")
	public ResponseEntity<Map<String, Object>> apiSaveLessonStudentTuitionDeposit(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonStudentTuitionDepositVO vo = bizBasicService.searchLessonStudentTuitionDeposit(param);
			if (vo == null || vo.getLsnStdntTtnDpstIdx() == 0) {
				iResult = bizBasicService.addLessonStudentTuitionDeposit(param);
				param.setLsnStdntTtnDpstIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonStudentTuitionDeposit(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonStudentTuitionDeposit => addLessonStudentTuitionDeposit
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonStudentTuitionDeposit")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonStudentTuitionDeposit(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonStudentTuitionDeposit(param);
			param.setLsnStdntTtnDpstIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonStudentTuitionDeposit => modifyLessonStudentTuitionDeposit
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonStudentTuitionDeposit")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonStudentTuitionDeposit(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonStudentTuitionDeposit(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonStudentTuitionDeposit => removeLessonStudentTuitionDeposit
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonStudentTuitionDeposit")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonStudentTuitionDeposit(HttpServletRequest request,
			@RequestBody LessonStudentTuitionDepositVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonStudentTuitionDeposit(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonTrun =====
	/// =======================================================================

	/**
	 * search LessonTrun => searchLessonTrun
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTrun")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTrun(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonTrun(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonTrun List => searchLessonTrunList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTrunList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTrunList(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonTrunList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonTrun List for Page => searchLessonTrunList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTrunListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTrunListCount(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonTrunListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonTrun => saveLessonTrun
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonTrun")
	public ResponseEntity<Map<String, Object>> apiSaveLessonTrun(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonTrunVO vo = bizBasicService.searchLessonTrun(param);
			if (vo == null || vo.getLsnTrnIdx() == 0) {
				iResult = bizBasicService.addLessonTrun(param);
				param.setLsnTrnIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonTrun(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonTrun => addLessonTrun
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonTrun")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonTrun(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonTrun(param);
			param.setLsnTrnIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonTrun => modifyLessonTrun
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonTrun")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonTrun(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonTrun(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonTrun => removeLessonTrun
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonTrun")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonTrun(HttpServletRequest request,
			@RequestBody LessonTrunVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonTrun(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LessonTurnStudentPaticipation =====
	/// =======================================================================

	/**
	 * search LessonTurnStudentPaticipation => searchLessonTurnStudentPaticipation
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTurnStudentPaticipation")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTurnStudentPaticipation(HttpServletRequest request,
			@RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonTurnStudentPaticipation(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonTurnStudentPaticipation List =>
	 * searchLessonTurnStudentPaticipationList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTurnStudentPaticipationList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTurnStudentPaticipationList(HttpServletRequest request,
			@RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLessonTurnStudentPaticipationList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LessonTurnStudentPaticipation List for Page =>
	 * searchLessonTurnStudentPaticipationList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTurnStudentPaticipationListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTurnStudentPaticipationListCount(
			HttpServletRequest request, @RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLessonTurnStudentPaticipationListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LessonTurnStudentPaticipation => saveLessonTurnStudentPaticipation
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLessonTurnStudentPaticipation")
	public ResponseEntity<Map<String, Object>> apiSaveLessonTurnStudentPaticipation(HttpServletRequest request,
			@RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LessonTurnStudentPaticipationVO vo = bizBasicService.searchLessonTurnStudentPaticipation(param);
			if (vo == null || vo.getLsnTrnStdntPtcptIdx() == 0) {
				iResult = bizBasicService.addLessonTurnStudentPaticipation(param);
				param.setLsnTrnStdntPtcptIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonTurnStudentPaticipation(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LessonTurnStudentPaticipation => addLessonTurnStudentPaticipation
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLessonTurnStudentPaticipation")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLessonTurnStudentPaticipation(HttpServletRequest request,
			@RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLessonTurnStudentPaticipation(param);
			param.setLsnTrnStdntPtcptIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LessonTurnStudentPaticipation => modifyLessonTurnStudentPaticipation
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLessonTurnStudentPaticipation")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLessonTurnStudentPaticipation(HttpServletRequest request,
			@RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLessonTurnStudentPaticipation(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LessonTurnStudentPaticipation => removeLessonTurnStudentPaticipation
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLessonTurnStudentPaticipation")
	public ResponseEntity<Map<String, Object>> apiRemoveLessonTurnStudentPaticipation(HttpServletRequest request,
			@RequestBody LessonTurnStudentPaticipationVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLessonTurnStudentPaticipation(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LectureFeePay =====
	/// =======================================================================

	/**
	 * search LectureFeePay => searchLectureFeePay
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePay")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePay(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLectureFeePay(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LectureFeePay List => searchLectureFeePayList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayList")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayList(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLectureFeePayList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LectureFeePay List for Page => searchLectureFeePayList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayListCount(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLectureFeePayListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LectureFeePay => saveLectureFeePay
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLectureFeePay")
	public ResponseEntity<Map<String, Object>> apiSaveLectureFeePay(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LectureFeePayVO vo = bizBasicService.searchLectureFeePay(param);
			if (vo == null || vo.getLtrFeePayIdx() == 0) {
				iResult = bizBasicService.addLectureFeePay(param);
				param.setLtrFeePayIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLectureFeePay(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LectureFeePay => addLectureFeePay
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLectureFeePay")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLectureFeePay(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLectureFeePay(param);
			param.setLtrFeePayIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LectureFeePay => modifyLectureFeePay
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLectureFeePay")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLectureFeePay(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLectureFeePay(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LectureFeePay => removeLectureFeePay
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLectureFeePay")
	public ResponseEntity<Map<String, Object>> apiRemoveLectureFeePay(HttpServletRequest request,
			@RequestBody LectureFeePayVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLectureFeePay(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== LectureFeePayAddDetail =====
	/// =======================================================================

	/**
	 * search LectureFeePayAddDetail => searchLectureFeePayAddDetail
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayAddDetail")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayAddDetail(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLectureFeePayAddDetail(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LectureFeePayAddDetail List => searchLectureFeePayAddDetailList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayAddDetailList")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayAddDetailList(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchLectureFeePayAddDetailList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search LectureFeePayAddDetail List for Page =>
	 * searchLectureFeePayAddDetailList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayAddDetailListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayAddDetailListCount(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchLectureFeePayAddDetailListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save LectureFeePayAddDetail => saveLectureFeePayAddDetail
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveLectureFeePayAddDetail")
	public ResponseEntity<Map<String, Object>> apiSaveLectureFeePayAddDetail(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			LectureFeePayAddDetailVO vo = bizBasicService.searchLectureFeePayAddDetail(param);
			if (vo == null || vo.getLtrFeePayAddDtlIdx() == 0) {
				iResult = bizBasicService.addLectureFeePayAddDetail(param);
				param.setLtrFeePayAddDtlIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLectureFeePayAddDetail(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add LectureFeePayAddDetail => addLectureFeePayAddDetail
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addLectureFeePayAddDetail")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddLectureFeePayAddDetail(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addLectureFeePayAddDetail(param);
			param.setLtrFeePayAddDtlIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify LectureFeePayAddDetail => modifyLectureFeePayAddDetail
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyLectureFeePayAddDetail")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyLectureFeePayAddDetail(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyLectureFeePayAddDetail(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove LectureFeePayAddDetail => removeLectureFeePayAddDetail
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeLectureFeePayAddDetail")
	public ResponseEntity<Map<String, Object>> apiRemoveLectureFeePayAddDetail(HttpServletRequest request,
			@RequestBody LectureFeePayAddDetailVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeLectureFeePayAddDetail(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== Menu =====
	/// =======================================================================

	/**
	 * search Menu => searchMenu
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenu")
	public ResponseEntity<Map<String, Object>> apiSearchMenu(HttpServletRequest request, @RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMenu(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Menu List => searchMenuList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuList")
	public ResponseEntity<Map<String, Object>> apiSearchMenuList(HttpServletRequest request,
			@RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMenuList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Menu List for Page => searchMenuList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuListCount")
	public ResponseEntity<Map<String, Object>> apiSearchMenuListCount(HttpServletRequest request,
			@RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchMenuListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save Menu => saveMenu
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveMenu")
	public ResponseEntity<Map<String, Object>> apiSaveMenu(HttpServletRequest request, @RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			MenuVO vo = bizBasicService.searchMenu(param);
			if (vo == null || vo.getMnuIdx() == 0) {
				iResult = bizBasicService.addMenu(param);
				param.setMnuIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMenu(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add Menu => addMenu
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addMenu")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddMenu(HttpServletRequest request, @RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addMenu(param);
			param.setMnuIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify Menu => modifyMenu
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyMenu")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyMenu(HttpServletRequest request, @RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyMenu(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove Menu => removeMenu
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeMenu")
	public ResponseEntity<Map<String, Object>> apiRemoveMenu(HttpServletRequest request, @RequestBody MenuVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeMenu(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== MenuAccessLog =====
	/// =======================================================================

	/**
	 * search MenuAccessLog => searchMenuAccessLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAccessLog")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAccessLog(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMenuAccessLog(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search MenuAccessLog List => searchMenuAccessLogList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAccessLogList")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAccessLogList(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMenuAccessLogList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search MenuAccessLog List for Page => searchMenuAccessLogList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAccessLogListCount")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAccessLogListCount(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchMenuAccessLogListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save MenuAccessLog => saveMenuAccessLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveMenuAccessLog")
	public ResponseEntity<Map<String, Object>> apiSaveMenuAccessLog(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			MenuAccessLogVO vo = bizBasicService.searchMenuAccessLog(param);
			if (vo == null || vo.getIdx() == 0) {
				iResult = bizBasicService.addMenuAccessLog(param);
				param.setIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMenuAccessLog(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add MenuAccessLog => addMenuAccessLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addMenuAccessLog")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddMenuAccessLog(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addMenuAccessLog(param);
			param.setIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify MenuAccessLog => modifyMenuAccessLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyMenuAccessLog")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyMenuAccessLog(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyMenuAccessLog(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove MenuAccessLog => removeMenuAccessLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeMenuAccessLog")
	public ResponseEntity<Map<String, Object>> apiRemoveMenuAccessLog(HttpServletRequest request,
			@RequestBody MenuAccessLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeMenuAccessLog(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== MenuAuth =====
	/// =======================================================================

	/**
	 * search MenuAuth => searchMenuAuth
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAuth")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAuth(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMenuAuth(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search MenuAuth List => searchMenuAuthList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAuthList")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAuthList(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMenuAuthList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search MenuAuth List for Page => searchMenuAuthList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAuthListCount")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAuthListCount(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchMenuAuthListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save MenuAuth => saveMenuAuth
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveMenuAuth")
	public ResponseEntity<Map<String, Object>> apiSaveMenuAuth(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			MenuAuthVO vo = bizBasicService.searchMenuAuth(param);
			if (vo == null || vo.getMnuAthIdx() == 0) {
				iResult = bizBasicService.addMenuAuth(param);
				param.setMnuAthIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMenuAuth(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add MenuAuth => addMenuAuth
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addMenuAuth")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddMenuAuth(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addMenuAuth(param);
			param.setMnuAthIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify MenuAuth => modifyMenuAuth
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyMenuAuth")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyMenuAuth(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyMenuAuth(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove MenuAuth => removeMenuAuth
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeMenuAuth")
	public ResponseEntity<Map<String, Object>> apiRemoveMenuAuth(HttpServletRequest request,
			@RequestBody MenuAuthVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeMenuAuth(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== MessageSend =====
	/// =======================================================================

	/**
	 * search MessageSend => searchMessageSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMessageSend")
	public ResponseEntity<Map<String, Object>> apiSearchMessageSend(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMessageSend(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search MessageSend List => searchMessageSendList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMessageSendList")
	public ResponseEntity<Map<String, Object>> apiSearchMessageSendList(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchMessageSendList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search MessageSend List for Page => searchMessageSendList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMessageSendListCount")
	public ResponseEntity<Map<String, Object>> apiSearchMessageSendListCount(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchMessageSendListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save MessageSend => saveMessageSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveMessageSend")
	public ResponseEntity<Map<String, Object>> apiSaveMessageSend(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			MessageSendVO vo = bizBasicService.searchMessageSend(param);
			if (vo == null || vo.getMsgSndIdx() == 0) {
				iResult = bizBasicService.addMessageSend(param);
				param.setMsgSndIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMessageSend(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add MessageSend => addMessageSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addMessageSend")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddMessageSend(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addMessageSend(param);
			param.setMsgSndIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify MessageSend => modifyMessageSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyMessageSend")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyMessageSend(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyMessageSend(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove MessageSend => removeMessageSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeMessageSend")
	public ResponseEntity<Map<String, Object>> apiRemoveMessageSend(HttpServletRequest request,
			@RequestBody MessageSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeMessageSend(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== Student =====
	/// =======================================================================

	/**
	 * search Student => searchStudent
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchStudent")
	public ResponseEntity<Map<String, Object>> apiSearchStudent(HttpServletRequest request,
			@RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchStudent(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Student List => searchStudentList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchStudentList")
	public ResponseEntity<Map<String, Object>> apiSearchStudentList(HttpServletRequest request,
			@RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchStudentList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Student List for Page => searchStudentList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchStudentListCount")
	public ResponseEntity<Map<String, Object>> apiSearchStudentListCount(HttpServletRequest request,
			@RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchStudentListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save Student => saveStudent
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveStudent")
	public ResponseEntity<Map<String, Object>> apiSaveStudent(HttpServletRequest request,
			@RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			StudentVO vo = bizBasicService.searchStudent(param);
			if (vo == null || vo.getStdntIdx() == 0) {
				iResult = bizBasicService.addStudent(param);
				param.setStdntIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyStudent(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add Student => addStudent
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addStudent")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddStudent(HttpServletRequest request, @RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addStudent(param);
			param.setStdntIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify Student => modifyStudent
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyStudent")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyStudent(HttpServletRequest request,
			@RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyStudent(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove Student => removeStudent
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeStudent")
	public ResponseEntity<Map<String, Object>> apiRemoveStudent(HttpServletRequest request,
			@RequestBody StudentVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeStudent(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== SystemLoginLog =====
	/// =======================================================================

	/**
	 * search SystemLoginLog => searchSystemLoginLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemLoginLog")
	public ResponseEntity<Map<String, Object>> apiSearchSystemLoginLog(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchSystemLoginLog(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search SystemLoginLog List => searchSystemLoginLogList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemLoginLogList")
	public ResponseEntity<Map<String, Object>> apiSearchSystemLoginLogList(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchSystemLoginLogList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search SystemLoginLog List for Page => searchSystemLoginLogList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemLoginLogListCount")
	public ResponseEntity<Map<String, Object>> apiSearchSystemLoginLogListCount(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchSystemLoginLogListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save SystemLoginLog => saveSystemLoginLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveSystemLoginLog")
	public ResponseEntity<Map<String, Object>> apiSaveSystemLoginLog(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			SystemLoginLogVO vo = bizBasicService.searchSystemLoginLog(param);
			if (vo == null || vo.getIdx() == 0) {
				iResult = bizBasicService.addSystemLoginLog(param);
				param.setIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifySystemLoginLog(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add SystemLoginLog => addSystemLoginLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addSystemLoginLog")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddSystemLoginLog(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addSystemLoginLog(param);
			param.setIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify SystemLoginLog => modifySystemLoginLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifySystemLoginLog")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifySystemLoginLog(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifySystemLoginLog(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove SystemLoginLog => removeSystemLoginLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeSystemLoginLog")
	public ResponseEntity<Map<String, Object>> apiRemoveSystemLoginLog(HttpServletRequest request,
			@RequestBody SystemLoginLogVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeSystemLoginLog(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== SystemUser =====
	/// =======================================================================

	/**
	 * search SystemUser => searchSystemUser
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemUser")
	public ResponseEntity<Map<String, Object>> apiSearchSystemUser(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchSystemUser(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search SystemUser List => searchSystemUserList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemUserList")
	public ResponseEntity<Map<String, Object>> apiSearchSystemUserList(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchSystemUserList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search SystemUser List for Page => searchSystemUserList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemUserListCount")
	public ResponseEntity<Map<String, Object>> apiSearchSystemUserListCount(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchSystemUserListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save SystemUser => saveSystemUser
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveSystemUser")
	public ResponseEntity<Map<String, Object>> apiSaveSystemUser(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			SystemUserVO vo = bizBasicService.searchSystemUser(param);
			if (vo == null || vo.getUsrIdx() == 0) {
				iResult = bizBasicService.addSystemUser(param);
				param.setUsrIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifySystemUser(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add SystemUser => addSystemUser
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addSystemUser")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddSystemUser(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addSystemUser(param);
			param.setUsrIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify SystemUser => modifySystemUser
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifySystemUser")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifySystemUser(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifySystemUser(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove SystemUser => removeSystemUser
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeSystemUser")
	public ResponseEntity<Map<String, Object>> apiRemoveSystemUser(HttpServletRequest request,
			@RequestBody SystemUserVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeSystemUser(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== Teacher =====
	/// =======================================================================

	/**
	 * search Teacher => searchTeacher
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacher")
	public ResponseEntity<Map<String, Object>> apiSearchTeacher(HttpServletRequest request,
			@RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchTeacher(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Teacher List => searchTeacherList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacherList")
	public ResponseEntity<Map<String, Object>> apiSearchTeacherList(HttpServletRequest request,
			@RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchTeacherList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Teacher List for Page => searchTeacherList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacherListCount")
	public ResponseEntity<Map<String, Object>> apiSearchTeacherListCount(HttpServletRequest request,
			@RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchTeacherListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save Teacher => saveTeacher
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveTeacher")
	public ResponseEntity<Map<String, Object>> apiSaveTeacher(HttpServletRequest request,
			@RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			TeacherVO vo = bizBasicService.searchTeacher(param);
			if (vo == null || vo.getTchrIdx() == 0) {
				iResult = bizBasicService.addTeacher(param);
				param.setTchrIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyTeacher(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add Teacher => addTeacher
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addTeacher")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddTeacher(HttpServletRequest request, @RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addTeacher(param);
			param.setTchrIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify Teacher => modifyTeacher
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyTeacher")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyTeacher(HttpServletRequest request,
			@RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyTeacher(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove Teacher => removeTeacher
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeTeacher")
	public ResponseEntity<Map<String, Object>> apiRemoveTeacher(HttpServletRequest request,
			@RequestBody TeacherVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeTeacher(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== TeacherLectureFee =====
	/// =======================================================================

	/**
	 * search TeacherLectureFee => searchTeacherLectureFee
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacherLectureFee")
	public ResponseEntity<Map<String, Object>> apiSearchTeacherLectureFee(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchTeacherLectureFee(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search TeacherLectureFee List => searchTeacherLectureFeeList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacherLectureFeeList")
	public ResponseEntity<Map<String, Object>> apiSearchTeacherLectureFeeList(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchTeacherLectureFeeList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search TeacherLectureFee List for Page => searchTeacherLectureFeeList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacherLectureFeeListCount")
	public ResponseEntity<Map<String, Object>> apiSearchTeacherLectureFeeListCount(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchTeacherLectureFeeListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save TeacherLectureFee => saveTeacherLectureFee
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveTeacherLectureFee")
	public ResponseEntity<Map<String, Object>> apiSaveTeacherLectureFee(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			TeacherLectureFeeVO vo = bizBasicService.searchTeacherLectureFee(param);
			if (vo == null || vo.getTchrLtrFeeIdx() == 0) {
				iResult = bizBasicService.addTeacherLectureFee(param);
				param.setTchrLtrFeeIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyTeacherLectureFee(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add TeacherLectureFee => addTeacherLectureFee
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addTeacherLectureFee")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddTeacherLectureFee(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addTeacherLectureFee(param);
			param.setTchrLtrFeeIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify TeacherLectureFee => modifyTeacherLectureFee
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyTeacherLectureFee")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyTeacherLectureFee(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyTeacherLectureFee(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove TeacherLectureFee => removeTeacherLectureFee
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeTeacherLectureFee")
	public ResponseEntity<Map<String, Object>> apiRemoveTeacherLectureFee(HttpServletRequest request,
			@RequestBody TeacherLectureFeeVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeTeacherLectureFee(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== Team =====
	/// =======================================================================

	/**
	 * search Team => searchTeam
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeam")
	public ResponseEntity<Map<String, Object>> apiSearchTeam(HttpServletRequest request, @RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchTeam(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Team List => searchTeamList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeamList")
	public ResponseEntity<Map<String, Object>> apiSearchTeamList(HttpServletRequest request,
			@RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchTeamList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search Team List for Page => searchTeamList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeamListCount")
	public ResponseEntity<Map<String, Object>> apiSearchTeamListCount(HttpServletRequest request,
			@RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchTeamListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save Team => saveTeam
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveTeam")
	public ResponseEntity<Map<String, Object>> apiSaveTeam(HttpServletRequest request, @RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			TeamVO vo = bizBasicService.searchTeam(param);
			if (vo == null || vo.getTeamIdx() == 0) {
				iResult = bizBasicService.addTeam(param);
				param.setTeamIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyTeam(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add Team => addTeam
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addTeam")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddTeam(HttpServletRequest request, @RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addTeam(param);
			param.setTeamIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify Team => modifyTeam
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyTeam")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyTeam(HttpServletRequest request, @RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyTeam(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove Team => removeTeam
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeTeam")
	public ResponseEntity<Map<String, Object>> apiRemoveTeam(HttpServletRequest request, @RequestBody TeamVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeTeam(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/// ===== UnpaidSend =====
	/// =======================================================================

	/**
	 * search UnpaidSend => searchUnpaidSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchUnpaidSend")
	public ResponseEntity<Map<String, Object>> apiSearchUnpaidSend(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchUnpaidSend(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search UnpaidSend List => searchUnpaidSendList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchUnpaidSendList")
	public ResponseEntity<Map<String, Object>> apiSearchUnpaidSendList(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			Object vo = bizBasicService.searchUnpaidSendList(param);
			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * search UnpaidSend List for Page => searchUnpaidSendList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchUnpaidSendListCount")
	public ResponseEntity<Map<String, Object>> apiSearchUnpaidSendListCount(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int count = bizBasicService.searchUnpaidSendListCount(param);
			resultData = new ResultData(true, count);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}

	/**
	 * save UnpaidSend => saveUnpaidSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/saveUnpaidSend")
	public ResponseEntity<Map<String, Object>> apiSaveUnpaidSend(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = 0;

			UnpaidSendVO vo = bizBasicService.searchUnpaidSend(param);
			if (vo == null || vo.getUnpdSndIdx() == 0) {
				iResult = bizBasicService.addUnpaidSend(param);
				param.setUnpdSndIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyUnpaidSend(param);
			}

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, vo);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * add UnpaidSend => addUnpaidSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/addUnpaidSend")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiAddUnpaidSend(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.addUnpaidSend(param);
			param.setUnpdSndIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * modify UnpaidSend => modifyUnpaidSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/modifyUnpaidSend")
	@Deprecated
	public ResponseEntity<Map<String, Object>> apiModifyUnpaidSend(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.modifyUnpaidSend(param);
			logger.debug(Integer.toString(iResult));

			resultData = new ResultData(true, iResult);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());
			

		}

		return resultData.getResponseEntity();
	}

	/**
	 * remove UnpaidSend => removeUnpaidSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */

	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/removeUnpaidSend")
	public ResponseEntity<Map<String, Object>> apiRemoveUnpaidSend(HttpServletRequest request,
			@RequestBody UnpaidSendVO param) {
		ResultData resultData = new ResultData(param);

		try {
			String loginMemberKey = getSessionMemberKey(request);
			resultData.setLoginMemberKey(loginMemberKey);

			int iResult = bizBasicService.removeUnpaidSend(param);
			logger.debug(Integer.toString(iResult));
			
			resultData = new ResultData(true, param);
		} catch (Exception e) {
			logger.error("Error:" + e.getMessage());

		}

		return resultData.getResponseEntity();
	}



}
