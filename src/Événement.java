// Fichier: Événement.java
import java.util.Date;

public class Événement {
    private String nom;
    private Date date;
    private String description;

    public Événement(String nom, Date date, String description) {
        this.nom = nom;
        this.date = date;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
