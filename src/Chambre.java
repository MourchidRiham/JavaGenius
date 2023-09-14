
import java.util.List;

public class Chambre {
    private int numéro;
    private List<Etudiant> occupants;

    public Chambre(int numéro) {
        this.numéro = numéro;
        // Initialisez la liste des occupants
    }

    public void ajouterOccupant(Etudiant étudiant) {
        occupants.add(étudiant);
    }

    // ... autres méthodes pour gérer les occupants, les équipements, etc.
}

