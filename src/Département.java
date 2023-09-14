
import java.util.ArrayList;
import java.util.List;

public class Département {
    private String nom;
    private List<Professeur> professeurs;

    public Département(String nom) {
        this.nom = nom;
        this.professeurs = new ArrayList<>();
    }

    public void ajouterProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    // ... autres méthodes pour gérer les professeurs, les cours, etc.
}

