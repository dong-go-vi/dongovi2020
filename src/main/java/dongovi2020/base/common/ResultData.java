package dongovi2020.base.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * 
 * @author jskim
 *
 */
@SuppressWarnings("serial")
public class ResultData extends BaseVO {

	// ----- properties ----- 
	
	private int code = ResultData.CODE_MSG_FAIL_DEFAULT; 
	private String message = ResultData.MSG_FAIL_DEFAULT; 
	private Object object = null;
	
	private HashMap<String, Object> map = new HashMap<String, Object>();

	protected static final int CODE_LOGIN_NEED = 0;
	protected static final String MSG_LOGIN_NEED = "로그인이 필요합니다.";

	protected static final int CODE_SUCCESS_DEFAULT = 1;
	protected static final String MSG_SUCCESS_DEFAULT = "정상적으로 처리되었습니다.";

	protected static final int CODE_MSG_FAIL_DEFAULT = -1;
	protected static final String MSG_FAIL_DEFAULT = "처리 중 에러가 발생하였습니다.";
	
	// ----- constructor ----- 
	public ResultData() {
	}
	public ResultData(Object obj) {
		this.object = obj;
	}

	public ResultData(boolean isSuccess) {
		setDefault(isSuccess);
	}

	public ResultData(boolean isSuccess, Object obj) {
		setDefault(isSuccess, obj);
	}
	
	public ResultData(int code, String message, Object obj) {
		setCode(code);
		setMessage(message);
		setObject(obj);
	}
	
	// ----- functional method -----

	public void setDefault(boolean isSuccess) {
		if ( isSuccess ) {
			code = ResultData.CODE_SUCCESS_DEFAULT;
			message = ResultData.MSG_SUCCESS_DEFAULT;
		} else {
			code = ResultData.CODE_MSG_FAIL_DEFAULT;
			message = ResultData.MSG_FAIL_DEFAULT;
		}
	}
	
	public void setDefault(boolean isSuccess, Object obj) {
		setDefault(isSuccess);
		setObject(obj);
	}

	public void setDefault(int code, boolean isSuccess, Object obj) {
		setDefault(isSuccess);
		setCode(code);
		setObject(obj);
	}
	
	public void setLoginNeed() {
		code = ResultData.CODE_LOGIN_NEED;
		message = MSG_LOGIN_NEED;
		object = null;
	}
	
	public ResponseEntity<Map<String, Object>> getResponseEntity(){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		this.map.put("code", code);
		this.map.put("message", message);
		this.map.put("object", object);
		if ( code <= 0) {
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		}
		this.release();
		return responseEntity;
	}
	
	public void release() {
		this.object = null; 
		this.map = null;
		this.message = null; 
	}
	
	// ----- getter and setter ----- 
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object obj) {
		this.object = obj;
	}
	public HashMap<String, Object> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	
}
