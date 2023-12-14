package epicode.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("Gara di Altetica")
public class GaraDiAltetica extends Event {
    //ATTRIBUTI
    @OneToMany
    private Set<Person> atleti;

    @OneToOne
    private Person vincitore;

    //COSTRUTTORI
    public GaraDiAltetica() {
    }

    public GaraDiAltetica(Set<Person> atleti, Person vincitore) {
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    //METODI
    public Set<Person> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Person> atleti) {
        this.atleti = atleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }
}
