package com.jteko.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jteko.sm.API.Student;
import com.jteko.sm.API.StudentDTO;
import com.jteko.sm.DAO.StudentDAO;

@Controller
public class StudentController {

	@Autowired
	StudentDAO studentdao; //this is the interface class

	@GetMapping("/list")
	public String showStudentDetails(Model model) {

		List<Student> studentlist = studentdao.loadStudents(); // this is the injected dependency

		model.addAttribute("students", studentlist);

		return "showstudentlist";
	}
	
	@GetMapping("/register")
	public String regStudent(Model model) {

		model.addAttribute("student", new StudentDTO());
		
		
		return "registerstudent";
	}
	
	
}
