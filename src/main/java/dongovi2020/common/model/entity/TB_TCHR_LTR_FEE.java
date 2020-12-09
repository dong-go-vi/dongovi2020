package dongovi2020.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_TCHR_LTR_FEE / TeacherLectureFee | 교사 강의료		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_TCHR_LTR_FEE extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int tchrLtrFeeIdx; // 교사 강의료 IDX 
	private int tchrIdx; // 교사 IDX 
	private String ctrtUpdYm; // 계약 변경 연월 
	private String schdUpdYm; // 예정 변경 연월 
	private int untLtrFeeAmt; // 단위 강의료 금액 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setTchrLtrFeeIdx(int tchrLtrFeeIdx) { 
		this.tchrLtrFeeIdx = tchrLtrFeeIdx; 
	} 
	public int getTchrLtrFeeIdx() { 
		return tchrLtrFeeIdx; 
	} 
	
	public void setTchrIdx(int tchrIdx) { 
		this.tchrIdx = tchrIdx; 
	} 
	public int getTchrIdx() { 
		return tchrIdx; 
	} 
	
	public void setCtrtUpdYm(String ctrtUpdYm) { 
		this.ctrtUpdYm = ctrtUpdYm; 
	} 
	public String getCtrtUpdYm() { 
		return ctrtUpdYm; 
	} 
	
	public void setSchdUpdYm(String schdUpdYm) { 
		this.schdUpdYm = schdUpdYm; 
	} 
	public String getSchdUpdYm() { 
		return schdUpdYm; 
	} 
	
	public void setUntLtrFeeAmt(int untLtrFeeAmt) { 
		this.untLtrFeeAmt = untLtrFeeAmt; 
	} 
	public int getUntLtrFeeAmt() { 
		return untLtrFeeAmt; 
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
