// Fichier: Personne.java
public abstract class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Personne() {

    }

    public Object getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public abstract void donnerCours(Matière matiere, SalleDeCours salle);
}



