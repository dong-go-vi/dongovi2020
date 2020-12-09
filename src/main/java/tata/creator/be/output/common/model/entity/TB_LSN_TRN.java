package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_TRN / LessonTrun | 수업 회차		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_TRN extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int lsnTrnIdx; // 수업 회차 IDX 
	private int lsnIdx; // 수업 IDX 
	private int lsnTrnNo; // 수업 회차 번호 
	private int rmnTrnNo; // 잔여 회차 번호 
	private String schdLsnDy; // 예정 수업 일자 
	private String rlyLsnDy; // 실제 수업 일자 
	private int lsnPrgsTchrIdx; // 수업 진행 교사 IDX 
	private String spCmntItm; // 특기 사항 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnTrnIdx(int lsnTrnIdx) { 
		this.lsnTrnIdx = lsnTrnIdx; 
	} 
	public int getLsnTrnIdx() { 
		return lsnTrnIdx; 
	} 
	
	public void setLsnIdx(int lsnIdx) { 
		this.lsnIdx = lsnIdx; 
	} 
	public int getLsnIdx() { 
		return lsnIdx; 
	} 
	
	public void setLsnTrnNo(int lsnTrnNo) { 
		this.lsnTrnNo = lsnTrnNo; 
	} 
	public int getLsnTrnNo() { 
		return lsnTrnNo; 
	} 
	
	public void setRmnTrnNo(int rmnTrnNo) { 
		this.rmnTrnNo = rmnTrnNo; 
	} 
	public int getRmnTrnNo() { 
		return rmnTrnNo; 
	} 
	
	public void setSchdLsnDy(String schdLsnDy) { 
		this.schdLsnDy = schdLsnDy; 
	} 
	public String getSchdLsnDy() { 
		return schdLsnDy; 
	} 
	
	public void setRlyLsnDy(String rlyLsnDy) { 
		this.rlyLsnDy = rlyLsnDy; 
	} 
	public String getRlyLsnDy() { 
		return rlyLsnDy; 
	} 
	
	public void setLsnPrgsTchrIdx(int lsnPrgsTchrIdx) { 
		this.lsnPrgsTchrIdx = lsnPrgsTchrIdx; 
	} 
	public int getLsnPrgsTchrIdx() { 
		return lsnPrgsTchrIdx; 
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
