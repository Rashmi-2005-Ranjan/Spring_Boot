package in.crud.controller;

import in.crud.entity.Student;
import in.crud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent ( student );
        return ResponseEntity
                .status ( HttpStatus.CREATED )
                .body ( createdStudent );
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById ( id );
        if(student != null) {
            return ResponseEntity.ok ( student );
        } else {
            return ResponseEntity.notFound ().build ();
        }
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getStudentById() {
        List<Student>students = studentService.getAllStudent( );
        return ResponseEntity.ok ( students );
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudentById ( id, student );
        if(updatedStudent != null) {
            return ResponseEntity.status ( HttpStatus.OK ).body ( updatedStudent );
        } else {
            return ResponseEntity.notFound ().build ();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        Boolean isDeleted = studentService.deleteStudentById(id);
        if(!isDeleted) {
            return ResponseEntity.notFound ().build ();
        }
        return ResponseEntity.ok ( "Record Deleted Successfully" );
    }
}
