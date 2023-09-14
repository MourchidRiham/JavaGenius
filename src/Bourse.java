import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bourse {
    private static String[] typesBourse = {"Mérite", "Besoin", "Sportif", "Culturel"};
    private static int nombreBourses = 0;

    private String code;
    private String nom;
    private String type;
    private double montant;
    private int nombreBeneficiaires;
    private List<String> critères;

    // Attributs de classe
    private static String universite = "Université XYZ";
    private static String pays = "Pays ABC";

    // Constructeurs
    public Bourse(String code, String nom, String type, double montant, int nombreBeneficiaires, List<String> critères) {
        this.code = code;
        this.nom = nom;
        this.type = type;
        this.montant = montant;
        this.nombreBeneficiaires = nombreBeneficiaires;
        this.critères = critères;
        nombreBourses++;
    }

    public Bourse(String nom, double montant) {
        this.code = genererCodeAleatoire();
        this.nom = nom;
        this.type = obtenirTypeAleatoire();
        this.montant = montant;
        this.nombreBeneficiaires = 1;
        this.critères = new ArrayList<>();
        nombreBourses++;
    }

    public Bourse(String nom) {
        this.code = genererCodeAleatoire();
        this.nom = nom;
        this.type = obtenirTypeAleatoire();
        this.montant = 1000.0;
        this.nombreBeneficiaires = 1;
        this.critères = new ArrayList<>();
        nombreBourses++;
    }

    public Bourse() {
        this.code = genererCodeAleatoire();
        this.nom = "Bourse sans nom";
        this.type = obtenirTypeAleatoire();
        this.montant = 1000.0;
        this.nombreBeneficiaires = 1;
        this.critères = new ArrayList<>();
        nombreBourses++;
    }

    // Méthodes d'instance
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public int getNombreBeneficiaires() {
        return nombreBeneficiaires;
    }

    public List<String> getCritères() {
        return critères;
    }

    public void ajouterCritère(String critère) {
        critères.add(critère);
    }

    public void afficherCritères() {
        System.out.println("Critères de la bourse " + nom + ":");
        for (String critère : critères) {
            System.out.println("- " + critère);
        }
    }

    // Méthodes de classe
    public static int getNombreBourses() {
        return nombreBourses;
    }

    private static String obtenirTypeAleatoire() {
        Random random = new Random();
        int index = random.nextInt(typesBourse.length);
        return typesBourse[index];
    }

    private static String genererCodeAleatoire() {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            code.append(random.nextInt(10));
        }
        return code.toString();
    }

}
