package dao.impl;

import java.util.List;

import dao.DbConnection;
import dao.MemberDao;
import entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		Member m=new MemberDaoImpl().queryById(4);
		m.setName("Student");
		new MemberDaoImpl().update(m);
	}
	
	private static EntityManager em=DbConnection.getDb();

	@Override
	public void add(Member m) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(m);
		et.commit();
		
	}

	@Override
	public List<Member> queryAll() {
		String SQL="select * from member";
		Query q=em.createNativeQuery(SQL,Member.class);
		return q.getResultList();
	}

	@Override
	public List<Member> queryMember(String username, String password) {
		String SQL="select * from member where username=?1 and password=?2";
		Query q=em.createNativeQuery(SQL,Member.class);
		q.setParameter(1, username);
		q.setParameter(2,password);
		return q.getResultList();
	}

	@Override
	public List<Member> queryUsername(String username) {
		String SQL="select * from member where username=?1";
		Query q=em.createNativeQuery(SQL, Member.class);
		q.setParameter(1,username);
		return q.getResultList();
	}

	@Override
	public Member queryById(int id) {
		Member m=em.find(Member.class, id);
		return m;
	}

	@Override
	public void update(Member m) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(m);
		et.commit();
		
	}

	@Override
	public void delete(Member m) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(m);
		et.commit();
		
	}

}
