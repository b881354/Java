package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	void add(Member m);
	
	List<Member> queryAll();
	List<Member> queryMember(String username,String password);
	List<Member> queryUsername(String username);
	Member queryById(int id);
	
	void update(Member m);
	
	void delete(Member m);
}
