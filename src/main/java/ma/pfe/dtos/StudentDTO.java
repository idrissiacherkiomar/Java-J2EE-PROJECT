package ma.pfe.dtos;

import java.util.List;

public class StudentDTO {
    //private long id;
    //public long getId() { return id; }
    //public void setId(long id) { this.id = id; }

    private String name;
    private StudentIdDTO studentId;
    private AdresseDTO adresse;
    private List<CoursDTO> courses;

    //Getters
    public String getName() { return name; }
    public StudentIdDTO getStudentId() { return studentId; }
    public AdresseDTO getAdresse() { return adresse; }
    public List<CoursDTO> getCourses() { return courses; }

    //Setters
    public void setName(String name) { this.name = name; }
    public void setStudentId(StudentIdDTO studentId) { this.studentId = studentId; }
    public void setAdresse(AdresseDTO adresse) { this.adresse = adresse; }
    public void setCourses(List<CoursDTO> courses) { this.courses = courses; }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", adresse=" + adresse +
                ", courses=" + courses +
                '}';
    }
}
