package dongovi2020.base.common;

public class BaseVO implements java.io.Serializable {
	
	private static final long serialVersionUID = -2698649262948243403L;
	
	//===== member variables =====
	
	// session login member id No. (=loginMbrNo) // Added in 2020-11-03
	private int loginMbrNo = 0;

	//===== getters and setters =====

	public int getLoginMbrNo() {
		return loginMbrNo;
	}

	public void setLoginMbrNo(int loginMbrNo) {
		this.loginMbrNo = loginMbrNo;
	}
	
}
