package dongovi2020.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_LSN / Lesson  | 수업		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_LSN extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int lsnIdx; // 수업 IDX 
	private int prvSmtrLsnIdx; // 이전 학기 수업 IDX 
	private String rlyLsnNo; // 실제 수업 번호 
	private String lsnPrgsStsCd; // 공통코드004 
	private String lsnAraId; // 수업 지역 ID 
	private int chgTeamId; // 담당 팀 ID 
	private int rpstTchrIdx; // 대표 교사 IDX 
	private String lsnFrmId; // 수업 형태 ID 
	private String affOrgNm; // 소속 기관 이름 
	private String grdCd; // 공통코드005 
	private int ctrtLsnCnt; // 계약 수업 횟수 
	private int psntPrgsLsnCnt; // 현재 진행 수업 횟수 
	private int untLtrFee; // 단위 강의료 
	private String lsnSchlCsttWkCd; // 공통코드006 
	private String lsnSchlCsttDowCd; // 공통코드007 
	private String lsnSchlCsttHh; // 수업 일정 구성 시 
	private String lsnSchlCsttMm; // 수업 일정 구성 분 
	private String cltFrmCd; // 공통코드008 
	private int allTtn; // 전체 수강료 
	private String schdStrtDy; // 예정 시작일자 
	private String rlyStrtDy; // 실제 시작일자 
	private String schdEndDy; // 예정 종료일자 
	private String rlyEndDy; // 실제 종료일자 
	private String gudDy; // 안내 일자 
	private String gudAcntCd; // 공통코드009 
	private String rmks; // 비고 
	private int untLtrFeeUpdAmt; // 단위 강의료 수정 금액 
	private String ttnDpstFnshDy; // 수업료 입금 완료일자 
	private String ttnDpstFnshYn; // 수업료 입금 완료 여부 
	private int lsnSmtrCnt; // 수업 학기 수 
	private int lsnTmMm; // 분단위 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setLsnIdx(int lsnIdx) { 
		this.lsnIdx = lsnIdx; 
	} 
	public int getLsnIdx() { 
		return lsnIdx; 
	} 
	
	public void setPrvSmtrLsnIdx(int prvSmtrLsnIdx) { 
		this.prvSmtrLsnIdx = prvSmtrLsnIdx; 
	} 
	public int getPrvSmtrLsnIdx() { 
		return prvSmtrLsnIdx; 
	} 
	
	public void setRlyLsnNo(String rlyLsnNo) { 
		this.rlyLsnNo = rlyLsnNo; 
	} 
	public String getRlyLsnNo() { 
		return rlyLsnNo; 
	} 
	
	public void setLsnPrgsStsCd(String lsnPrgsStsCd) { 
		this.lsnPrgsStsCd = lsnPrgsStsCd; 
	} 
	public String getLsnPrgsStsCd() { 
		return lsnPrgsStsCd; 
	} 
	
	public void setLsnAraId(String lsnAraId) { 
		this.lsnAraId = lsnAraId; 
	} 
	public String getLsnAraId() { 
		return lsnAraId; 
	} 
	
	public void setChgTeamId(int chgTeamId) { 
		this.chgTeamId = chgTeamId; 
	} 
	public int getChgTeamId() { 
		return chgTeamId; 
	} 
	
	public void setRpstTchrIdx(int rpstTchrIdx) { 
		this.rpstTchrIdx = rpstTchrIdx; 
	} 
	public int getRpstTchrIdx() { 
		return rpstTchrIdx; 
	} 
	
	public void setLsnFrmId(String lsnFrmId) { 
		this.lsnFrmId = lsnFrmId; 
	} 
	public String getLsnFrmId() { 
		return lsnFrmId; 
	} 
	
	public void setAffOrgNm(String affOrgNm) { 
		this.affOrgNm = affOrgNm; 
	} 
	public String getAffOrgNm() { 
		return affOrgNm; 
	} 
	
	public void setGrdCd(String grdCd) { 
		this.grdCd = grdCd; 
	} 
	public String getGrdCd() { 
		return grdCd; 
	} 
	
	public void setCtrtLsnCnt(int ctrtLsnCnt) { 
		this.ctrtLsnCnt = ctrtLsnCnt; 
	} 
	public int getCtrtLsnCnt() { 
		return ctrtLsnCnt; 
	} 
	
	public void setPsntPrgsLsnCnt(int psntPrgsLsnCnt) { 
		this.psntPrgsLsnCnt = psntPrgsLsnCnt; 
	} 
	public int getPsntPrgsLsnCnt() { 
		return psntPrgsLsnCnt; 
	} 
	
	public void setUntLtrFee(int untLtrFee) { 
		this.untLtrFee = untLtrFee; 
	} 
	public int getUntLtrFee() { 
		return untLtrFee; 
	} 
	
	public void setLsnSchlCsttWkCd(String lsnSchlCsttWkCd) { 
		this.lsnSchlCsttWkCd = lsnSchlCsttWkCd; 
	} 
	public String getLsnSchlCsttWkCd() { 
		return lsnSchlCsttWkCd; 
	} 
	
	public void setLsnSchlCsttDowCd(String lsnSchlCsttDowCd) { 
		this.lsnSchlCsttDowCd = lsnSchlCsttDowCd; 
	} 
	public String getLsnSchlCsttDowCd() { 
		return lsnSchlCsttDowCd; 
	} 
	
	public void setLsnSchlCsttHh(String lsnSchlCsttHh) { 
		this.lsnSchlCsttHh = lsnSchlCsttHh; 
	} 
	public String getLsnSchlCsttHh() { 
		return lsnSchlCsttHh; 
	} 
	
	public void setLsnSchlCsttMm(String lsnSchlCsttMm) { 
		this.lsnSchlCsttMm = lsnSchlCsttMm; 
	} 
	public String getLsnSchlCsttMm() { 
		return lsnSchlCsttMm; 
	} 
	
	public void setCltFrmCd(String cltFrmCd) { 
		this.cltFrmCd = cltFrmCd; 
	} 
	public String getCltFrmCd() { 
		return cltFrmCd; 
	} 
	
	public void setAllTtn(int allTtn) { 
		this.allTtn = allTtn; 
	} 
	public int getAllTtn() { 
		return allTtn; 
	} 
	
	public void setSchdStrtDy(String schdStrtDy) { 
		this.schdStrtDy = schdStrtDy; 
	} 
	public String getSchdStrtDy() { 
		return schdStrtDy; 
	} 
	
	public void setRlyStrtDy(String rlyStrtDy) { 
		this.rlyStrtDy = rlyStrtDy; 
	} 
	public String getRlyStrtDy() { 
		return rlyStrtDy; 
	} 
	
	public void setSchdEndDy(String schdEndDy) { 
		this.schdEndDy = schdEndDy; 
	} 
	public String getSchdEndDy() { 
		return schdEndDy; 
	} 
	
	public void setRlyEndDy(String rlyEndDy) { 
		this.rlyEndDy = rlyEndDy; 
	} 
	public String getRlyEndDy() { 
		return rlyEndDy; 
	} 
	
	public void setGudDy(String gudDy) { 
		this.gudDy = gudDy; 
	} 
	public String getGudDy() { 
		return gudDy; 
	} 
	
	public void setGudAcntCd(String gudAcntCd) { 
		this.gudAcntCd = gudAcntCd; 
	} 
	public String getGudAcntCd() { 
		return gudAcntCd; 
	} 
	
	public void setRmks(String rmks) { 
		this.rmks = rmks; 
	} 
	public String getRmks() { 
		return rmks; 
	} 
	
	public void setUntLtrFeeUpdAmt(int untLtrFeeUpdAmt) { 
		this.untLtrFeeUpdAmt = untLtrFeeUpdAmt; 
	} 
	public int getUntLtrFeeUpdAmt() { 
		return untLtrFeeUpdAmt; 
	} 
	
	public void setTtnDpstFnshDy(String ttnDpstFnshDy) { 
		this.ttnDpstFnshDy = ttnDpstFnshDy; 
	} 
	public String getTtnDpstFnshDy() { 
		return ttnDpstFnshDy; 
	} 
	
	public void setTtnDpstFnshYn(String ttnDpstFnshYn) { 
		this.ttnDpstFnshYn = ttnDpstFnshYn; 
	} 
	public String getTtnDpstFnshYn() { 
		return ttnDpstFnshYn; 
	} 
	
	public void setLsnSmtrCnt(int lsnSmtrCnt) { 
		this.lsnSmtrCnt = lsnSmtrCnt; 
	} 
	public int getLsnSmtrCnt() { 
		return lsnSmtrCnt; 
	} 
	
	public void setLsnTmMm(int lsnTmMm) { 
		this.lsnTmMm = lsnTmMm; 
	} 
	public int getLsnTmMm() { 
		return lsnTmMm; 
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
