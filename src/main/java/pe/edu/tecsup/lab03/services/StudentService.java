package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();

    public StudentEntity registerStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public List<StudentEntity> listStudents() {
        return studentRepository.findAll();
    }

    public StudentEntity getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public StudentEntity updateStudent(StudentEntity student) {
        return studentRepository.update(student);
    }

    public boolean deleteStudent(int id) {
        return studentRepository.deleteById(id);
    }
}
