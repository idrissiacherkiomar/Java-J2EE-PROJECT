package ma.pfe.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("mineur")
public class Mineur extends StudentEntity{

    @Column(name="ParentMineur")
    private String parentMineur;
}
