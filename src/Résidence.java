// Fichier: Résidence.java
import java.util.ArrayList;
import java.util.List;

public class Résidence {
    private String nom;
    private List<Chambre> chambres;

    public Résidence(String nom) {
        this.nom = nom;
        this.chambres = new ArrayList<>();
    }

    public void ajouterChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    // ... autres méthodes pour gérer les chambres, les résidents, etc.
}
