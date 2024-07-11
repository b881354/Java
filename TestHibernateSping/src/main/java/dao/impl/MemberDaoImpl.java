package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import dao.DbConnection;
import dao.MemberDao;
import entity.Member;

public class MemberDaoImpl implements MemberDao {

	public static void main(String[] args) {
		List<Member> l=new MemberDaoImpl().selectAll();
		for(Member m:l)
		{
			System.out.println("id:"+m.getId()+"\tname:"+m.getName());
		}

	}

	@Override
	public void add(Member m) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.save(m);
		t.commit();
	}

	@Override
	public List<Member> selectAll() {
		Session se=DbConnection.getDb();
		String SQL="select * from member";
		NativeQuery q=se.createNativeQuery(SQL,Member.class);
		return q.list();
	}

	@Override
	public void update(Member m) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.update(m);
		t.commit();
		
	}

	@Override
	public void delete(Member m) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.delete(m);
		t.commit();
		
	}

	@Override
	public List<Member> selectId(int id) {
		Session se=DbConnection.getDb();
		String SQL="select * from member where id=?1";
		NativeQuery q=se.createNativeQuery(SQL,Member.class);
		q.setParameter(1, id);
		return q.list();
	}

}
