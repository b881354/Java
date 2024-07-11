package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.Member;
import service.impl.MemberServiceImpl;

@Controller
public class MemberController {
	static ApplicationContext a1=new ClassPathXmlApplicationContext("sp1.xml");
	static MemberServiceImpl msi=a1.getBean("msi", MemberServiceImpl.class);
	
	@PostMapping("add")
	public String add(String name,String username,String password,String address,String phone)
	{
		Member m=new Member(name,username,password,address,phone);
		msi.addMember(m);
		return "addSuccess";
	}
	@PostMapping("update")
	public void update(int id,String password,String name,HttpServletResponse response)
	{
		msi.updateMember(id, password, name);
		try
		{
			response.sendRedirect("index.jsp");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	@PostMapping("delete")
	public void delete(int id,HttpServletResponse response)
	{
		msi.deleteMember(id);
		try
		{
			response.sendRedirect("index.jsp");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@GetMapping("addMember")
	public String addMember()
	{
		return "addMember";
	}
	@GetMapping("queryMember")
	public String queryMember()
	{
		return "queryMember";
	}
	@GetMapping("updateMember")
	public String updateMember()
	{
		return "updateMember";
	}
	@GetMapping("deleteMember")
	public String deleteMember()
	{
		return "deleteMember";
	}
}
