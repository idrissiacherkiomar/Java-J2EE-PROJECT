package ma.pfe.dtos;

public class CoursDTO {
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
        return "CoursDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
