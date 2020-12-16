package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_TCHR / Teacher | 교사		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_TCHR extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int tchrIdx; // 교사 IDX 
	private int teamIdx; // 팀 IDX 
	private String tchrEmpNoId; // 교사 사번 아이디
	private String usrDivCd; // 사용자 구분 코드
	private String usrPwd; // 사용자 비밀번호
	private String usrPwdEnc; // 사용자 비밀번호 암호화
	private String useApprStsCd; // 사용 승인 상태 코드
	private String tchrNk; // 교사 별명 
	private String rlyNm; // 실제 이름 
	private String gdrCd; // 공통코드001 
	private String mobNo; // 휴대전화 번호 
	private String eml; // 이메일 
	private String addr; // 주소 
	private String acntBnkCd; // 공통코드012 
	private String acntNo; // 계좌 번호 
	private String jonDy; // 입사일자 
	private int untLtrFee; // 단위 강의료 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setTchrIdx(int tchrIdx) { 
		this.tchrIdx = tchrIdx; 
	} 
	public int getTchrIdx() { 
		return tchrIdx; 
	} 
	
	public void setTeamIdx(int teamIdx) { 
		this.teamIdx = teamIdx; 
	} 
	public int getTeamIdx() { 
		return teamIdx; 
	} 
	
	public void setTchrNk(String tchrNk) { 
		this.tchrNk = tchrNk; 
	} 
	public String getTchrNk() { 
		return tchrNk; 
	} 
	
	public void setRlyNm(String rlyNm) { 
		this.rlyNm = rlyNm; 
	} 
	public String getRlyNm() { 
		return rlyNm; 
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
	
	public void setJonDy(String jonDy) { 
		this.jonDy = jonDy; 
	} 
	public String getJonDy() { 
		return jonDy; 
	} 
	
	public void setUntLtrFee(int untLtrFee) { 
		this.untLtrFee = untLtrFee; 
	} 
	public int getUntLtrFee() { 
		return untLtrFee; 
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
	public String getTchrEmpNoId() {
		return tchrEmpNoId;
	}
	public void setTchrEmpNoId(String tchrEmpNoId) {
		this.tchrEmpNoId = tchrEmpNoId;
	}
	public String getUsrDivCd() {
		return usrDivCd;
	}
	public void setUsrDivCd(String usrDivCd) {
		this.usrDivCd = usrDivCd;
	}
	public String getUsrPwd() {
		return usrPwd;
	}
	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}
	public String getUsrPwdEnc() {
		return usrPwdEnc;
	}
	public void setUsrPwdEnc(String usrPwdEnc) {
		this.usrPwdEnc = usrPwdEnc;
	}
	public String getUseApprStsCd() {
		return useApprStsCd;
	}
	public void setUseApprStsCd(String useApprStsCd) {
		this.useApprStsCd = useApprStsCd;
	} 

	
}
