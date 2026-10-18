package in.crud.service;

import in.crud.entity.Student;
import in.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        Student response = studentRepository.saveStudent(student);
        return response;
    }
}
