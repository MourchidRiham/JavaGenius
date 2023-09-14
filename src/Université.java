
import java.util.ArrayList;
import java.util.List;

public class Université {
    private String nom;
    private List<Professeur> professeurs;
    private List<Etudiant> étudiants;
    private List<Cours> cours;

    public Université(String nom) {
        this.nom = nom;
        this.professeurs = new ArrayList<>();
        this.étudiants = new ArrayList<>();
        this.cours = new ArrayList<>();
    }

    public void embaucherProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    public void inscrireEtudiant(Etudiant etudiant) {
        étudiants.add(etudiant);
    }

    public void ajouterCours(Cours cours) {
        this.cours.add(cours);
    }

    // ... autres méthodes pour gérer les différentes fonctionnalités de l'université
}
