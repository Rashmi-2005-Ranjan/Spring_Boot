package in.crud.repository;

import in.crud.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student saveStudent(Student student) {
        // Logic to save the student to the database
        // For demonstration purposes, we'll just return the same student object
        return student;
    }
}
