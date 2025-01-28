package in.shikhar.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shikhar.main.entities.Student;
import in.shikhar.main.services.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class MyController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String addStudentDetails(@RequestBody Student student) {
		studentService.addStudent(student);
		return "New user added";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudentDetails() {
		return studentService.getAllStudents();
	}
}
