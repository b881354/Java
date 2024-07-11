package dao;

import org.junit.Test;

public class DbConnectionTest {
	@Test
	public void DbConnectionTest()
	{
		System.out.println(DbConnection.getDb());
	}
}
