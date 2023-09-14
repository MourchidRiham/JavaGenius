// Fichier: Sport.java
import java.util.ArrayList;
import java.util.List;

public class Sport {
    private String nom;
    private List<Etudiant> joueurs;

    public Sport(String nom) {
        this.nom = nom;
        this.joueurs = new ArrayList<>();
    }

    public void ajouterJoueur(Etudiant joueur) {
        joueurs.add(joueur);
    }

    // ... autres méthodes pour gérer les matchs, les résultats, etc.
}
