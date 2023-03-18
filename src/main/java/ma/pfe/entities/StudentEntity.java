package ma.pfe.entities;
import javax.persistence.*;

@Entity
@Table(name = "T_SUTDENTS")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="TYPE")
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class StudentEntity {

    @EmbeddedId
    private StudentId studentId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })

    @Column(name = "name_student")
    private String name;

    //@Id
    //@Column(name = "id_student")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private long id;


    //Getters
    /*
    public long getId() {
        return id;
    }
    */
    public String getName() {
        return name;
    }

    //Setters
    /*
    public void setId(long id) {
        this.id = id;
    }
    */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}
