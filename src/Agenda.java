
import java.util.HashMap;
import java.util.Map;
import java.util.Date ;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<ActivitéCulturelle> activites;

    public Agenda() {
        activites = new ArrayList<>();
    }

    public void ajouterActivite(ActivitéCulturelle activite) {
        activites.add(activite);
    }

    public List<ActivitéCulturelle> getActivites() {
        return activites;
    }

    public List<ActivitéCulturelle> trouverActivitesParLieu(String lieu) {
        List<ActivitéCulturelle> activitesTrouvees = new ArrayList<>();
        for (ActivitéCulturelle activite : activites) {
            if (activite.getLieu().equalsIgnoreCase(lieu)) {
                activitesTrouvees.add(activite);
            }
        }
        return activitesTrouvees;
    }

    public List<ActivitéCulturelle> trouverActivitesParDate(Date date) {
        List<ActivitéCulturelle> activitesTrouvees = new ArrayList<>();
        for (ActivitéCulturelle activite : activites) {
            if (activite.getDate().equals(date)) {
                activitesTrouvees.add(activite);
            }
        }
        return activitesTrouvees;
    }

}
