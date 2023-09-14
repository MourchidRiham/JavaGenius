// Fichier: Matière.java
public class Matière {
    private String nom;
    private String description;

    public Matière(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }
}
