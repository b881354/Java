package dao;

import java.util.List;

import entity.Member;

public interface MemberService {
	void addMember(Member m);
	
	boolean selecyByUsername(String username);
	Member LoginMember(String username,String password);
	List<Member> selectAll();
	String selectAll2();
	Member selectById(int id);
	
	void updateMember(int id,String name);
	void updateMember(int id,String name,String password,String address,String phone);
	
	void deleMember(int id);
}
