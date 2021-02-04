package com.jteko.sm.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jteko.sm.API.Student;

public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setMatno(rs.getString("matno"));
		student.setPhone(rs.getLong("phone"));
		student.setEmail(rs.getString("email"));
		
		return student;
	}

}
