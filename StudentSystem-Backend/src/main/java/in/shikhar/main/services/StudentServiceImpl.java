package in.shikhar.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shikhar.main.entities.Student;
import in.shikhar.main.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
