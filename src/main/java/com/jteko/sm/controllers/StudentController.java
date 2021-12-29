package com.jteko.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jteko.sm.API.Student;
import com.jteko.sm.API.StudentDTO;
import com.jteko.sm.DAO.StudentDAO;
import com.jteko.sm.services.StudentServices;

@Controller
public class StudentController {

	@Autowired
	StudentServices services;

	@GetMapping("/")
	public String showStudentDetails(Model model) {

		List<Student> studentlist = services.loadStudents(); 

		model.addAttribute("students", studentlist);

		return "showstudentlist";
	}

	@GetMapping("/register")
	public String regStudent(Model model) {

		StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("student", studentDTO);

		return "registerstudent";
	}

	@PostMapping("/save-student")
	public String saveStudent(StudentDTO studentDTO) {

		System.out.println(studentDTO);

		if (studentDTO.getId() == 0) {
			services.saveStudents(studentDTO);
		} else {
			services.updateStudent(studentDTO);
		}

		return "redirect:/";
	}

	@GetMapping("/update")
	public String regStudent(@RequestParam("userId") int id, Model model) {

		System.out.println("looking for id " + id);
		Student studentI = services.getStudent(id);
		System.out.println(studentI);

		model.addAttribute("student", studentI);
		return "registerstudent";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("userId") int id) {

		services.deleteStudents(id);	
		
		
		return "redirect:/";
	}
	

}
