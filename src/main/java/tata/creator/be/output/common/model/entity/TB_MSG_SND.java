package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_MSG_SND / MessageSend | 메세지 발송		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_MSG_SND extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int msgSndIdx; // 메세지 발송 IDX 
	private int lsnIdx; // 수업 IDX 
	private int stdntIdx; // 학생 IDX 
	private String sndDy; // 발송 일자 
	private String msgSndMtdCd; // 공통코드011 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setMsgSndIdx(int msgSndIdx) { 
		this.msgSndIdx = msgSndIdx; 
	} 
	public int getMsgSndIdx() { 
		return msgSndIdx; 
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
	
	public void setSndDy(String sndDy) { 
		this.sndDy = sndDy; 
	} 
	public String getSndDy() { 
		return sndDy; 
	} 
	
	public void setMsgSndMtdCd(String msgSndMtdCd) { 
		this.msgSndMtdCd = msgSndMtdCd; 
	} 
	public String getMsgSndMtdCd() { 
		return msgSndMtdCd; 
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
