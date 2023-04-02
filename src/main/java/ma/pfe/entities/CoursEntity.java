package ma.pfe.entities;

import javax.persistence.*;

@Entity
@Table(name = "T_COURS")
public class CoursEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    //Getter
    public long getId() { return id; }
    public String getName() { return name; }

    //Setter
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "CoursEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
