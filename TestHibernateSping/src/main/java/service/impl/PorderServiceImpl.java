package service.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.PorderDaoImpl;
import entity.Porder;
import service.PorderService;

public class PorderServiceImpl implements PorderService{
	private static final ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
	private static final PorderDaoImpl pdi=a.getBean("PDI",PorderDaoImpl.class);
	@Override
	public void addPorder(Porder p) {
		pdi.add(p);
		
	}

	@Override
	public List<Porder> selectAllPorder() {
		// TODO Auto-generated method stub
		return pdi.selectAll();
	}

	@Override
	public void updatePorder(int id, int a, int b) {
		List<Porder> l=pdi.selectById(id);
		Porder[] p=l.toArray(new Porder[1]);
		p[0].setA(a);
		p[0].setA(b);
		pdi.update(p[0]);
		
	}

	@Override
	public void updatePorder(int id, int a, int b, int c) {
		List<Porder> l=pdi.selectById(id);
		Porder[] p=l.toArray(new Porder[1]);
		p[0].setA(a);
		p[0].setA(b);
		p[0].setA(c);
		pdi.update(p[0]);
		
	}

	@Override
	public void deletePorder(int id) {
		/*
		 * id->調出Porder 執行-->dao-->delete
		 */

		List<Porder> l = pdi.selectById(id);
		Porder[] p = l.toArray(new Porder[1]);

		pdi.delete(p[0]);
		
	}

}
