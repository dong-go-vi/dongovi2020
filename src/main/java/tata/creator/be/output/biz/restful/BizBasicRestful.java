package tata.creator.be.output.biz.restful;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tata.creator.be.output.biz.service.BizBasicService;
import dongovi2020.base.common.Constants;
import dongovi2020.base.common.Message;
import dongovi2020.base.common.MessageUtils;

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
 * BizBasicRestful
 * @author tata creator
 * @since 2020.12.05 
 */
@Controller
public class BizBasicRestful {

	private static final Logger logger = LoggerFactory.getLogger(BizBasicRestful.class);

	@Autowired
	private BizBasicService bizBasicService;

	/// ===== CommonCode ===== =======================================================================

	/**
	 * search CommonCode => searchCommonCode
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchCommonCode")
	public ResponseEntity<Map<String, Object>> apiSearchCommonCode(HttpServletRequest request, @ModelAttribute("param") CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchCommonCode(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchCommonCodeList(HttpServletRequest request, @ModelAttribute("param") CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchCommonCodeList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchCommonCodeListCount(HttpServletRequest request, @ModelAttribute("param") CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchCommonCodeListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveCommonCode(HttpServletRequest request, @RequestBody CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			CommonCodeVO vo = bizBasicService.searchCommonCode(param);
			if ( vo == null ) {
				iResult = bizBasicService.addCommonCode(param);
			} else {
				iResult = bizBasicService.modifyCommonCode(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddCommonCode(HttpServletRequest request, @RequestBody CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addCommonCode(param);

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyCommonCode(HttpServletRequest request, @ModelAttribute("param") CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyCommonCode(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveCommonCode(HttpServletRequest request, @ModelAttribute("param") CommonCodeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeCommonCode(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== Lesson ===== =======================================================================

	/**
	 * search Lesson => searchLesson
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLesson")
	public ResponseEntity<Map<String, Object>> apiSearchLesson(HttpServletRequest request, @ModelAttribute("param") LessonVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLesson(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonList(HttpServletRequest request, @ModelAttribute("param") LessonVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonListCount(HttpServletRequest request, @ModelAttribute("param") LessonVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonVO vo = bizBasicService.searchLesson(param);
			if ( vo == null || vo.getLsnIdx() == 0) {
				iResult = bizBasicService.addLesson(param);
				param.setLsnIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLesson(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLesson(param);
			param.setLsnIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLesson(HttpServletRequest request, @ModelAttribute("param") LessonVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLesson(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLesson(HttpServletRequest request, @ModelAttribute("param") LessonVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLesson(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonArea ===== =======================================================================

	/**
	 * search LessonArea => searchLessonArea
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonArea")
	public ResponseEntity<Map<String, Object>> apiSearchLessonArea(HttpServletRequest request, @ModelAttribute("param") LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonArea(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonAreaList(HttpServletRequest request, @ModelAttribute("param") LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonAreaList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonAreaListCount(HttpServletRequest request, @ModelAttribute("param") LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonAreaListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonArea(HttpServletRequest request, @RequestBody LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonAreaVO vo = bizBasicService.searchLessonArea(param);
			if ( vo == null ) {
				iResult = bizBasicService.addLessonArea(param);
			} else {
				iResult = bizBasicService.modifyLessonArea(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonArea(HttpServletRequest request, @RequestBody LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonArea(param);

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonArea(HttpServletRequest request, @ModelAttribute("param") LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonArea(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonArea(HttpServletRequest request, @ModelAttribute("param") LessonAreaVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonArea(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonForm ===== =======================================================================

	/**
	 * search LessonForm => searchLessonForm
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonForm")
	public ResponseEntity<Map<String, Object>> apiSearchLessonForm(HttpServletRequest request, @ModelAttribute("param") LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonForm(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonFormList(HttpServletRequest request, @ModelAttribute("param") LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonFormList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonFormListCount(HttpServletRequest request, @ModelAttribute("param") LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonFormListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonForm(HttpServletRequest request, @RequestBody LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonFormVO vo = bizBasicService.searchLessonForm(param);
			if ( vo == null ) {
				iResult = bizBasicService.addLessonForm(param);
			} else {
				iResult = bizBasicService.modifyLessonForm(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonForm(HttpServletRequest request, @RequestBody LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonForm(param);

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonForm(HttpServletRequest request, @ModelAttribute("param") LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonForm(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonForm(HttpServletRequest request, @ModelAttribute("param") LessonFormVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonForm(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonPlace ===== =======================================================================

	/**
	 * search LessonPlace => searchLessonPlace
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonPlace")
	public ResponseEntity<Map<String, Object>> apiSearchLessonPlace(HttpServletRequest request, @ModelAttribute("param") LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonPlace(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonPlaceList(HttpServletRequest request, @ModelAttribute("param") LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonPlaceList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonPlaceListCount(HttpServletRequest request, @ModelAttribute("param") LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonPlaceListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonPlace(HttpServletRequest request, @RequestBody LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonPlaceVO vo = bizBasicService.searchLessonPlace(param);
			if ( vo == null ) {
				iResult = bizBasicService.addLessonPlace(param);
			} else {
				iResult = bizBasicService.modifyLessonPlace(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonPlace(HttpServletRequest request, @RequestBody LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonPlace(param);

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonPlace(HttpServletRequest request, @ModelAttribute("param") LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonPlace(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonPlace(HttpServletRequest request, @ModelAttribute("param") LessonPlaceVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonPlace(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonStudentConstitue ===== =======================================================================

	/**
	 * search LessonStudentConstitue => searchLessonStudentConstitue
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentConstitue")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentConstitue(HttpServletRequest request, @ModelAttribute("param") LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonStudentConstitue(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentConstitueList(HttpServletRequest request, @ModelAttribute("param") LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonStudentConstitueList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/**
	 * search LessonStudentConstitue List for Page => searchLessonStudentConstitueList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentConstitueListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentConstitueListCount(HttpServletRequest request, @ModelAttribute("param") LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonStudentConstitueListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonStudentConstitue(HttpServletRequest request, @RequestBody LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonStudentConstitueVO vo = bizBasicService.searchLessonStudentConstitue(param);
			if ( vo == null || vo.getLsnStdntCsttIdx() == 0) {
				iResult = bizBasicService.addLessonStudentConstitue(param);
				param.setLsnStdntCsttIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonStudentConstitue(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonStudentConstitue(HttpServletRequest request, @RequestBody LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonStudentConstitue(param);
			param.setLsnStdntCsttIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonStudentConstitue(HttpServletRequest request, @ModelAttribute("param") LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonStudentConstitue(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonStudentConstitue(HttpServletRequest request, @ModelAttribute("param") LessonStudentConstitueVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonStudentConstitue(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonStudentTuitionDeposit ===== =======================================================================

	/**
	 * search LessonStudentTuitionDeposit => searchLessonStudentTuitionDeposit
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentTuitionDeposit")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentTuitionDeposit(HttpServletRequest request, @ModelAttribute("param") LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonStudentTuitionDeposit(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/**
	 * search LessonStudentTuitionDeposit List => searchLessonStudentTuitionDepositList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentTuitionDepositList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentTuitionDepositList(HttpServletRequest request, @ModelAttribute("param") LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonStudentTuitionDepositList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/**
	 * search LessonStudentTuitionDeposit List for Page => searchLessonStudentTuitionDepositList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonStudentTuitionDepositListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonStudentTuitionDepositListCount(HttpServletRequest request, @ModelAttribute("param") LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonStudentTuitionDepositListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonStudentTuitionDeposit(HttpServletRequest request, @RequestBody LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonStudentTuitionDepositVO vo = bizBasicService.searchLessonStudentTuitionDeposit(param);
			if ( vo == null || vo.getLsnStdntTtnDpstIdx() == 0) {
				iResult = bizBasicService.addLessonStudentTuitionDeposit(param);
				param.setLsnStdntTtnDpstIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonStudentTuitionDeposit(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonStudentTuitionDeposit(HttpServletRequest request, @RequestBody LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonStudentTuitionDeposit(param);
			param.setLsnStdntTtnDpstIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonStudentTuitionDeposit(HttpServletRequest request, @ModelAttribute("param") LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonStudentTuitionDeposit(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonStudentTuitionDeposit(HttpServletRequest request, @ModelAttribute("param") LessonStudentTuitionDepositVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonStudentTuitionDeposit(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonTrun ===== =======================================================================

	/**
	 * search LessonTrun => searchLessonTrun
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTrun")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTrun(HttpServletRequest request, @ModelAttribute("param") LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonTrun(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonTrunList(HttpServletRequest request, @ModelAttribute("param") LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonTrunList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLessonTrunListCount(HttpServletRequest request, @ModelAttribute("param") LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonTrunListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonTrun(HttpServletRequest request, @RequestBody LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonTrunVO vo = bizBasicService.searchLessonTrun(param);
			if ( vo == null || vo.getLsnTrnIdx() == 0) {
				iResult = bizBasicService.addLessonTrun(param);
				param.setLsnTrnIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonTrun(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonTrun(HttpServletRequest request, @RequestBody LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonTrun(param);
			param.setLsnTrnIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonTrun(HttpServletRequest request, @ModelAttribute("param") LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonTrun(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonTrun(HttpServletRequest request, @ModelAttribute("param") LessonTrunVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonTrun(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LessonTurnStudentPaticipation ===== =======================================================================

	/**
	 * search LessonTurnStudentPaticipation => searchLessonTurnStudentPaticipation
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTurnStudentPaticipation")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTurnStudentPaticipation(HttpServletRequest request, @ModelAttribute("param") LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLessonTurnStudentPaticipation(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/**
	 * search LessonTurnStudentPaticipation List => searchLessonTurnStudentPaticipationList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTurnStudentPaticipationList")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTurnStudentPaticipationList(HttpServletRequest request, @ModelAttribute("param") LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLessonTurnStudentPaticipationList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/**
	 * search LessonTurnStudentPaticipation List for Page => searchLessonTurnStudentPaticipationList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLessonTurnStudentPaticipationListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLessonTurnStudentPaticipationListCount(HttpServletRequest request, @ModelAttribute("param") LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLessonTurnStudentPaticipationListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLessonTurnStudentPaticipation(HttpServletRequest request, @RequestBody LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LessonTurnStudentPaticipationVO vo = bizBasicService.searchLessonTurnStudentPaticipation(param);
			if ( vo == null || vo.getLsnTrnStdntPtcptIdx() == 0) {
				iResult = bizBasicService.addLessonTurnStudentPaticipation(param);
				param.setLsnTrnStdntPtcptIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLessonTurnStudentPaticipation(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLessonTurnStudentPaticipation(HttpServletRequest request, @RequestBody LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLessonTurnStudentPaticipation(param);
			param.setLsnTrnStdntPtcptIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLessonTurnStudentPaticipation(HttpServletRequest request, @ModelAttribute("param") LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLessonTurnStudentPaticipation(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLessonTurnStudentPaticipation(HttpServletRequest request, @ModelAttribute("param") LessonTurnStudentPaticipationVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLessonTurnStudentPaticipation(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LectureFeePay ===== =======================================================================

	/**
	 * search LectureFeePay => searchLectureFeePay
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePay")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePay(HttpServletRequest request, @ModelAttribute("param") LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLectureFeePay(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayList(HttpServletRequest request, @ModelAttribute("param") LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLectureFeePayList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayListCount(HttpServletRequest request, @ModelAttribute("param") LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLectureFeePayListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLectureFeePay(HttpServletRequest request, @RequestBody LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LectureFeePayVO vo = bizBasicService.searchLectureFeePay(param);
			if ( vo == null || vo.getLtrFeePayIdx() == 0) {
				iResult = bizBasicService.addLectureFeePay(param);
				param.setLtrFeePayIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLectureFeePay(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLectureFeePay(HttpServletRequest request, @RequestBody LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLectureFeePay(param);
			param.setLtrFeePayIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLectureFeePay(HttpServletRequest request, @ModelAttribute("param") LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLectureFeePay(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLectureFeePay(HttpServletRequest request, @ModelAttribute("param") LectureFeePayVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLectureFeePay(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== LectureFeePayAddDetail ===== =======================================================================

	/**
	 * search LectureFeePayAddDetail => searchLectureFeePayAddDetail
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayAddDetail")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayAddDetail(HttpServletRequest request, @ModelAttribute("param") LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchLectureFeePayAddDetail(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayAddDetailList(HttpServletRequest request, @ModelAttribute("param") LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchLectureFeePayAddDetailList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/**
	 * search LectureFeePayAddDetail List for Page => searchLectureFeePayAddDetailList
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchLectureFeePayAddDetailListCount")
	public ResponseEntity<Map<String, Object>> apiSearchLectureFeePayAddDetailListCount(HttpServletRequest request, @ModelAttribute("param") LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchLectureFeePayAddDetailListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveLectureFeePayAddDetail(HttpServletRequest request, @RequestBody LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			LectureFeePayAddDetailVO vo = bizBasicService.searchLectureFeePayAddDetail(param);
			if ( vo == null || vo.getLtrFeePayAddDtlIdx() == 0) {
				iResult = bizBasicService.addLectureFeePayAddDetail(param);
				param.setLtrFeePayAddDtlIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyLectureFeePayAddDetail(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddLectureFeePayAddDetail(HttpServletRequest request, @RequestBody LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addLectureFeePayAddDetail(param);
			param.setLtrFeePayAddDtlIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyLectureFeePayAddDetail(HttpServletRequest request, @ModelAttribute("param") LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyLectureFeePayAddDetail(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveLectureFeePayAddDetail(HttpServletRequest request, @ModelAttribute("param") LectureFeePayAddDetailVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeLectureFeePayAddDetail(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== Menu ===== =======================================================================

	/**
	 * search Menu => searchMenu
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenu")
	public ResponseEntity<Map<String, Object>> apiSearchMenu(HttpServletRequest request, @ModelAttribute("param") MenuVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchMenu(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMenuList(HttpServletRequest request, @ModelAttribute("param") MenuVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchMenuList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMenuListCount(HttpServletRequest request, @ModelAttribute("param") MenuVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchMenuListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			MenuVO vo = bizBasicService.searchMenu(param);
			if ( vo == null || vo.getMnuIdx() == 0) {
				iResult = bizBasicService.addMenu(param);
				param.setMnuIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMenu(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addMenu(param);
			param.setMnuIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyMenu(HttpServletRequest request, @ModelAttribute("param") MenuVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyMenu(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveMenu(HttpServletRequest request, @ModelAttribute("param") MenuVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeMenu(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== MenuAccessLog ===== =======================================================================

	/**
	 * search MenuAccessLog => searchMenuAccessLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAccessLog")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAccessLog(HttpServletRequest request, @ModelAttribute("param") MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchMenuAccessLog(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMenuAccessLogList(HttpServletRequest request, @ModelAttribute("param") MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchMenuAccessLogList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMenuAccessLogListCount(HttpServletRequest request, @ModelAttribute("param") MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchMenuAccessLogListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveMenuAccessLog(HttpServletRequest request, @RequestBody MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			MenuAccessLogVO vo = bizBasicService.searchMenuAccessLog(param);
			if ( vo == null || vo.getIdx() == 0) {
				iResult = bizBasicService.addMenuAccessLog(param);
				param.setIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMenuAccessLog(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddMenuAccessLog(HttpServletRequest request, @RequestBody MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addMenuAccessLog(param);
			param.setIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyMenuAccessLog(HttpServletRequest request, @ModelAttribute("param") MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyMenuAccessLog(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveMenuAccessLog(HttpServletRequest request, @ModelAttribute("param") MenuAccessLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeMenuAccessLog(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== MenuAuth ===== =======================================================================

	/**
	 * search MenuAuth => searchMenuAuth
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMenuAuth")
	public ResponseEntity<Map<String, Object>> apiSearchMenuAuth(HttpServletRequest request, @ModelAttribute("param") MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchMenuAuth(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMenuAuthList(HttpServletRequest request, @ModelAttribute("param") MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchMenuAuthList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMenuAuthListCount(HttpServletRequest request, @ModelAttribute("param") MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchMenuAuthListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveMenuAuth(HttpServletRequest request, @RequestBody MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			MenuAuthVO vo = bizBasicService.searchMenuAuth(param);
			if ( vo == null || vo.getMnuAthIdx() == 0) {
				iResult = bizBasicService.addMenuAuth(param);
				param.setMnuAthIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMenuAuth(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddMenuAuth(HttpServletRequest request, @RequestBody MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addMenuAuth(param);
			param.setMnuAthIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyMenuAuth(HttpServletRequest request, @ModelAttribute("param") MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyMenuAuth(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveMenuAuth(HttpServletRequest request, @ModelAttribute("param") MenuAuthVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeMenuAuth(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== MessageSend ===== =======================================================================

	/**
	 * search MessageSend => searchMessageSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchMessageSend")
	public ResponseEntity<Map<String, Object>> apiSearchMessageSend(HttpServletRequest request, @ModelAttribute("param") MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchMessageSend(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMessageSendList(HttpServletRequest request, @ModelAttribute("param") MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchMessageSendList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchMessageSendListCount(HttpServletRequest request, @ModelAttribute("param") MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchMessageSendListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveMessageSend(HttpServletRequest request, @RequestBody MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			MessageSendVO vo = bizBasicService.searchMessageSend(param);
			if ( vo == null || vo.getMsgSndIdx() == 0) {
				iResult = bizBasicService.addMessageSend(param);
				param.setMsgSndIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyMessageSend(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddMessageSend(HttpServletRequest request, @RequestBody MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addMessageSend(param);
			param.setMsgSndIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyMessageSend(HttpServletRequest request, @ModelAttribute("param") MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyMessageSend(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveMessageSend(HttpServletRequest request, @ModelAttribute("param") MessageSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeMessageSend(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== Student ===== =======================================================================

	/**
	 * search Student => searchStudent
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchStudent")
	public ResponseEntity<Map<String, Object>> apiSearchStudent(HttpServletRequest request, @ModelAttribute("param") StudentVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchStudent(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchStudentList(HttpServletRequest request, @ModelAttribute("param") StudentVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchStudentList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchStudentListCount(HttpServletRequest request, @ModelAttribute("param") StudentVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchStudentListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveStudent(HttpServletRequest request, @RequestBody StudentVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			StudentVO vo = bizBasicService.searchStudent(param);
			if ( vo == null || vo.getStdntIdx() == 0) {
				iResult = bizBasicService.addStudent(param);
				param.setStdntIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyStudent(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addStudent(param);
			param.setStdntIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyStudent(HttpServletRequest request, @ModelAttribute("param") StudentVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyStudent(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveStudent(HttpServletRequest request, @ModelAttribute("param") StudentVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeStudent(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== SystemLoginLog ===== =======================================================================

	/**
	 * search SystemLoginLog => searchSystemLoginLog
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemLoginLog")
	public ResponseEntity<Map<String, Object>> apiSearchSystemLoginLog(HttpServletRequest request, @ModelAttribute("param") SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchSystemLoginLog(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchSystemLoginLogList(HttpServletRequest request, @ModelAttribute("param") SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchSystemLoginLogList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchSystemLoginLogListCount(HttpServletRequest request, @ModelAttribute("param") SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchSystemLoginLogListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveSystemLoginLog(HttpServletRequest request, @RequestBody SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			SystemLoginLogVO vo = bizBasicService.searchSystemLoginLog(param);
			if ( vo == null || vo.getIdx() == 0) {
				iResult = bizBasicService.addSystemLoginLog(param);
				param.setIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifySystemLoginLog(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddSystemLoginLog(HttpServletRequest request, @RequestBody SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addSystemLoginLog(param);
			param.setIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifySystemLoginLog(HttpServletRequest request, @ModelAttribute("param") SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifySystemLoginLog(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveSystemLoginLog(HttpServletRequest request, @ModelAttribute("param") SystemLoginLogVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeSystemLoginLog(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== SystemUser ===== =======================================================================

	/**
	 * search SystemUser => searchSystemUser
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchSystemUser")
	public ResponseEntity<Map<String, Object>> apiSearchSystemUser(HttpServletRequest request, @ModelAttribute("param") SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchSystemUser(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchSystemUserList(HttpServletRequest request, @ModelAttribute("param") SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchSystemUserList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchSystemUserListCount(HttpServletRequest request, @ModelAttribute("param") SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchSystemUserListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveSystemUser(HttpServletRequest request, @RequestBody SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			SystemUserVO vo = bizBasicService.searchSystemUser(param);
			if ( vo == null || vo.getUsrIdx() == 0) {
				iResult = bizBasicService.addSystemUser(param);
				param.setUsrIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifySystemUser(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddSystemUser(HttpServletRequest request, @RequestBody SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addSystemUser(param);
			param.setUsrIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifySystemUser(HttpServletRequest request, @ModelAttribute("param") SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifySystemUser(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveSystemUser(HttpServletRequest request, @ModelAttribute("param") SystemUserVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeSystemUser(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== Teacher ===== =======================================================================

	/**
	 * search Teacher => searchTeacher
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacher")
	public ResponseEntity<Map<String, Object>> apiSearchTeacher(HttpServletRequest request, @ModelAttribute("param") TeacherVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchTeacher(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchTeacherList(HttpServletRequest request, @ModelAttribute("param") TeacherVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchTeacherList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchTeacherListCount(HttpServletRequest request, @ModelAttribute("param") TeacherVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchTeacherListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveTeacher(HttpServletRequest request, @RequestBody TeacherVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			TeacherVO vo = bizBasicService.searchTeacher(param);
			if ( vo == null || vo.getTchrIdx() == 0) {
				iResult = bizBasicService.addTeacher(param);
				param.setTchrIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyTeacher(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addTeacher(param);
			param.setTchrIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyTeacher(HttpServletRequest request, @ModelAttribute("param") TeacherVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyTeacher(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveTeacher(HttpServletRequest request, @ModelAttribute("param") TeacherVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeTeacher(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== TeacherLectureFee ===== =======================================================================

	/**
	 * search TeacherLectureFee => searchTeacherLectureFee
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeacherLectureFee")
	public ResponseEntity<Map<String, Object>> apiSearchTeacherLectureFee(HttpServletRequest request, @ModelAttribute("param") TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchTeacherLectureFee(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchTeacherLectureFeeList(HttpServletRequest request, @ModelAttribute("param") TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchTeacherLectureFeeList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchTeacherLectureFeeListCount(HttpServletRequest request, @ModelAttribute("param") TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchTeacherLectureFeeListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveTeacherLectureFee(HttpServletRequest request, @RequestBody TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			TeacherLectureFeeVO vo = bizBasicService.searchTeacherLectureFee(param);
			if ( vo == null || vo.getTchrLtrFeeIdx() == 0) {
				iResult = bizBasicService.addTeacherLectureFee(param);
				param.setTchrLtrFeeIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyTeacherLectureFee(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddTeacherLectureFee(HttpServletRequest request, @RequestBody TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addTeacherLectureFee(param);
			param.setTchrLtrFeeIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyTeacherLectureFee(HttpServletRequest request, @ModelAttribute("param") TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyTeacherLectureFee(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveTeacherLectureFee(HttpServletRequest request, @ModelAttribute("param") TeacherLectureFeeVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeTeacherLectureFee(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== Team ===== =======================================================================

	/**
	 * search Team => searchTeam
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchTeam")
	public ResponseEntity<Map<String, Object>> apiSearchTeam(HttpServletRequest request, @ModelAttribute("param") TeamVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchTeam(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchTeamList(HttpServletRequest request, @ModelAttribute("param") TeamVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchTeamList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchTeamListCount(HttpServletRequest request, @ModelAttribute("param") TeamVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchTeamListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			TeamVO vo = bizBasicService.searchTeam(param);
			if ( vo == null || vo.getTeamIdx() == 0) {
				iResult = bizBasicService.addTeam(param);
				param.setTeamIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyTeam(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addTeam(param);
			param.setTeamIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyTeam(HttpServletRequest request, @ModelAttribute("param") TeamVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyTeam(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveTeam(HttpServletRequest request, @ModelAttribute("param") TeamVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeTeam(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}

	/// ===== UnpaidSend ===== =======================================================================

	/**
	 * search UnpaidSend => searchUnpaidSend
	 * 
	 * @param requestContext
	 * @param param
	 * @return ResponseEntity
	 */
	
