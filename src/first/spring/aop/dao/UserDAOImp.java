package first.spring.aop.dao;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

public class UserDAOImp implements UserDAO {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insertUser(User user) throws Exception {
		int id = user.getId();
		String name = user.getName();
		String sex = user.getSex();
		int age = user.getAge();
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			String insert = "insert into tb_people (id,name,sex,age) values (" + id + " , '" + name + "' , '" + sex
					+ "' , " + age + ")";
			stmt.execute(insert);
			System.out.println("更新数据库成功！");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库更新失败！");
		} finally {
			stmt.close();
			conn.close();
		}
	}

}
