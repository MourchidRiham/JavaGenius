import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class AideFinancière {
    // Attributs de classe
    private static int nombreAides = 0;
    private static List<String> typesPossibles = new ArrayList<>();

    // Attributs d'instance
    private String nomEtudiant;
    private String typeAide;
    private double montant;
    private boolean approuvee;

    // Constructeurs
    public AideFinancière(String nomEtudiant, String typeAide, double montant, boolean approuvee) {
        this.nomEtudiant = nomEtudiant;
        this.typeAide = typeAide;
        this.montant = montant;
        this.approuvee = approuvee;
        nombreAides++;
    }

    public AideFinancière(String nomEtudiant, String typeAide, double montant) {
        this.nomEtudiant = nomEtudiant;
        this.typeAide = typeAide;
        this.montant = montant;
        this.approuvee = false; // Par défaut non approuvée
        nombreAides++;
    }

    public AideFinancière(String nomEtudiant, double montant) {
        this.nomEtudiant = nomEtudiant;
        this.typeAide = obtenirTypeAleatoire();
        this.montant = montant;
        this.approuvee = false;
        nombreAides++;
    }

    public AideFinancière(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.typeAide = obtenirTypeAleatoire();
        this.montant = genererMontantAleatoire();
        this.approuvee = false;
        nombreAides++;
    }

    public AideFinancière() {
        this.nomEtudiant = "Étudiant anonyme";
        this.typeAide = obtenirTypeAleatoire();
        this.montant = genererMontantAleatoire();
        this.approuvee = false;
        nombreAides++;
    }

    // Méthodes d'instance
    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public String getTypeAide() {
        return typeAide;
    }

    public double getMontant() {
        return montant;
    }

    public boolean estApprouvee() {
        return approuvee;
    }

    public void approuverAide() {
        approuvee = true;
    }

    // Méthodes de classe
    public static int getNombreAides() {
        return nombreAides;
    }

    private static String obtenirTypeAleatoire() {
        if (typesPossibles.isEmpty()) {
            typesPossibles.add("Bourse");
            typesPossibles.add("Prêt étudiant");
            typesPossibles.add("Aide d'urgence");
        }
        Random random = new Random();
        int index = random.nextInt(typesPossibles.size());
        return typesPossibles.get(index);
    }

    private static double genererMontantAleatoire() {
        Random random = new Random();
        return 500 + random.nextDouble() * 4500; // Montant entre 500 et 5000
    }
}

