package dongovi2020.zzz01.model;

public class TestVO {
	private Long mbrNo = 0L;
	private String id;
	private String name;

	public TestVO() { }

	public TestVO(String id, String name) { 
		this.id = id; 
		this.name = name; 
	}

	public Long getMbrNo() {
		return mbrNo;
	}

	public void setMbrNo(Long mbrNo) {
		this.mbrNo = mbrNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
