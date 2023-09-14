import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Atelier {
    private static List<String> themesPossibles = new ArrayList<>();
    private static int nombreAteliers = 0;

    private String nom;
    private String theme;
    private String animateur;
    private int capaciteMax;
    private List<String> participants;

    public Atelier(String nom, String theme, String animateur, int capaciteMax) {
        this.nom = nom;
        this.theme = theme;
        this.animateur = animateur;
        this.capaciteMax = capaciteMax;
        this.participants = new ArrayList<>();
        nombreAteliers++;
    }

    public Atelier(String nom, String theme, String animateur) {
        this.nom = nom;
        this.theme = theme;
        this.animateur = animateur;
        this.capaciteMax = 20; // Valeur par défaut
        this.participants = new ArrayList<>();
        nombreAteliers++;
    }

    public Atelier(String nom, String theme) {
        this.nom = nom;
        this.theme = theme;
        this.animateur = "Anonyme";
        this.capaciteMax = 20;
        this.participants = new ArrayList<>();
        nombreAteliers++;
    }

    public Atelier(String nom) {
        this.nom = nom;
        this.theme = obtenirThemeAleatoire();
        this.animateur = "Anonyme";
        this.capaciteMax = 20;
        this.participants = new ArrayList<>();
        nombreAteliers++;
    }

    public Atelier() {
        this.nom = "Atelier sans nom";
        this.theme = obtenirThemeAleatoire();
        this.animateur = "Anonyme";
        this.capaciteMax = 20;
        this.participants = new ArrayList<>();
        nombreAteliers++;
    }

    public void inscrireParticipant(String participant) {
        if (participants.size() < capaciteMax) {
            participants.add(participant);
            System.out.println(participant + " inscrit à l'atelier " + nom);
        } else {
            System.out.println("Capacité maximale atteinte pour l'atelier " + nom);
        }
    }

    public int getNombreParticipants() {
        return participants.size();
    }

    public void afficherParticipants() {
        System.out.println("Participants à l'atelier " + nom + ":");
        for (String participant : participants) {
            System.out.println("- " + participant);
        }
    }

    public static int getNombreAteliers() {
        return nombreAteliers;
    }

    private static String obtenirThemeAleatoire() {
        if (themesPossibles.isEmpty()) {
            themesPossibles.add("Art plastique");
            themesPossibles.add("Musique");
            themesPossibles.add("Danse");
            themesPossibles.add("Cuisine");
            themesPossibles.add("Photographie");
        }
        Random random = new Random();
        int index = random.nextInt(themesPossibles.size());
        return themesPossibles.get(index);
    }

}
