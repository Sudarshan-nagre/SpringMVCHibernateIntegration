package com.sud.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sud.spring.model.Student;
import com.sud.spring.services.StudentServiceIFC;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceIFC studentServiceIFC;
	
	@GetMapping("/student")
	public String listOfStudent(Model model) {
		model.addAttribute("lists", studentServiceIFC.getStudentList());
		return "showStudent";
	}
	
	@GetMapping("/student/save")
	public String showSaveStudentPage(Model model) {
		model.addAttribute("command",new Student());
		return "saveStudent";
	}
	
	
	@PostMapping("/student")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentServiceIFC.saveStudent(student);
		return "redirect:/student";
	}
	
	@GetMapping("/student/delete")
	public String deleteStudent(@RequestParam String id) {
		studentServiceIFC.deleteStudent(id);
		return "redirect:../student";
	}
	
	@GetMapping("/student/edit")
	public String editStudent(@RequestParam String id, Model model) {
		System.out.println("Id : "+id);
		
		Student st = studentServiceIFC.getStudent(Integer.parseInt(id));
		model.addAttribute("command",st);
		return "saveStudent";
	}
}
