import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Budget {
    private static String[] categoriesPossibles = {"Enseignement", "Recherche", "Administration", "Événements"};
    private static int nombreBudgets = 0;

    private String code;
    private String nom;
    private String categorie;
    private double montantInitial;
    private double montantRestant;
    private Map<String, Double> depenses;

    // Attributs de classe
    private static String universite = "Université XYZ";
    private static String anneeUniversitaire = "2023-2024";

    // Constructeurs
    public Budget(String code, String nom, String categorie, double montantInitial) {
        this.code = code;
        this.nom = nom;
        this.categorie = categorie;
        this.montantInitial = montantInitial;
        this.montantRestant = montantInitial;
        this.depenses = new HashMap<>();
        nombreBudgets++;
    }

    public Budget(String nom, double montantInitial) {
        this.code = genererCodeAleatoire();
        this.nom = nom;
        this.categorie = obtenirCategorieAleatoire();
        this.montantInitial = montantInitial;
        this.montantRestant = montantInitial;
        this.depenses = new HashMap<>();
        nombreBudgets++;
    }

    public Budget(String nom) {
        this.code = genererCodeAleatoire();
        this.nom = nom;
        this.categorie = obtenirCategorieAleatoire();
        this.montantInitial = 10000.0;
        this.montantRestant = montantInitial;
        this.depenses = new HashMap<>();
        nombreBudgets++;
    }

    public Budget() {
        this.code = genererCodeAleatoire();
        this.nom = "Budget sans nom";
        this.categorie = obtenirCategorieAleatoire();
        this.montantInitial = 10000.0;
        this.montantRestant = montantInitial;
        this.depenses = new HashMap<>();
        nombreBudgets++;
    }

    // Méthodes d'instance
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public double getMontantInitial() {
        return montantInitial;
    }

    public double getMontantRestant() {
        return montantRestant;
    }

    public Map<String, Double> getDepenses() {
        return depenses;
    }

    public void ajouterDepense(String description, double montant) {
        if (montantRestant >= montant) {
            depenses.put(description, montant);
            montantRestant -= montant;
        } else {
            System.out.println("Montant insuffisant dans le budget.");
        }
    }

    public void afficherDepenses() {
        System.out.println("Dépenses du budget " + nom + ":");
        for (Map.Entry<String, Double> entry : depenses.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Méthodes de classe
    public static int getNombreBudgets() {
        return nombreBudgets;
    }

    private static String obtenirCategorieAleatoire() {
        Random random = new Random();
        int index = random.nextInt(categoriesPossibles.length);
        return categoriesPossibles[index];
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


