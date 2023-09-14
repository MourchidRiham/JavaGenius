public interface Empruntable {
    boolean estEmpruntable();
    void emprunter(Etudiant emprunteur);
    void rendre();
}

