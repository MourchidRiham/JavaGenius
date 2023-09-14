
import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bibliothèque {
    private static String[] emplacementsPossibles = {"Rue de la Bibliothèque", "Avenue des Livres", "Place de la Culture"};
    private static int nombreBibliothèques = 0;

    private String nom;
    private String adresse;
    private int capaciteMax;
    private Map<String, Integer> livresParGenre;

    public Bibliothèque(String nom, String adresse, int capaciteMax) {
        this.nom = nom;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.livresParGenre = new HashMap<>();
        nombreBibliothèques++;
    }

    public Bibliothèque(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.capaciteMax = 1000;
        this.livresParGenre = new HashMap<>();
        nombreBibliothèques++;
    }

    public Bibliothèque(String nom) {
        this.nom = nom;
        this.adresse = emplacementsPossibles[new Random().nextInt(emplacementsPossibles.length)];
        this.capaciteMax = 1000;
        this.livresParGenre = new HashMap<>();
        nombreBibliothèques++;
    }

    public void ajouterLivre(String genre) {
        livresParGenre.put(genre, livresParGenre.getOrDefault(genre, 0) + 1);
    }

    public void retirerLivre(String genre) {
        if (livresParGenre.containsKey(genre) && livresParGenre.get(genre) > 0) {
            livresParGenre.put(genre, livresParGenre.get(genre) - 1);
        }
    }

    public int getNombreLivres(String genre) {
        return livresParGenre.getOrDefault(genre, 0);
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public static int getNombreBibliothèques() {
        return nombreBibliothèques;
    }

}
