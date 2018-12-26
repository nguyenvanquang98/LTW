package model;

import java.util.ArrayList;

public class Customer {
	private String user;
	private String name;
	ArrayList<Product> shopCart;

	public Customer(String user, String name) {
		super();
		this.user = user;
		this.name = name;
	}

	public void addShoppingCart(Product e) {
		this.shopCart.add(e);
		
	}

	public ArrayList<Product> getShopCart() {
		return shopCart;
	}
	
}
