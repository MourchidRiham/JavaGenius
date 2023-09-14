import java.util.List ;
public interface ParticipationActivite {
    void participerActivite(ActivitéCulturelle activite);
    void annulerParticipation(ActivitéCulturelle activite);
    List<ActivitéCulturelle> getActivitesParticipees();
}

