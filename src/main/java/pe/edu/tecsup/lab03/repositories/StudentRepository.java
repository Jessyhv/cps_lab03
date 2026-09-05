package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<StudentEntity> students = new ArrayList<>();

    public StudentEntity save(StudentEntity student) {
        students.add(student);
        return student;
    }

    public List<StudentEntity> findAll() {
        return students;
    }

    public StudentEntity findById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
