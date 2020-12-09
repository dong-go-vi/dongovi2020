package dongovi2020.base.common;

/**
 * 공통 결과 메세지 객체 Class
 * @author cwkim
 *
 */
public class Message implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String msg;
	private Object obj;
	
	public Message() {}
	
	public Message(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Message(String code, String msg, Object obj) {
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		
	}
	
}
