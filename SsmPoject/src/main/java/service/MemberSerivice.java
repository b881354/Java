package service;

import java.util.List;

import model.Member;

public interface MemberSerivice {
	void addMember(Member m);
	List<Member> selectAllMember();
	String selectAll();
	Member selectMemberById(int id);
	void updateMember(int id,String password,String name);
	void deleteMember(int id);
}
