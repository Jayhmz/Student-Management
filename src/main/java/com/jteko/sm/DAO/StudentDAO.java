package com.jteko.sm.DAO;

import java.util.List;

import com.jteko.sm.API.Student;
import com.jteko.sm.API.StudentDTO;

public interface StudentDAO {

	List<Student> loadStudents();

	void saveStudents(StudentDTO studentDTO);
	
	Student getStudent(int id);

	void updateStudents(StudentDTO studentDTO);

	void deleteStudent(int id);


}
