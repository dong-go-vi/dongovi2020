package dongovi2020.common.model.entity;

import java.io.Serializable;

// import tata.creator.be.output.common.model.BaseVO;
import dongovi2020.base.common.BaseVO;

/**
 * TABLE VO - TB_UNPD_SND / UnpaidSend | 미납 발송		
 * @author tata creator
 * @since 2020.12.05
 *
 */
 @SuppressWarnings("serial")
public class TB_UNPD_SND extends BaseVO implements Serializable{
	
	// ===== column level property =====

	private int unpdSndIdx; // 미납 발송 IDX 
	private int lsnIdx; // 수업 IDX 
	private int stdntIdx; // 학생 IDX 
	private String unpdSndDt1st; // 미납 발송 일시 1차 
	private String unpdSndDt2nd; // 미납 발송 일시 2차 
	private String unpdSndDt3rd; // 미납 발송 일시 3차 
	private String unpdSndDt4th; // 미납 발송 일시 4차 
	private String unpdSndDt5th; // 미납 발송 일시 5차 
	private String useYn; // 사용 여부 
	private String creDt; // 생성 일시 
	private String crePsn; // 생성자 
	private String updDt; // 수정 일시 
	private String updPsn; // 수정자 



	// ===== setters and getters =====

	public void setUnpdSndIdx(int unpdSndIdx) { 
		this.unpdSndIdx = unpdSndIdx; 
	} 
	public int getUnpdSndIdx() { 
		return unpdSndIdx; 
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
	
	public void setUnpdSndDt1st(String unpdSndDt1st) { 
		this.unpdSndDt1st = unpdSndDt1st; 
	} 
	public String getUnpdSndDt1st() { 
		return unpdSndDt1st; 
	} 
	
	public void setUnpdSndDt2nd(String unpdSndDt2nd) { 
		this.unpdSndDt2nd = unpdSndDt2nd; 
	} 
	public String getUnpdSndDt2nd() { 
		return unpdSndDt2nd; 
	} 
	
	public void setUnpdSndDt3rd(String unpdSndDt3rd) { 
		this.unpdSndDt3rd = unpdSndDt3rd; 
	} 
	public String getUnpdSndDt3rd() { 
		return unpdSndDt3rd; 
	} 
	
	public void setUnpdSndDt4th(String unpdSndDt4th) { 
		this.unpdSndDt4th = unpdSndDt4th; 
	} 
	public String getUnpdSndDt4th() { 
		return unpdSndDt4th; 
	} 
	
	public void setUnpdSndDt5th(String unpdSndDt5th) { 
		this.unpdSndDt5th = unpdSndDt5th; 
	} 
	public String getUnpdSndDt5th() { 
		return unpdSndDt5th; 
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
