// Fichier: SystèmeDePaie.java
import java.util.HashMap;
import java.util.Map;

public class SystèmeDePaie {
    private Map<Personne, Double> salaires;

    public SystèmeDePaie() {
        salaires = new HashMap<>();
    }

    public void attribuerSalaire(Personne personne, double salaire) {
        salaires.put(personne, salaire);
    }

    // ... autres méthodes pour gérer les salaires, les paiements, etc.
}

