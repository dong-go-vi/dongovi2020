package dongovi2020.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LTR_FEE_PAY_ADD_DTL / LectureFeePayAddDetail | 강의료 지급 추가 내역		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LTR_FEE_PAY_ADD_DTL extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int ltrFeePayAddDtlIdx; // 강의료 지급 추가 내역 IDX 
	private int ltrFeePayIdx; // 강의료 지급 IDX 
	private String addDtl; // 추가 내역 
	private int addAmt; // 추가 금액 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLtrFeePayAddDtlIdx(int ltrFeePayAddDtlIdx) { 
		this.ltrFeePayAddDtlIdx = ltrFeePayAddDtlIdx; 
	} 
	public int getLtrFeePayAddDtlIdx() { 
		return ltrFeePayAddDtlIdx; 
	} 
	
	public void setLtrFeePayIdx(int ltrFeePayIdx) { 
		this.ltrFeePayIdx = ltrFeePayIdx; 
	} 
	public int getLtrFeePayIdx() { 
		return ltrFeePayIdx; 
	} 
	
	public void setAddDtl(String addDtl) { 
		this.addDtl = addDtl; 
	} 
	public String getAddDtl() { 
		return addDtl; 
	} 
	
	public void setAddAmt(int addAmt) { 
		this.addAmt = addAmt; 
	} 
	public int getAddAmt() { 
		return addAmt; 
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
