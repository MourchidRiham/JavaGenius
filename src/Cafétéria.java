
import java.util.ArrayList;
import java.util.List;

public class Cafétéria {
    private String nom;
    private List<Repas> repasServis;

    public Cafétéria(String nom) {
        this.nom = nom;
        this.repasServis = new ArrayList<>();
    }

    public void ajouterRepas(Repas repas) {
        repasServis.add(repas);
    }

    // ... autres méthodes pour gérer les repas, les horaires, etc.
}
