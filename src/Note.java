public class Note {
    private Etudiant etudiant;
    private Matière matiere;
    private double valeur;

    // Constructeur et autres attributs

    public void attribuerNote() {
        Enseignant.attribuerNote(etudiant, matiere, valeur);
    }

    // Autres méthodes et accesseurs
}

