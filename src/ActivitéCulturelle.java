import java.util.Date;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ActivitéCulturelle {
    // Attributs de classe
    private static int nombreActivités = 0;
    private static List<String> lieuxPossibles = new ArrayList<>();

    // Attributs d'instance
    private String nom;
    private Date date;
    private String lieu;
    private List<Participant> participants = new ArrayList<>();

    // Constructeurs
    public ActivitéCulturelle(String nom, Date date, String lieu) {
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
        nombreActivités++;
    }

    public ActivitéCulturelle(String nom) {
        this.nom = nom;
        this.date = new Date();
        this.lieu = obtenirLieuAléatoire();
        nombreActivités++;
    }
    

    // Méthodes d'instance
    public void ajouterParticipant(Participant participant) {
        participants.add(participant);
    }

    public int getNombreParticipants() {
        return participants.size();
    }

    // Méthodes de classe
    public static int getNombreActivités() {
        return nombreActivités;
    }

    private static String obtenirLieuAléatoire() {
        if (lieuxPossibles.isEmpty()) {
            lieuxPossibles.add("Salle de conférence");
            lieuxPossibles.add("Théâtre");
            lieuxPossibles.add("Cour extérieure");
            lieuxPossibles.add("Salle polyvalente");
        }
        Random random = new Random();
        int index = random.nextInt(lieuxPossibles.size());
        return lieuxPossibles.get(index);
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = (Date) date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}