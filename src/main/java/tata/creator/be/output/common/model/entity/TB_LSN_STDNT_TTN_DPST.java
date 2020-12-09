package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_STDNT_TTN_DPST / LessonStudentTuitionDeposit | 수업 학생 수강료 입금		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_STDNT_TTN_DPST extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int lsnStdntTtnDpstIdx; // 수업 학생 수강료 입금 IDX 
	private int lsnIdx; // 수업 IDX 
	private int stdntIdx; // 학생 IDX 
	private int dpstSeqNo; // 입금 일련 번호 
	private String dpstDy; // 입금 일자 
	private int dpstAmt; // 입금 금액 
	private String dpstBnkCd; // 공통코드010 
	private String dpstAcntNo; // 입금 계좌 번호 
	private String ntfTlkSndYn; // 알림톡 발송 여부 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnStdntTtnDpstIdx(int lsnStdntTtnDpstIdx) { 
		this.lsnStdntTtnDpstIdx = lsnStdntTtnDpstIdx; 
	} 
	public int getLsnStdntTtnDpstIdx() { 
		return lsnStdntTtnDpstIdx; 
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
	
	public void setDpstSeqNo(int dpstSeqNo) { 
		this.dpstSeqNo = dpstSeqNo; 
	} 
	public int getDpstSeqNo() { 
		return dpstSeqNo; 
	} 
	
	public void setDpstDy(String dpstDy) { 
		this.dpstDy = dpstDy; 
	} 
	public String getDpstDy() { 
		return dpstDy; 
	} 
	
	public void setDpstAmt(int dpstAmt) { 
		this.dpstAmt = dpstAmt; 
	} 
	public int getDpstAmt() { 
		return dpstAmt; 
	} 
	
	public void setDpstBnkCd(String dpstBnkCd) { 
		this.dpstBnkCd = dpstBnkCd; 
	} 
	public String getDpstBnkCd() { 
		return dpstBnkCd; 
	} 
	
	public void setDpstAcntNo(String dpstAcntNo) { 
		this.dpstAcntNo = dpstAcntNo; 
	} 
	public String getDpstAcntNo() { 
		return dpstAcntNo; 
	} 
	
	public void setNtfTlkSndYn(String ntfTlkSndYn) { 
		this.ntfTlkSndYn = ntfTlkSndYn; 
	} 
	public String getNtfTlkSndYn() { 
		return ntfTlkSndYn; 
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
