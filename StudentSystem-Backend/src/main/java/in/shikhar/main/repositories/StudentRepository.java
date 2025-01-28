package in.shikhar.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shikhar.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
