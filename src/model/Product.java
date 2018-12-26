package model;

public class Product {
	private int id;
	private String name;
	private String imgUrl;
	private int price;
	private double perSale;

	public Product(int id, String name, String imgUrl, int price, double perSale) {
		super();
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
		this.price = price;
		this.perSale = perSale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPerSale() {
		return perSale;
	}

	public void setPerSale(double perSale) {
		this.perSale = perSale;
	}

}
