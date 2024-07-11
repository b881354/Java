package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import dao.DbConnection;
import dao.PorderDao;
import entity.Porder;

public class PorderDaoImpl implements PorderDao {

	@Override
	public void add(Porder p) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.save(p);
		t.commit();
		
	}

	@Override
	public List<Porder> selectAll() {
		Session se=DbConnection.getDb();
		String SQL="select * from porder";
		NativeQuery q=se.createNativeQuery(SQL, Porder.class);
		return q.list();
	}

	@Override
	public void update(Porder p) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.update(p);
		t.commit();
		
	}

	@Override
	public void delete(Porder p) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.delete(p);
		t.commit();
		
	}

	@Override
	public List<Porder> selectById(int id) {
		Session se=DbConnection.getDb();
		String SQL="select * from porder where id=?1";
		NativeQuery q=se.createNativeQuery(SQL, Porder.class);
		q.setParameter(1, id);
		return q.list();
		
	}

}
