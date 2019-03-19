package kr.co.booktopia.vo;

public class ImageVO {
	private int IMAGE_ID;
	private int GOODS_ID;
	private String FILENAME;
	private String REG_ID;
	private String CREDATE;
	
	public int getIMAGE_ID() {
		return IMAGE_ID;
	}
	public void setIMAGE_ID(int iMAGE_ID) {
		IMAGE_ID = iMAGE_ID;
	}
	public int getGOODS_ID() {
		return GOODS_ID;
	}
	public void setGOODS_ID(int gOODS_ID) {
		GOODS_ID = gOODS_ID;
	}
	public String getFILENAME() {
		return FILENAME;
	}
	public void setFILENAME(String fILENAME) {
		FILENAME = fILENAME;
	}
	public String getREG_ID() {
		return REG_ID;
	}
	public void setREG_ID(String rEG_ID) {
		REG_ID = rEG_ID;
	}
	public String getCREDATE() {
		return CREDATE;
	}
	public void setCREDATE(String cREDATE) {
		CREDATE = cREDATE;
	}
}
