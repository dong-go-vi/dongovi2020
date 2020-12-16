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
	
	private int code = -1; 
	private String message = "처리 중 에러가 발생하였습니다."; 
	private Object obj = null;
	private HttpStatus status = HttpStatus.OK;
	
	private HashMap<String, Object> map = new HashMap<String, Object>();

	protected static final String MSG_LOGIN_NEED = "로그인이 필요합니다.";
	protected static final String MSG_SUCCESS_DEFAULT = "정상적으로 처리되었습니다.";
	protected static final String MSG_FAIL_DEFAULT = "처리 중 에러가 발생하였습니다.";
	
	// ----- constructor ----- 
	public ResultData() {
	}
	public ResultData(Object obj) {
		this.obj = obj;
	}

	public ResultData(boolean isSuccess) {
		setDefault(isSuccess);
	}

	public ResultData(boolean isSuccess, Object obj) {
		setDefault(isSuccess, obj);
	}
	
	// ----- funtion method -----

	public void setDefault(boolean isSuccess) {
		if ( isSuccess ) {
			status = HttpStatus.OK;
			code = 1;
			message = ResultData.MSG_SUCCESS_DEFAULT;
		} else {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
			code = -1;
			message = ResultData.MSG_FAIL_DEFAULT;
		}
	}
	
	public void setDefault(boolean isSuccess, Object obj) {
		setDefault(isSuccess);
		setObj(obj);
	}

	public void setDefault(int code, boolean isSuccess, Object obj) {
		setDefault(isSuccess);
		setCode(code);
		setObj(obj);
	}
	
	public void setLoginNeed() {
		code = 0;
		message = MSG_LOGIN_NEED;
		status = HttpStatus.OK;
		obj = null;
	}
	
	public ResponseEntity<Map<String, Object>> getResponseEntity(){
		return new ResponseEntity<Map<String, Object>>(map, status);
	}
	
	public void release() {
		this.obj = null; 
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
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public HashMap<String, Object> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	
}
