package controller;

import com.opensymphony.xwork2.ActionSupport;

import dao.impl.MemberDaoImpl;
import model.Member;

public class AddMemberAction extends ActionSupport{
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	@Override
	public String execute() throws Exception
	{
		Member m=new Member(getName(),getUsername(),getPassword(),getAddress(),getPhone());
		new MemberDaoImpl().add(m);
		return "addSuccess";
	}
}
