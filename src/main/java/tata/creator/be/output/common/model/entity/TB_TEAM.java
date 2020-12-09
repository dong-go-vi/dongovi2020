package tata.creator.be.output.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_TEAM / Team | 팀		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_TEAM extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int teamIdx; // 팀 IDX 
	private String teamNm; // 팀 이름 
	private int teamLdrTchrIdx; // 팀장 교사 IDX 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setTeamIdx(int teamIdx) { 
		this.teamIdx = teamIdx; 
	} 
	public int getTeamIdx() { 
		return teamIdx; 
	} 
	
	public void setTeamNm(String teamNm) { 
		this.teamNm = teamNm; 
	} 
	public String getTeamNm() { 
		return teamNm; 
	} 
	
	public void setTeamLdrTchrIdx(int teamLdrTchrIdx) { 
		this.teamLdrTchrIdx = teamLdrTchrIdx; 
	} 
	public int getTeamLdrTchrIdx() { 
		return teamLdrTchrIdx; 
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
