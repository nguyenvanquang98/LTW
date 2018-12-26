package model;

public class Member {
	private String email;
	private String pass;
	private String repass;
	private String name;
	private String day;
	private String month;
	private String year;
	private String gender;
	private String phone;
	private String yourphone;
	private String quocgia;
	private String tinhthanh;
	private String quanhuyen;
	private String diachinha;

	public Member(String email, String pass, String repass, String name, String day, String month, String year,
			String gender, String phone, String yourphone, String quocgia, String tinhthanh, String quanhuyen,
			String diachinha) {
		super();
		this.email = email;
		this.pass = pass;
		this.repass = repass;
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		this.gender = gender;
		this.phone = phone;
		this.yourphone = yourphone;
		this.quocgia = quocgia;
		this.tinhthanh = tinhthanh;
		this.quanhuyen = quanhuyen;
		this.diachinha = diachinha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRepass() {
		return repass;
	}

	public void setRepass(String repass) {
		this.repass = repass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getYourphone() {
		return yourphone;
	}

	public void setYourphone(String yourphone) {
		this.yourphone = yourphone;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getQuocgia() {
		return quocgia;
	}

	public void setQuocgia(String quocgia) {
		this.quocgia = quocgia;
	}

	public String getTinhthanh() {
		return tinhthanh;
	}

	public void setTinhthanh(String tinhthanh) {
		this.tinhthanh = tinhthanh;
	}

	public String getQuanhuyen() {
		return quanhuyen;
	}

	public void setQuanhuyen(String quanhuyen) {
		this.quanhuyen = quanhuyen;
	}

	public String getDiachinha() {
		return diachinha;
	}

	public void setDiachinha(String diachinha) {
		this.diachinha = diachinha;
	}

	@Override
	public String toString() {
		return "Member [email=" + email + ", pass=" + pass + ", repass=" + repass + ", name=" + name + ", gender="
				+ gender + ", phone=" + phone + ", yourphone=" + yourphone + ", day=" + day + ", month=" + month
				+ ", year=" + year + ", quocgia=" + quocgia + ", tinhthanh=" + tinhthanh + ", quanhuyen=" + quanhuyen
				+ ", diachinha=" + diachinha + "]";

	}
}
