package model;

public class Member {
	private Integer id;
	private String username;
	private String name;
	private String password;
	private String address;
	private String phone;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String username, String name, String password, String address, String phone) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
