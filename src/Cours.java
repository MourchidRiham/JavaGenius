
public class Cours {
    private String nom;
    private String code;
    private Matière matiere;
    private Professeur enseignant;

    // Constructeur et autres attributs

    public void donnerCours(SalleDeCours salle) {
        enseignant.donnerCours(matiere, salle);
    }

    // Autres méthodes et accesseurs
}
