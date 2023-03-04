package ma.pfe.dtos;

public class StudentDTO {
    private long id;
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
