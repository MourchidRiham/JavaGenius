// Fichier: Bâtiment.java
public class Bâtiment {
    private String nom;
    private int nombreÉtages;

    public Bâtiment(String nom, int nombreÉtages) {
        this.nom = nom;
        this.nombreÉtages = nombreÉtages;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreÉtages() {
        return nombreÉtages;
    }
}

