package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_ARA / LessonArea | 수업 지역		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_ARA extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private String lsnAraId; // 수업 지역 ID 
	private String lsnAraNm; // 수업 지역 이름 
	private int araDivDth; // 지역 구분 깊이 
	private String uprLsnAraId; // 상위 수업 지역 ID 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 
	private String sysRmks; // 시스템 비고 



	// ===== setters and getters =====

	public void setLsnAraId(String lsnAraId) { 
		this.lsnAraId = lsnAraId; 
	} 
	public String getLsnAraId() { 
		return lsnAraId; 
	} 
	
	public void setLsnAraNm(String lsnAraNm) { 
		this.lsnAraNm = lsnAraNm; 
	} 
	public String getLsnAraNm() { 
		return lsnAraNm; 
	} 
	
	public void setAraDivDth(int araDivDth) { 
		this.araDivDth = araDivDth; 
	} 
	public int getAraDivDth() { 
		return araDivDth; 
	} 
	
	public void setUprLsnAraId(String uprLsnAraId) { 
		this.uprLsnAraId = uprLsnAraId; 
	} 
	public String getUprLsnAraId() { 
		return uprLsnAraId; 
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
	
	public void setSysRmks(String sysRmks) { 
		this.sysRmks = sysRmks; 
	} 
	public String getSysRmks() { 
		return sysRmks; 
	} 
	


}
