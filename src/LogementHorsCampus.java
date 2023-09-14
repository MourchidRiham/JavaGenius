import java.util.List;

public class LogementHorsCampus {
    private String adresse;
    private List<Étudiant> résidents;

    public LogementHorsCampus(String adresse) {
        this.adresse = adresse;
        // Initialisez la liste des résidents
    }

    public void ajouterRésident(Étudiant étudiant) {
        résidents.add(étudiant);
    }

    // ... autres méthodes pour gérer les résidents, les équipements, etc.
}
