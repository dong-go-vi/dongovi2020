package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_TRN_STDNT_PTCPT / LessonTurnStudentPaticipation | 수업 회차 학생 참여		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_TRN_STDNT_PTCPT extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int lsnTrnStdntPtcptIdx; // 수업 회차 학생 참여 IDX 
	private int lsnTrnIdx; // 수업 회차 IDX 
	private int stdntIdx; // 학생 IDX 
	private String attdYn; // 참석 여부 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnTrnStdntPtcptIdx(int lsnTrnStdntPtcptIdx) { 
		this.lsnTrnStdntPtcptIdx = lsnTrnStdntPtcptIdx; 
	} 
	public int getLsnTrnStdntPtcptIdx() { 
		return lsnTrnStdntPtcptIdx; 
	} 
	
	public void setLsnTrnIdx(int lsnTrnIdx) { 
		this.lsnTrnIdx = lsnTrnIdx; 
	} 
	public int getLsnTrnIdx() { 
		return lsnTrnIdx; 
	} 
	
	public void setStdntIdx(int stdntIdx) { 
		this.stdntIdx = stdntIdx; 
	} 
	public int getStdntIdx() { 
		return stdntIdx; 
	} 
	
	public void setAttdYn(String attdYn) { 
		this.attdYn = attdYn; 
	} 
	public String getAttdYn() { 
		return attdYn; 
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
