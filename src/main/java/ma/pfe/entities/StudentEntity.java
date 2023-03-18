package ma.pfe.entities;
import javax.persistence.*;

@Entity
@Table(name = "T_SUTDENTS")
public class StudentEntity {
    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name_student")
    private String name;

    //Getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    //Setters
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
