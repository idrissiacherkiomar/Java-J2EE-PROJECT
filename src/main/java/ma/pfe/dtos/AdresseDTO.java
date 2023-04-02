package ma.pfe.dtos;

public class AdresseDTO {
    private String rue;
    private String avenue;
    private String number;

    //Getter
    public String getRue() { return rue; }
    public String getAvenue() { return avenue; }
    public String getNumber() { return number; }

    //Setter
    public void setRue(String rue) { this.rue = rue; }
    public void setAvenue(String avenue) { this.avenue = avenue; }
    public void setNumber(String number) { this.number = number; }

    @Override
    public String toString() {
        return "AdresseDTO{" +
                "rue='" + rue + '\'' +
                ", avenue='" + avenue + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
