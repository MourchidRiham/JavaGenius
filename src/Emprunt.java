import java.time.LocalDate ;
public class Emprunt {
    private Empruntable objetEmprunte;
    private Etudiant emprunteur;
    private LocalDate dateEmprunt;
    private LocalDate dateRetour;

    // Constructeur et autres attributs

    public void validerEmprunt() {
        if (objetEmprunte.estEmpruntable()) {
            objetEmprunte.emprunter(emprunteur);
            dateEmprunt = LocalDate.now();
            dateRetour = null;
        } else {
            System.out.println("L'objet n'est pas disponible à l'emprunt.");
        }
    }

    public void validerRetour() {
        if (dateEmprunt != null) {
            objetEmprunte.rendre();
            dateRetour = LocalDate.now();
        } else {
            System.out.println("Cet objet n'a pas été emprunté.");
        }
    }

    // Autres méthodes et accesseurs
}
