package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	void add(Member m);
	List<Member> selectAll();
	List<Member> selectId(int id);
	void update(Member m);
	void delete(Member m);
}
