package DAO;

import java.util.ArrayList;
import java.util.List;

import DAO.DAOProduct;
import model.Product;
import model.ProductBox;


public class DAOProduct {
	public static List<Product> listProduct = new ArrayList<>();

	public static List<Product> getListProduct() {

		if (DAOProduct.listProduct.size() == 0) {
			listProduct
					.add(new Product(2312, "Điện thoại Samsung Galaxy Note 8", "../Front/img/note8.png", 19990000, 3));
			listProduct.add(
					new Product(2313, "Điện thoại iPhone X 256GB Silver", "../Front/img/iphone-x.png", 26990000, 4));
			listProduct.add(new Product(2314, "Điện thoại Huawei Mate 20 Pro", "../Front/img/mate20.png", 21990000, 5));
		}
		return listProduct;

	}

	public static List<ProductBox> listProductBox() {
		List<ProductBox> list1 = new ArrayList<ProductBox>();
		list1.add(new ProductBox("2312", "Điện thoại Samsung Galaxy Note 9", "21.990.000₫",
				"../img/note_9.png"));
		list1.add(new ProductBox("2313", "Điện thoại Samsung Galaxy S8", "17.990.000₫",
				"../img/s8.png"));
		list1.add(
				new ProductBox("2314", "Điện thoại Samsung Galaxy S9 ", "19.990.000₫", "../img/s9.png"));
		list1.add(
				new ProductBox("2315", "Điện thoại Samsung Galaxy A7 ", "8.990.000₫", "../img/a7.png"));
		return list1;
	}

	public static List<ProductBox> listProduct1 = new ArrayList<>();

	public static List<ProductBox> getListProductBox() {
		return listProduct1;
	}

	public static double perSale(Product pr) {
		double persale = pr.getPerSale();
		double price = pr.getPrice();
		double result = 0;
		result = price * (100 - persale) / 100;
		return result;
	}

}
