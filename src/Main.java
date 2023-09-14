import java.util.Date ;
public class Main {
    public static void main(String[] args) {
        ActivitéCulturelle activité1 = new ActivitéCulturelle("Concert de jazz");
        ActivitéCulturelle activité2 = new ActivitéCulturelle("Exposition d'art");
        ActivitéCulturelle activité3 = new ActivitéCulturelle("Projection de film");
        ActivitéCulturelle activité4 = new ActivitéCulturelle("Atelier de danse", new Date(1234567890L));
        ActivitéCulturelle activité5 = new ActivitéCulturelle("Conférence sur l'histoire", new Date(1609459200000L), "Salle A");
        ActivitéCulturelle activité6 = new ActivitéCulturelle("Spectacle de théâtre");
        ActivitéCulturelle activité7 = new ActivitéCulturelle("Séance de méditation");
        ActivitéCulturelle activité8 = new ActivitéCulturelle("Cours de peinture");
        ActivitéCulturelle activité9 = new ActivitéCulturelle("Tournoi de jeu vidéo");
        ActivitéCulturelle activité10 = new ActivitéCulturelle("Festival de musique", new Date(1700000000L));
        ActivitéCulturelle activité11 = new ActivitéCulturelle("Soirée karaoké");
        ActivitéCulturelle activité12 = new ActivitéCulturelle("Visite guidée du musée");
        ActivitéCulturelle activité13 = new ActivitéCulturelle("Spectacle de magie");
        ActivitéCulturelle activité14 = new ActivitéCulturelle("Cours de cuisine");
        ActivitéCulturelle activité15 = new ActivitéCulturelle("Exposition de photographie");

        System.out.println("Nombre total d'activités : " + ActivitéCulturelle.getNombreActivités());
    }
}