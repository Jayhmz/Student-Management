package com.jteko.sm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jteko.sm.API.Student;
import com.jteko.sm.API.StudentDTO;
import com.jteko.sm.DAO.StudentDAO;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	StudentDAO studentdao;

	@Override
	public List<Student> loadStudents() {

		List<Student> students = studentdao.loadStudents();
		
		return students;
	}

	@Override
	public void saveStudents(StudentDTO studentDTO) {
		
		studentdao.saveStudents(studentDTO);
		
		System.out.println(studentDTO);
		
	}

	@Override
	public Student getStudent(int id) {
		
		return studentdao.getStudent(id);
	}

	@Override
	public void updateStudent(StudentDTO studentDTO) {
		
		studentdao.updateStudents(studentDTO);
		
		
	}

	@Override
	public void deleteStudents(int id) {
		
		studentdao.deleteStudent(id);
		
	}

	
	
	
}
