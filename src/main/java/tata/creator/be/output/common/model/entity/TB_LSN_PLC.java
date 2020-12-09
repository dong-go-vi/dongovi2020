package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN_PLC / LessonPlace | 수업 장소		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN_PLC extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private String lsnPlcId; // 수업 장소 ID 
	private String lsnAraId; // 수업 지역 ID 
	private String lsnPlcNm; // 수업 장소 이름 
	private String lsnPlcAddr; // 수업 장소 주소 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnPlcId(String lsnPlcId) { 
		this.lsnPlcId = lsnPlcId; 
	} 
	public String getLsnPlcId() { 
		return lsnPlcId; 
	} 
	
	public void setLsnAraId(String lsnAraId) { 
		this.lsnAraId = lsnAraId; 
	} 
	public String getLsnAraId() { 
		return lsnAraId; 
	} 
	
	public void setLsnPlcNm(String lsnPlcNm) { 
		this.lsnPlcNm = lsnPlcNm; 
	} 
	public String getLsnPlcNm() { 
		return lsnPlcNm; 
	} 
	
	public void setLsnPlcAddr(String lsnPlcAddr) { 
		this.lsnPlcAddr = lsnPlcAddr; 
	} 
	public String getLsnPlcAddr() { 
		return lsnPlcAddr; 
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