	@ResponseBody
	@RequestMapping(value = "/api/bizbasic/searchUnpaidSend")
	public ResponseEntity<Map<String, Object>> apiSearchUnpaidSend(HttpServletRequest request, @ModelAttribute("param") UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("vo", bizBasicService.searchUnpaidSend(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchUnpaidSendList(HttpServletRequest request, @ModelAttribute("param") UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("list", bizBasicService.searchUnpaidSendList(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSearchUnpaidSendListCount(HttpServletRequest request, @ModelAttribute("param") UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			map.put("count", bizBasicService.searchUnpaidSendListCount(param));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_READ_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiSaveUnpaidSend(HttpServletRequest request, @RequestBody UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = 0;

			UnpaidSendVO vo = bizBasicService.searchUnpaidSend(param);
			if ( vo == null || vo.getUnpdSndIdx() == 0) {
				iResult = bizBasicService.addUnpaidSend(param);
				param.setUnpdSndIdx(iResult); // key setting
			} else {
				iResult = bizBasicService.modifyUnpaidSend(param);
			}

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiAddUnpaidSend(HttpServletRequest request, @RequestBody UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.addUnpaidSend(param);
			param.setUnpdSndIdx(iResult); // key setting

			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_REG_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_REG_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiModifyUnpaidSend(HttpServletRequest request, @ModelAttribute("param") UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.modifyUnpaidSend(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_MOD_SUCESS)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_MOD_FAIL)));
			map.put("vo", param);
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
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
	public ResponseEntity<Map<String, Object>> apiRemoveUnpaidSend(HttpServletRequest request, @ModelAttribute("param") UnpaidSendVO param) {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("loginMbrNo", getLoginUserKey(request));
		try {
			param.setLoginMbrNo(getLoginUserKey(request)); // vo에 로그인 id 세팅

			int iResult = bizBasicService.removeUnpaidSend(param);
			logger.debug(Integer.toString(iResult));
			map.put("msg", new Message("S002", MessageUtils.getMessage(Constants.FNT_DEL_SUCESS)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error:"+e.getMessage());
			map.put("msg", new Message("E002", MessageUtils.getMessage(Constants.FNT_DEL_FAIL)));
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		map = null;
		return responseEntity;
	}




	private int getLoginUserKey(HttpServletRequest request) {
		int key = 0;
		if ( request != null && request.getSession() != null && request.getSession().getAttribute("LOGIN_USER_ID") != null) {
			try {
				key = (int)request.getSession().getAttribute("LOGIN_USER_ID");
			} catch (Exception e) {
				logger.error("ERROR:" + request.getSession().getAttribute("LOGIN_USER_ID"));
				e = null;
			}
		}
		request = null; 
		return key;
	}

}
