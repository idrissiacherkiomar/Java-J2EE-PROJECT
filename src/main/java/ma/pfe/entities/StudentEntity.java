package ma.pfe.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_SUTDENTS")
//1
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="TYPE")
//2
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//3
@Inheritance(strategy=InheritanceType.JOINED)
public class StudentEntity {

    @EmbeddedId
    private StudentId studentId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })
    private Adresse adresse;

    @Column(name = "name_student")
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<CoursEntity> courses;

    //@Id
    //@Column(name = "id_student")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private long id;
    //public long getId() {return id;}
    //public void setId(long id) {this.id = id;}

    //Getters
    public String getName() { return name; }
    public StudentId getStudentId() { return studentId; }
    public Adresse getAdresse() { return adresse; }
    public List<CoursEntity> getCourses() { return courses; }


    //Setters
    public void setName(String name) { this.name = name; }
    public void setStudentId(StudentId studentId) { this.studentId = studentId; }
    public void setAdresse(Adresse adresse) { this.adresse = adresse; }
    public void setCourses(List<CoursEntity> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", adresse=" + adresse +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
