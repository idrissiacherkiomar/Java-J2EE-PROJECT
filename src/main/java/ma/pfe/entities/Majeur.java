package ma.pfe.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("majeur")
public class Majeur extends StudentEntity{

    @Column(name="cin")
    private String cin;
}
