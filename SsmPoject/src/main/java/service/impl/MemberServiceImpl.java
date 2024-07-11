package service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberSerivice;

public class MemberServiceImpl implements MemberSerivice{
	static ApplicationContext a1=new ClassPathXmlApplicationContext("sp1.xml");
	static MemberDaoImpl mdi=a1.getBean("mdi", MemberDaoImpl.class);
	@Override
	public void addMember(Member m) {
		mdi.add(m);
		
	}

	@Override
	public List<Member> selectAllMember() {
		return mdi.selectAll();
	}

	@Override
	public String selectAll() {
		List<Member> l=selectAllMember();
		String show="";
		for(Member m:l)
		{
			show=show+"<tr><td>"+m.getId()+
					"<tr>"+m.getName()+
					"<tr>"+m.getUsername()+
					"<tr>"+m.getPassword()+
					"<tr>"+m.getAddress()+
					"<tr>"+m.getPhone();
		}
		return show;
	}

	@Override
	public Member selectMemberById(int id) {
		List<Member> l=mdi.selectById(id);
		Member[] m=l.toArray(new Member[1]);
		return m[0];
	}

	@Override
	public void updateMember(int id, String password, String name) {
		Member m=selectMemberById(id);
		m.setPassword(password);
		m.setName(name);
		mdi.update(m);
	}

	@Override
	public void deleteMember(int id) {
		mdi.delete(id);
		
	}

}
