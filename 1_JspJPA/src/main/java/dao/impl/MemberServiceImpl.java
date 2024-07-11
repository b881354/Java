package dao.impl;

import java.util.List;

import dao.MemberService;
import entity.Member;

public class MemberServiceImpl implements MemberService {

	public static void main(String[] args) {
		new MemberServiceImpl().updateMember(1, "teacher","123","台北","123");

	}
	
	private static MemberDaoImpl mdi=new MemberDaoImpl();

	@Override
	public void addMember(Member m) {
		//new MemberDaoImpl().add(m);
		mdi.add(m);
		
	}

	@Override
	public boolean selecyByUsername(String username) {
		//List<Member> l=new MemberDaoImpl().queryUsername(username);
		List<Member> l=mdi.queryUsername(username);
		boolean x=false;
		
		if(l.size()!=0) x=true;
		return x;
	}

	@Override
	public Member LoginMember(String username, String password) {
		//List<Member> l=new MemberDaoImpl().queryMember(username, password);
		List<Member> l=mdi.queryMember(username, password);
		if(l.size()!=0)
		{
			Member[] m=l.toArray(new Member[l.size()]);
			return m[0];
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Member> selectAll() {
		//return new MemberDaoImpl().queryAll();
		return mdi.queryAll();
	}

	@Override
	public String selectAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectById(int id) {
		//return new MemberDaoImpl().queryById(id);
		return mdi.queryById(id);
	}

	@Override
	public void updateMember(int id, String name) {
		Member m=selectById(id);
		m.setName(name);
		
		//new MemberDaoImpl().update(m);
		mdi.update(m);
	}

	@Override
	public void updateMember(int id, String name, String password, String address, String phone) {
		Member m=selectById(id);
		m.setName(name);
		m.setPassword(password);
		m.setAddress(address);
		m.setPhone(phone);
		
		//new MemberDaoImpl().update(m);
		mdi.update(m);
	}

	@Override
	public void deleMember(int id) {
		Member m=selectById(id);
		//new MemberDaoImpl().delete(m);
		if(m!=null)mdi.delete(m);
	}

}
