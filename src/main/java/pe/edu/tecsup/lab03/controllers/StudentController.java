package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;

public class StudentController {

    private final StudentService studentService = new StudentService();

    public StudentEntity addStudent(StudentEntity student) {
        return studentService.registerStudent(student);
    }

    public List<StudentEntity> getAllStudents() {
        return studentService.listStudents();
    }

    public StudentEntity getStudent(int id) {
        return studentService.getStudentById(id);
    }
}
