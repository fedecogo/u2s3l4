package epicode.entities;
import javax.persistence.*;

@Entity
@DiscriminatorValue("Gara di Calcio")
public class PartitaDiCalcio extends Event {
    //ATTRIBUTION
    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int numGolSquadraDiCasa;
    private int numGolSquadraOspite;

    //COSTRUTTORI

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente, int numGolSquadraDiCasa, int numGolSquadraOspite) {
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numGolSquadraDiCasa = numGolSquadraDiCasa;
        this.numGolSquadraOspite = numGolSquadraOspite;
    }

    //METODI

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public int getNumGolSquadraDiCasa() {
        return numGolSquadraDiCasa;
    }

    public int getNumGolSquadraOspite() {
        return numGolSquadraOspite;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public void setNumGolSquadraDiCasa(int numGolSquadraDiCasa) {
        this.numGolSquadraDiCasa = numGolSquadraDiCasa;
    }

    public void setNumGolSquadraOspite(int numGolSquadraOspite) {
        this.numGolSquadraOspite = numGolSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numGolSquadraDiCasa=" + numGolSquadraDiCasa +
                ", numGolSquadraOspite=" + numGolSquadraOspite +
                '}';
    }
}
