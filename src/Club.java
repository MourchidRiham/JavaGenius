// Fichier: Club.java
import java.util.ArrayList;
import java.util.List;

public class Club {
    private String nom;
    private List<Etudiant> membres;

    public Club(String nom) {
        this.nom = nom;
        this.membres = new ArrayList<>();
    }

    public void ajouterMembre(Etudiant étudiant) {
        membres.add(étudiant);
    }

    // ... autres méthodes pour gérer les activités du club, les événements, etc.
}
