package dao;

import java.util.List;

import model.Member;

public interface MemberDao {
	void add(Member m);
	List<Member> selectAll();
	List<Member> selectById(int id);
	void update(Member m);
	void delete(int id);
}
