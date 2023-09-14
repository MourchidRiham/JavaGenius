// Fichier: PlanDeCours.java
import java.util.List;

public class PlanDeCours {
    private List<String> chapitres;
    private List<String> activités;

    public PlanDeCours(List<String> chapitres, List<String> activités) {
        this.chapitres = chapitres;
        this.activités = activités;
    }

    public List<String> getChapitres() {
        return chapitres;
    }

    public List<String> getActivités() {
        return activités;
    }
}

