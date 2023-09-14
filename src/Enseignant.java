public interface Enseignant {
    void donnerCours(Matière matiere, SalleDeCours salle);

    static void attribuerNote(Etudiant etudiant, Matière matiere, double note);
}
