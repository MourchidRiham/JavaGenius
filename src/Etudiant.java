// Fichier: Etudiant.java
public class Etudiant extends Personne {
    private String spécialité;

    public Etudiant(String nom, int age, String spécialité) {
        super(nom, age);
        this.spécialité = spécialité;
    }

    public String getSpécialité() {
        return spécialité;
    }
}

