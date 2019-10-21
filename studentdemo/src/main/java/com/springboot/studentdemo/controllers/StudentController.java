package com.springboot.studentdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.studentdemo.dao.StudentRepository;
import com.springboot.studentdemo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
private StudentRepository studentrepositroy;
	@RequestMapping(value="/",method=RequestMethod.GET)
 public String studentLogin() {
		return "studentlogin";
		
		
	}
	@RequestMapping(value="/RegisterStudent",method = RequestMethod.GET)
	public String  studentRegister(Model model) {
		model.addAttribute("student",new Student());
		return "studentregister";
	}
	
	@RequestMapping(value="/registerstudent",method = RequestMethod.POST)
	  public String addEmployee(@ModelAttribute("student") Student st) {
	  
	  
	  Student s= studentrepositroy.save(st);
	  
	  if(s!=null)
	  {
		  return "studentlogin";
	  }
	  else
	  {
	  return "index"; 
	  }
	}
}
