package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl implements MemberDao {

	public static void main(String[] args) {
		Member m=new Member("a","o","000","taipei","444");
		new MemberDaoImpl().add(m);

	}

	@Override
	public void add(Member m) {
		Connection conn=DbConnection.getDb();
		String SQL="insert into member(name,username,password,address,phone)"
				+ " values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getPhone());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
