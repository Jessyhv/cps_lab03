package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String career;

    public StudentEntity() {
    }

    public StudentEntity(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public StudentEntity(int id, String name, String lastName, String email, String career) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.career = career;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", career='" + career + '\'' +
                '}';
    }
}
