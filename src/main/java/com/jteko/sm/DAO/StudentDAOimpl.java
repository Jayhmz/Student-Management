package com.jteko.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jteko.sm.API.Student;
import com.jteko.sm.API.StudentDTO;
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

	@Override
	public void saveStudents(StudentDTO studentDTO) {

		Object[] DTOparams = { studentDTO.getName(), studentDTO.getMatno(), studentDTO.getEmail(),
				studentDTO.getPhone() };

		String sql = "insert into students(name, matno, email, phone) values(?,?,?,?)";

		template.update(sql, DTOparams);
		System.out.println("1 record added");

	}

	@Override
	public Student getStudent(int id) {

		String sql = "select * from students where id = ?";

		Student student = template.queryForObject(sql, new StudentRowMapper(), id);

		return student;
	}

	@Override
	public void updateStudents(StudentDTO studentDTO) {

		String sql = "UPDATE STUDENTS SET name=?, matno=?, phone=?, email=? WHERE id=?";
		
		template.update(sql, studentDTO.getName(), studentDTO.getMatno(), studentDTO.getPhone(), studentDTO.getEmail(), studentDTO.getId());

		System.out.println("update successfull.....");
	}

	@Override
	public void deleteStudent(int id) {

		String sql = "DELETE FROM STUDENTS WHERE id = ?";
		template.update(sql, id);
		
	}

}
