public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean emprunte;
    private Etudiant emprunteur;

    // Constructeur et autres attributs

    @Override
    public boolean estEmpruntable() {
        return !emprunte;
    }

    @Override
    public void emprunter(Etudiant emprunteur) {
        if (!emprunte) {
            this.emprunte = true;
            this.emprunteur = emprunteur;
            System.out.println(emprunteur.getNom() + " a emprunté le livre " + titre);
        } else {
            System.out.println("Le livre " + titre + " est déjà emprunté.");
        }
    }

    @Override
    public void rendre() {
        if (emprunte) {
            this.emprunte = false;
            System.out.println(emprunteur.getNom() + " a rendu le livre " + titre);
            this.emprunteur = null;
        } else {
            System.out.println("Le livre " + titre + " n'était pas emprunté.");
        }
    }

    // Autres méthodes et accesseurs
}
