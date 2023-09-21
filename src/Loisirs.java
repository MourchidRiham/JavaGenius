public abstract class Loisirs {
    private String nom;
    private String description;

    public Loisirs(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    protected Loisirs() {
    }


    public void afficher() {
        System.out.println("Loisir : Loisirs.Sport");
        System.out.println("Nom : " + getNom());
        System.out.println("Description : " + getDescription());
    }


    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public static class Sport extends Loisirs {
        private String nom;
        private String description;
        private String discipline;

        public Sport (){

        }

        public Sport(String nom, String description, String discipline) {
            this.nom = nom;
            this.description = description;
            this.discipline = discipline;
        }


        public String getNom() {
            return nom;
        }


        public String getDescription() {
            return description;
        }

        public String getDiscipline() {
            return discipline;
        }
        @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Sport");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Discipline : " + discipline);
        }
    }

    public static class Musique extends Loisirs {
        private String nom;
        private String description;
        private String instrument;

        public Musique(String nom, String description, String instrument) {
            this.nom = nom;
            this.description = description;
            this.instrument = instrument;
        }
        public Musique (){

        }
        public String getNom() {
            return nom;
        }
        public String getDescription() {
            return description;
        }
        public String getInstrument() {
            return instrument;
        }
       @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Musique");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Instrument : " + getInstrument());
        }
        }

    public static class Lecture extends Loisirs {
        private String nom;
        private String description;
        private String typeDeLecture;

        public Lecture (){

        }

        public Lecture(String nom, String description, String typeDeLecture) {
            this.nom = nom;
            this.description = description;
            this.typeDeLecture = typeDeLecture;
        }


        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }

        public String getTypeDeLecture() {
            return typeDeLecture;
        }

       @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Lecture");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Type de lecture : " + getTypeDeLecture());
        }
    }

    public static class Cuisine extends Loisirs {
        private String nom;
        private String description;
        private String typeDeCuisine;


        public Cuisine(String nom, String description, String typeDeCuisine) {
            this.nom = nom;
            this.description = description;
            this.typeDeCuisine = typeDeCuisine;
        }

        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }

        public String getTypeDeCuisine() {
            return typeDeCuisine;
        }

        @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Cuisine");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Type de cuisine : " + getTypeDeCuisine());
        }
    }

    public static class Voyage extends Loisirs {
        private String nom;
        private String description;
        private String typeDeVoyage;

        public Voyage(String nom, String description, String typeDeVoyage) {
            this.nom = nom;
            this.description = description;
            this.typeDeVoyage = typeDeVoyage;
        }

        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }
        public String getTypeDeVoyage() {
            return typeDeVoyage;
        }

        @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Voyage");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Type de voyage : " + getTypeDeVoyage());
        }
    }

    // Classe concrète Loisirs.Art qui hérite de Loisirs
    public static class Art extends Loisirs {
        private String nom;
        private String description;
        private String formeDart;

        public Art(String nom, String description, String formeDart) {
            this.nom = nom;
            this.description = description;
            this.formeDart = formeDart;
        }

        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }
        public String getFormeDart() {
            return formeDart;
        }

        @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Art");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Forme d'art : " + getFormeDart());
        }
    }

    public static class Jeux extends Loisirs {

        private String nom;
        private String description;
        private String typeDeJeux;

        public Jeux(String nom, String description, String typeDeJeux) {
            this.nom = nom;
            this.description = description;
            this.typeDeJeux = typeDeJeux;
        }

        public String getDescription() {
            return description;
        }

        public String getNom() {
            return nom;
        }
        public String getTypeDeJeux() {
            return typeDeJeux;
        }

        @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Jeux");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Type de jeux : " + getTypeDeJeux());
        }
    }

    public static class Dance extends Loisirs {
        private String nom;
        private String description;
        private String styleDeDanse;

        public Dance(String nom, String description, String styleDeDanse) {
            this.nom = nom;
            this.description = description;
            this.styleDeDanse = styleDeDanse;
        }

        public String getNom() {
            return nom;
        }


        public String getDescription() {
            return description;
        }
        public String getStyleDeDanse() {
            return styleDeDanse;
        }

        @Override
        public void afficher() {
            System.out.println("Loisir : Danse");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Style de danse : " + getStyleDeDanse());
        }
    }

    // Classe concrète Loisirs.Jardinage qui hérite de Loisirs
    public static class Jardinage extends Loisirs {
        private String nom;
        private String description;
        private String typeDeJardinage;

        public Jardinage(String nom, String description, String typeDeJardinage) {
            this.nom = nom;
            this.description = description;
            this.typeDeJardinage = typeDeJardinage;
        }

        // Getter pour le type de jardinage
        public String getTypeDeJardinage() {
            return typeDeJardinage;
        }
        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }


        @Override
        public void afficher() {
            System.out.println("Loisir : Loisirs.Jardinage");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Type de jardinage : " + getTypeDeJardinage());
        }
    }

    public static class Theatre extends Loisirs {
        private String nom;
        private String description;
        private String genreTheatral;

        public Theatre(String nom, String description, String genreTheatral) {
            this.nom = nom;
            this.description = description;
            this.genreTheatral = genreTheatral;
        }

        public String getNom() {
            return nom;
        }

        public String getDescription() {
            return description;
        }
        public String getGenreTheatral() {
            return genreTheatral;
        }

        @Override
        public void afficher() {
            System.out.println("Loisir : Théâtre");
            System.out.println("Nom : " + getNom());
            System.out.println("Description : " + getDescription());
            System.out.println("Genre théâtral : " + getGenreTheatral());
        }
    }
}