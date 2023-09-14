
import java.util.ArrayList;
import java.util.List;

public class Campus {
    private List<Bâtiment> bâtiments;
    private List<Espace> espaces;

    public Campus() {
        this.bâtiments = new ArrayList<>();
        this.espaces = new ArrayList<>();
    }

    public void ajouterBâtiment(Bâtiment bâtiment) {
        bâtiments.add(bâtiment);
    }

    public void ajouterEspace(Espace espace) {
        espaces.add(espace);
    }

    // ... autres méthodes pour gérer les espaces, les installations, etc.
}
