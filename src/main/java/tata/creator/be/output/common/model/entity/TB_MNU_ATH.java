package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_MNU_ATH / MenuAuth | 메뉴 권한		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_MNU_ATH extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int mnuAthIdx; // 메뉴 권한 IDX 
	private int mnuIdx; // 메뉴 IDX 
	private String useAthCd; // 공통코드003 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setMnuAthIdx(int mnuAthIdx) { 
		this.mnuAthIdx = mnuAthIdx; 
	} 
	public int getMnuAthIdx() { 
		return mnuAthIdx; 
	} 
	
	public void setMnuIdx(int mnuIdx) { 
		this.mnuIdx = mnuIdx; 
	} 
	public int getMnuIdx() { 
		return mnuIdx; 
	} 
	
	public void setUseAthCd(String useAthCd) { 
		this.useAthCd = useAthCd; 
	} 
	public String getUseAthCd() { 
		return useAthCd; 
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
