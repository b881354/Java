package service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.MemberDaoImpl;
import entity.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService {
	private static final ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static final MemberDaoImpl mdi=a.getBean("MDI",MemberDaoImpl.class);
	@Override
	public void addMember(Member m) {
		mdi.add(m);
	}

	@Override
	public List<Member> selectAllMember() {
		return mdi.selectAll();
	}

	@Override
	public void updateMember(int id, String name, String password, String address, String phone) {
		List<Member> l=mdi.selectId(id);
		Member[] m=l.toArray(new Member[1]);
		m[0].setName(name);
		m[0].setPassword(password);
		m[0].setAddress(address);
		m[0].setPhone(phone);
		mdi.update(m[0]);
	}

	@Override
	public void deleteMember(int id) {
		List<Member> l=selectAllMember();
		Member[] m=l.toArray(new Member[1]);
		mdi.delete(m[0]);
	}

	@Override
	public String selectAllMemberTable() {
		List<Member> l=selectAllMember();
		String show="";
		for(Member m:l)
		{
			show=show+"<tr><td>"+m.getId()+
					"<td>"+m.getName()+
					"<td>"+m.getUsername()+
					"<td>"+m.getPassword()+
					"<td>"+m.getAddress()+
					"<td>"+m.getPhone();
		}
		return show;
	}

}
