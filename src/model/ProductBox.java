package model;

public class ProductBox {
	private String maSP;
	private String tenSP;
	private String giaSP;
	private String imgSP;

	public ProductBox(String maSP, String tenSP, String giaSP, String imgSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaSP = giaSP;
		this.imgSP = imgSP;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(String giaSP) {
		this.giaSP = giaSP;
	}

	public String getImgSP() {
		return imgSP;
	}

	public void setImgSP(String imgSP) {
		this.imgSP = imgSP;
	}
}
