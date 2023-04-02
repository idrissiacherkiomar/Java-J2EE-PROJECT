package ma.pfe.dtos;

public class StudentIdDTO {
    private Long id;
    private String code;

    public StudentIdDTO() {
    }
    public StudentIdDTO(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    //Getter
    public Long getId() { return id; }
    public String getCode() { return code; }

    //Setter
    public void setId(Long id) { this.id = id; }
    public void setCode(String code) { this.code = code; }

    @Override
    public String toString() {
        return "StudentIdDTO{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
