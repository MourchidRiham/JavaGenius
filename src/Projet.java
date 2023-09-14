
import java.util.Date;

public class Projet {
    private String nom;
    private Date dateLimite;

    public Projet(String nom, Date dateLimite) {
        this.nom = nom;
        this.dateLimite = dateLimite;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateLimite() {
        return dateLimite;
    }
}

