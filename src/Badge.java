import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Badge {
    private static List<String> typesPossibles = new ArrayList<>();
    private static int nombreBadges = 0;

    private String numeroBadge;
    private String nomProprietaire;
    private String type;
    private boolean actif;
    private List<String> acces;

    // Constructeurs
    public Badge(String numeroBadge, String nomProprietaire, String type, boolean actif, List<String> acces) {
        this.numeroBadge = numeroBadge;
        this.nomProprietaire = nomProprietaire;
        this.type = type;
        this.actif = actif;
        this.acces = acces;
        nombreBadges++;
    }

    public Badge(String numeroBadge, String nomProprietaire, String type) {
        this.numeroBadge = numeroBadge;
        this.nomProprietaire = nomProprietaire;
        this.type = type;
        this.actif = true; // Par défaut actif
        this.acces = new ArrayList<>();
        nombreBadges++;
    }

    public Badge(String numeroBadge, String nomProprietaire) {
        this.numeroBadge = numeroBadge;
        this.nomProprietaire = nomProprietaire;
        this.type = obtenirTypeAleatoire();
        this.actif = true;
        this.acces = new ArrayList<>();
        nombreBadges++;
    }

    public Badge(String nomProprietaire) {
        this.numeroBadge = genererNumeroAleatoire();
        this.nomProprietaire = nomProprietaire;
        this.type = obtenirTypeAleatoire();
        this.actif = true;
        this.acces = new ArrayList<>();
        nombreBadges++;
    }

    public Badge() {
        this.numeroBadge = genererNumeroAleatoire();
        this.nomProprietaire = "Propriétaire inconnu";
        this.type = obtenirTypeAleatoire();
        this.actif = true;
        this.acces = new ArrayList<>();
        nombreBadges++;
    }

    // Méthodes d'instance
    public String getNumeroBadge() {
        return numeroBadge;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public String getType() {
        return type;
    }

    public boolean estActif() {
        return actif;
    }

    public void desactiverBadge() {
        actif = false;
    }

    public void ajouterAcces(String lieu) {
        acces.add(lieu);
    }

    public int getNombreAcces() {
        return acces.size();
    }

    public void afficherAcces() {
        System.out.println("Accès du badge " + numeroBadge + ":");
        for (String lieu : acces) {
            System.out.println("- " + lieu);
        }
    }

    // Méthodes de classe
    public static int getNombreBadges() {
        return nombreBadges;
    }

    private static String obtenirTypeAleatoire() {
        if (typesPossibles.isEmpty()) {
            typesPossibles.add("Employé");
            typesPossibles.add("Étudiant");
            typesPossibles.add("Visiteur");
        }
        Random random = new Random();
        int index = random.nextInt(typesPossibles.size());
        return typesPossibles.get(index);
    }

    private static String genererNumeroAleatoire() {
        StringBuilder numero = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            numero.append(random.nextInt(10));
        }
        return numero.toString();
    }

}
