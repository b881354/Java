package dao;

import java.util.List;

import entity.Porder;

public interface PorderDao {
	void add(Porder p);
	List<Porder> selectAll();
	List<Porder> selectById(int id);
	void update(Porder p);
	void delete(Porder p);
}
