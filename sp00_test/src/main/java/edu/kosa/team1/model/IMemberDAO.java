/*
package edu.kosa.team1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class IMemberDAO implements MemberDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean isMember(String id, String pwd) {
		String sql = "SELECT ID, PASSWD FROM MEMBERS WHERE ID= ? AND PASSWD= ?";
		boolean flag = false;
		Object[] params = { id, pwd };
		if (this.jdbcTemplate.queryForList(sql, params).size() > 0)
			flag = true;
		return flag;
	}

	@Override
	public void regester(String id, String passwd, String name, String jumin1, String jumin2) {
		String sql = "insert into MEMBERS(id, passwd, name, jumin1, jumin2, reg_date) values(?,?,?,?,?,SYSDATE)";
		Object[] params = { id, passwd, name, jumin1, jumin2 }; 
		this.jdbcTemplate.update(sql, params);
	}
}
*/