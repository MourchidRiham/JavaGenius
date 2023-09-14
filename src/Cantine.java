import java.util.List;

public class Cantine {
    private String nom;
    private List<Repas> repas;

    public Cantine(String nom) {
        this.nom = nom;
        // Initialisez la liste des repas
    }

    public void ajouterRepas(Repas repas) {
        repas.add(repas);
    }

    // ... autres méthodes pour gérer les menus, les horaires, etc.
}
