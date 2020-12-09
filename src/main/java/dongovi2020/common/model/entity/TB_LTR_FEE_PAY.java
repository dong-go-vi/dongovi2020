package dongovi2020.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LTR_FEE_PAY / LectureFeePay | 강의료 지급		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LTR_FEE_PAY extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int ltrFeePayIdx; // 강의료 지급 IDX 
	private int tchrIdx; // 교사 IDX 
	private String payYm; // 지급 연월 
	private int payAmt; // 지급 금액 
	private String payAmtCalDt; // 지급 금액 계산 일시 
	private String payAmtRmks; // 지급 금액 비고 
	private String payFnshYn; // 지급 완료 여부 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLtrFeePayIdx(int ltrFeePayIdx) { 
		this.ltrFeePayIdx = ltrFeePayIdx; 
	} 
	public int getLtrFeePayIdx() { 
		return ltrFeePayIdx; 
	} 
	
	public void setTchrIdx(int tchrIdx) { 
		this.tchrIdx = tchrIdx; 
	} 
	public int getTchrIdx() { 
		return tchrIdx; 
	} 
	
	public void setPayYm(String payYm) { 
		this.payYm = payYm; 
	} 
	public String getPayYm() { 
		return payYm; 
	} 
	
	public void setPayAmt(int payAmt) { 
		this.payAmt = payAmt; 
	} 
	public int getPayAmt() { 
		return payAmt; 
	} 
	
	public void setPayAmtCalDt(String payAmtCalDt) { 
		this.payAmtCalDt = payAmtCalDt; 
	} 
	public String getPayAmtCalDt() { 
		return payAmtCalDt; 
	} 
	
	public void setPayAmtRmks(String payAmtRmks) { 
		this.payAmtRmks = payAmtRmks; 
	} 
	public String getPayAmtRmks() { 
		return payAmtRmks; 
	} 
	
	public void setPayFnshYn(String payFnshYn) { 
		this.payFnshYn = payFnshYn; 
	} 
	public String getPayFnshYn() { 
		return payFnshYn; 
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
