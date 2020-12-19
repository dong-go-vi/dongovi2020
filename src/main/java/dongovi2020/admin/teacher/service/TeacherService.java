package dongovi2020.admin.teacher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dongovi2020.admin.teacher.dao.TeacherDao;

/**
 * TeacherService
 * @author extoller
 * @since 2020.12.19 
 */
@Service
public class TeacherService {


	/** */
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);

	@Autowired
	private TeacherDao teacherDao;
	
	

}
