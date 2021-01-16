package dongovi2020.admin.teacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TeacherController {

	@RequestMapping("/teacher/teamList")
	public String teamList() throws Exception {
		return "teacher/teamList";
	}
	
	@RequestMapping("/teacher/teacherList")
	public String teacherList() throws Exception {
		return "teacher/teacherList";
	}
	
	
	// 수업 지역 리스트
	@RequestMapping("/teacher/areaList")
	public String areaList() throws Exception {
		return "teacher/areaList";
	}
	
	// 수업 장소 리스트
	@RequestMapping("/teacher/placeList")
	public String placeList() throws Exception {
		return "teacher/placeList";
	}
	
	// 수업 형태 리스트
	@RequestMapping("/teacher/lessonFormList")
	public String lessonFormList() throws Exception {
		return "teacher/lessonFormList";
	}
	
	// 수업 현황 리스트
	@RequestMapping("/teacher/lessonList")
	public String lessonList() throws Exception {
		return "teacher/lessonList";
	}
	
	// 수업 등록 - 연장
	@RequestMapping("/teacher/lessonRegisterProlong")
	public String lessonRegisterProlong() throws Exception {
		return "teacher/lessonRegisterProlong";
	}
	
	// 수업 등록 - 신규
	@RequestMapping("/teacher/lessonRegisterNew")
	public String lessonRegisterNew() throws Exception {
		return "teacher/lessonRegisterNew";
	}	
	
	// 교사 강의료 리스트 - 교사
	@RequestMapping("/teacher/teacherLectureFeeListTeacher")
	public String teacherLectureFeeList() throws Exception {
		return "teacher/teacherLectureFeeListTeacher";
	}
	
	// 교사 강의료 리스트 - 관리자
	@RequestMapping("/teacher/teacherLectureFeeListManager")
	public String teacherLectureFeeListManager() throws Exception {
		return "teacher/teacherLectureFeeListManager";
	}
}
