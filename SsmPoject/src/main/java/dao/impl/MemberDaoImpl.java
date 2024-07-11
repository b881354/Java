package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl implements MemberDao {

	@Override
	public void add(Member m) {
		SqlSession se=DbConnection.getDb();
		se.insert("add",m);
		se.commit();
	}

	@Override
	public List<Member> selectAll() {
		SqlSession se=DbConnection.getDb();
		List<Member> l=se.selectList("selectAll");
		return l;
	}

	@Override
	public List<Member> selectById(int id) {
		SqlSession se=DbConnection.getDb();
		List<Member> l=se.selectList("selectById",id);
		return l;
	}

	@Override
	public void update(Member m) {
		SqlSession se=DbConnection.getDb();
		se.update("update",m);
		se.commit();
	}

	@Override
	public void delete(int id) {
		SqlSession se=DbConnection.getDb();
		se.delete("delete", id);
		se.commit();
	}

}
