package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_SYS_USR / SystemUser | 시스템 사용자		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_SYS_USR extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int usrIdx; // 사용자 IDX 
	private String usrDivCd; // 공통코드002 
	private String usrPwd; // (임시사용) 
	private String usrPwd암호화; // 사용자 비밀번호 암호화 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setUsrIdx(int usrIdx) { 
		this.usrIdx = usrIdx; 
	} 
	public int getUsrIdx() { 
		return usrIdx; 
	} 
	
	public void setUsrDivCd(String usrDivCd) { 
		this.usrDivCd = usrDivCd; 
	} 
	public String getUsrDivCd() { 
		return usrDivCd; 
	} 
	
	public void setUsrPwd(String usrPwd) { 
		this.usrPwd = usrPwd; 
	} 
	public String getUsrPwd() { 
		return usrPwd; 
	} 
	
	public void setUsrPwd암호화(String usrPwd암호화) { 
		this.usrPwd암호화 = usrPwd암호화; 
	} 
	public String getUsrPwd암호화() { 
		return usrPwd암호화; 
	} 
	
	public void setUseYn(String useYn) { 
		this.useYn = useYn; 
	} 
	public String getUseYn() { 
		return useYn; 
	} 
	
	public void setCreDt(String creDt) { 
		this.creDt = creDt; 
	} 
	public String getCreDt() { 
		return creDt; 
	} 
	
	public void setCrePsn(String crePsn) { 
		this.crePsn = crePsn; 
	} 
	public String getCrePsn() { 
		return crePsn; 
	} 
	
	public void setUpdDt(String updDt) { 
		this.updDt = updDt; 
	} 
	public String getUpdDt() { 
		return updDt; 
	} 
	
	public void setUpdPsn(String updPsn) { 
		this.updPsn = updPsn; 
	} 
	public String getUpdPsn() { 
		return updPsn; 
	} 
	


}
