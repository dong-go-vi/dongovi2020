package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_FRM / LessonForm | 수업 형태		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_FRM extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private String lsnFrmId; // 수업 형태 ID 
	private String lsnFrmAbbrNm; // 수업 형태 축약 이름 
	private String lsnFrmNm; // 수업 형태 이름 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnFrmId(String lsnFrmId) { 
		this.lsnFrmId = lsnFrmId; 
	} 
	public String getLsnFrmId() { 
		return lsnFrmId; 
	} 
	
	public void setLsnFrmAbbrNm(String lsnFrmAbbrNm) { 
		this.lsnFrmAbbrNm = lsnFrmAbbrNm; 
	} 
	public String getLsnFrmAbbrNm() { 
		return lsnFrmAbbrNm; 
	} 
	
	public void setLsnFrmNm(String lsnFrmNm) { 
		this.lsnFrmNm = lsnFrmNm; 
	} 
	public String getLsnFrmNm() { 
		return lsnFrmNm; 
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
