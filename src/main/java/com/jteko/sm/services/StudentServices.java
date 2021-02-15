package com.jteko.sm.services;

import java.util.List;

import com.jteko.sm.API.Student;
import com.jteko.sm.API.StudentDTO;

public interface StudentServices {
	List<Student> loadStudents();

	void saveStudents(StudentDTO studentDTO);
	
	Student getStudent(int id);

	void updateStudent(StudentDTO studentDTO);

	void deleteStudents(int id);

}
