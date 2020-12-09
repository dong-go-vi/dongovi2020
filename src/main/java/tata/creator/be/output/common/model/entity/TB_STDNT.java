package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_STDNT / Student | 학생		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_STDNT extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int stdntIdx; // 학생 IDX 
	private String nm; // 이름 
	private String gdrCd; // 공통코드001 
	private String mobNo; // 휴대전화 번호 
	private String eml; // 이메일 
	private String addr; // 주소 
	private String gdnNm; // 보호자 이름 
	private String gdnRltn; // 보호자 관계 
	private String gdnPhnNo; // 보호자 전화 번호 
	private String gdnEml; // 보호자 이메일 
	private String acntBnkCd; // 공통코드012 
	private String acntNo; // 계좌번호 
	private String rmks; // 비고 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setStdntIdx(int stdntIdx) { 
		this.stdntIdx = stdntIdx; 
	} 
	public int getStdntIdx() { 
		return stdntIdx; 
	} 
	
	public void setNm(String nm) { 
		this.nm = nm; 
	} 
	public String getNm() { 
		return nm; 
	} 
	
	public void setGdrCd(String gdrCd) { 
		this.gdrCd = gdrCd; 
	} 
	public String getGdrCd() { 
		return gdrCd; 
	} 
	
	public void setMobNo(String mobNo) { 
		this.mobNo = mobNo; 
	} 
	public String getMobNo() { 
		return mobNo; 
	} 
	
	public void setEml(String eml) { 
		this.eml = eml; 
	} 
	public String getEml() { 
		return eml; 
	} 
	
	public void setAddr(String addr) { 
		this.addr = addr; 
	} 
	public String getAddr() { 
		return addr; 
	} 
	
	public void setGdnNm(String gdnNm) { 
		this.gdnNm = gdnNm; 
	} 
	public String getGdnNm() { 
		return gdnNm; 
	} 
	
	public void setGdnRltn(String gdnRltn) { 
		this.gdnRltn = gdnRltn; 
	} 
	public String getGdnRltn() { 
		return gdnRltn; 
	} 
	
	public void setGdnPhnNo(String gdnPhnNo) { 
		this.gdnPhnNo = gdnPhnNo; 
	} 
	public String getGdnPhnNo() { 
		return gdnPhnNo; 
	} 
	
	public void setGdnEml(String gdnEml) { 
		this.gdnEml = gdnEml; 
	} 
	public String getGdnEml() { 
		return gdnEml; 
	} 
	
	public void setAcntBnkCd(String acntBnkCd) { 
		this.acntBnkCd = acntBnkCd; 
	} 
	public String getAcntBnkCd() { 
		return acntBnkCd; 
	} 
	
	public void setAcntNo(String acntNo) { 
		this.acntNo = acntNo; 
	} 
	public String getAcntNo() { 
		return acntNo; 
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
