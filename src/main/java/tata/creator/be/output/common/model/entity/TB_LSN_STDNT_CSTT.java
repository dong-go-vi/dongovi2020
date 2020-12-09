package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_STDNT_CSTT / LessonStudentConstitue | 수업 학생 구성		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_STDNT_CSTT extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int lsnStdntCsttIdx; // 수업 학생 구성 IDX 
	private int lsnIdx; // 수업 IDX 
	private int stdntIdx; // 학생 IDX 
	private int psnTtnAmt; // 개인 수강료 금액 
	private int psnTtnUpdAmt; // 개인 수강료 수정 금액 
	private String rpstStdntYn; // 대표 학생 여부 
	private String spCmntItm; // 특기사항 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnStdntCsttIdx(int lsnStdntCsttIdx) { 
		this.lsnStdntCsttIdx = lsnStdntCsttIdx; 
	} 
	public int getLsnStdntCsttIdx() { 
		return lsnStdntCsttIdx; 
	} 
	
	public void setLsnIdx(int lsnIdx) { 
		this.lsnIdx = lsnIdx; 
	} 
	public int getLsnIdx() { 
		return lsnIdx; 
	} 
	
	public void setStdntIdx(int stdntIdx) { 
		this.stdntIdx = stdntIdx; 
	} 
	public int getStdntIdx() { 
		return stdntIdx; 
	} 
	
	public void setPsnTtnAmt(int psnTtnAmt) { 
		this.psnTtnAmt = psnTtnAmt; 
	} 
	public int getPsnTtnAmt() { 
		return psnTtnAmt; 
	} 
	
	public void setPsnTtnUpdAmt(int psnTtnUpdAmt) { 
		this.psnTtnUpdAmt = psnTtnUpdAmt; 
	} 
	public int getPsnTtnUpdAmt() { 
		return psnTtnUpdAmt; 
	} 
	
	public void setRpstStdntYn(String rpstStdntYn) { 
		this.rpstStdntYn = rpstStdntYn; 
	} 
	public String getRpstStdntYn() { 
		return rpstStdntYn; 
	} 
	
	public void setSpCmntItm(String spCmntItm) { 
		this.spCmntItm = spCmntItm; 
	} 
	public String getSpCmntItm() { 
		return spCmntItm; 
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
