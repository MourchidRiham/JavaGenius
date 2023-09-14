import java.text.MessageFormat;

public abstract class Professeur extends Personne implements Enseignant {
    private String matiereEnseignee;

    // Constructeur et autres attributs


    @Override
    public void donnerCours(Matière matiere, SalleDeCours salle) {
        System.out.println(MessageFormat.format("{0} donne le cours de {1} dans la salle {2}", getNom(), matiere.getNom(), salle.getNumero()));
    }

    @Override
    public void attribuerNote(Etudiant etudiant, Matière matiere, double note) {
        // Logique pour attribuer une note à un étudiant pour une matière
        System.out.println("Note de " + etudiant.getNom() + " pour " + matiere.getNom() + " : " + note);
    }

    // Autres méthodes et accesseurs
}

