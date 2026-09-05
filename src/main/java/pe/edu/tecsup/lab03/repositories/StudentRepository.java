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

    public StudentEntity update(StudentEntity student) {
        StudentEntity existing = findById(student.getId());
        if (existing == null) {
            return null;
        }
        existing.setName(student.getName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());
        existing.setCareer(student.getCareer());
        return existing;
    }

    public boolean deleteById(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
}
