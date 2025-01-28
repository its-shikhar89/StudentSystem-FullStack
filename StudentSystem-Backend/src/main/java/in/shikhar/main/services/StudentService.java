package in.shikhar.main.services;

import java.util.List;

import in.shikhar.main.entities.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public List<Student> getAllStudents();
}
