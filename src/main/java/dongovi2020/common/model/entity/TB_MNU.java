package dongovi2020.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_MNU / Menu | 메뉴		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_MNU extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int mnuIdx; // 메뉴 IDX 
	private int uprMnuIdx; // 상위 메뉴 IDX 
	private String mnuNm; // 메뉴 이름 
	private int mnuDth; // 메뉴 깊이 
	private String pgmUri; // 프로그램 URI 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setMnuIdx(int mnuIdx) { 
		this.mnuIdx = mnuIdx; 
	} 
	public int getMnuIdx() { 
		return mnuIdx; 
	} 
	
	public void setUprMnuIdx(int uprMnuIdx) { 
		this.uprMnuIdx = uprMnuIdx; 
	} 
	public int getUprMnuIdx() { 
		return uprMnuIdx; 
	} 
	
	public void setMnuNm(String mnuNm) { 
		this.mnuNm = mnuNm; 
	} 
	public String getMnuNm() { 
		return mnuNm; 
	} 
	
	public void setMnuDth(int mnuDth) { 
		this.mnuDth = mnuDth; 
	} 
	public int getMnuDth() { 
		return mnuDth; 
	} 
	
	public void setPgmUri(String pgmUri) { 
		this.pgmUri = pgmUri; 
	} 
	public String getPgmUri() { 
		return pgmUri; 
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
