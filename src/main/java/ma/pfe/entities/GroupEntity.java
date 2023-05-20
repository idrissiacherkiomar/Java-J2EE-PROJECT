package ma.pfe.entities;

import javax.persistence.*;

@Entity
@Table(name = "T_GROUPS")
public class GroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_group")
    private String name;

    // Getters + Setters
    public long getId() { return id; }
    public String getName() { return name; }
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
