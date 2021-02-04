package com.jteko.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jteko.sm.API.Student;
import com.jteko.sm.RowMapper.StudentRowMapper;

@Repository
public class StudentDAOimpl implements StudentDAO {

	@Autowired
	JdbcTemplate template;
	@Override
	public List<Student> loadStudents() {
		
		String sql = "select * from students";
		List<Student> listsofstudents = template.query(sql, new StudentRowMapper());
		
		return listsofstudents;
		
		
		
	}

}
