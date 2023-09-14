// Fichier: Inscription.java
import java.util.Date;

public class Inscription {
    private Étudiant étudiant;
    private Cours cours;
    private Date date;

    public Inscription(Étudiant étudiant, Cours cours, Date date) {
        this.étudiant = étudiant;
        this.cours = cours;
        this.date = date;
    }

    // ... autres méthodes pour gérer les détails de l'inscription
}
