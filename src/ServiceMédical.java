
import java.util.List;

public class ServiceMédical {
    private List<Médecin> médecins;
    private List<RendezVous> rendezVous;

    public ServiceMédical(List<Médecin> médecins) {
        this.médecins = médecins;
        // Initialisez la liste des rendez-vous
    }

    public void prendreRendezVous(RendezVous rendezVous) {
        rendezVous.add(rendezVous);
    }

    // ... autres méthodes pour gérer les consultations, les dossiers, etc.
}

