package in.crud.service;

import in.crud.entity.Student;
import in.crud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        Student response = studentRepository.save ( student );
        return response;
    }

    public Student getStudentById(Long id) {
        Optional<Student> byId = studentRepository.findById ( id );
        return byId.orElse ( null );
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll ();
    }

    public Student updateStudentById(Long id, Student student) {
        Optional<Student> existingStudent = studentRepository.findById ( id );
        if(existingStudent.isPresent ()){
            Student oldStudent = existingStudent.get ();
            oldStudent.setName ( student.getName () );
            oldStudent.setEmail ( student.getEmail () );
            oldStudent.setAge ( student.getAge () );
            oldStudent.setRollNumber ( student.getRollNumber () );
            oldStudent.setSubject ( student.getSubject () );
            return studentRepository.save ( oldStudent );
        }else{
            return null;
        }
    }

    public Boolean deleteStudentById(Long id) {
        Optional<Student> existingStudent = studentRepository.findById ( id );
        if(existingStudent.isPresent ()){
            studentRepository.deleteById ( id );
            return true;
        }else{
            return false;
        }
    }
}
