package dongovi2020.admin.teacher.restful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dongovi2020.admin.teacher.service.TeacherService;
import dongovi2020.base.common.BaseRestful;



/**
 * TeacherRestful
 * @author extoller
 * @since 2020.12.19 
 */
@Controller
public class TeacherRestful extends BaseRestful {

	private static final Logger logger = LoggerFactory.getLogger(TeacherRestful.class);

	@Autowired
	private TeacherService teacherService;

}
