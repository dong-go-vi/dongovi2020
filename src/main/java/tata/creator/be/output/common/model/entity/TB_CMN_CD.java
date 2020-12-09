package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_CMN_CD / CommonCode | 공통 코드		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_CMN_CD extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private String grpCd; // 그룹 코드 
	private String cmnCd; // 공통 코드 
	private String cmnGrpNm; // 공통 그룹 이름 
	private String cmnCdNm; // 공통 코드 이름 
	private String cmnCdVal01; // 공통 코드 값 01 
	private String cmnCdVal02; // 공통 코드 값 02 
	private int srtOrdNo; // 정렬 순서 번호 
	private String rmks; // 비고 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setGrpCd(String grpCd) { 
		this.grpCd = grpCd; 
	} 
	public String getGrpCd() { 
		return grpCd; 
	} 
	
	public void setCmnCd(String cmnCd) { 
		this.cmnCd = cmnCd; 
	} 
	public String getCmnCd() { 
		return cmnCd; 
	} 
	
	public void setCmnGrpNm(String cmnGrpNm) { 
		this.cmnGrpNm = cmnGrpNm; 
	} 
	public String getCmnGrpNm() { 
		return cmnGrpNm; 
	} 
	
	public void setCmnCdNm(String cmnCdNm) { 
		this.cmnCdNm = cmnCdNm; 
	} 
	public String getCmnCdNm() { 
		return cmnCdNm; 
	} 
	
	public void setCmnCdVal01(String cmnCdVal01) { 
		this.cmnCdVal01 = cmnCdVal01; 
	} 
	public String getCmnCdVal01() { 
		return cmnCdVal01; 
	} 
	
	public void setCmnCdVal02(String cmnCdVal02) { 
		this.cmnCdVal02 = cmnCdVal02; 
	} 
	public String getCmnCdVal02() { 
		return cmnCdVal02; 
	} 
	
	public void setSrtOrdNo(int srtOrdNo) { 
		this.srtOrdNo = srtOrdNo; 
	} 
	public int getSrtOrdNo() { 
		return srtOrdNo; 
	} 
	
	public void setRmks(String rmks) { 
		this.rmks = rmks; 
	} 
	public String getRmks() { 
		return rmks; 
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
