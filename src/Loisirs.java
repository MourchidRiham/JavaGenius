public abstract class Loisirs {
    private static String nom;
    private static String description;

    public Loisirs(String nom, String description) {
    }


    public void afficher() {

    }


    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public class Sport extends Loisirs {


        private String discipline;

        public Sport (){
            super(nom, description);
        }

        public Sport(String nom, String description, String discipline) {
            super(nom, description);
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

        private String instrument;

        public Musique(String nom, String description, String instrument) {
            super(nom, description);
            this.instrument = instrument;
        }
        public Musique (){
            super(nom, description);
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

        private String typeDeLecture;

        public Lecture (){
            super(nom, description);
      }

        public Lecture(String nom, String description, String typeDeLecture) {
            super(nom, description);
            this.typeDeLecture = typeDeLecture;
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

        private String typeDeCuisine;


        public Cuisine(String nom, String description, String typeDeCuisine) {
            super(nom, description);
            this.typeDeCuisine = typeDeCuisine;
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

        private String typeDeVoyage;

        public Voyage(String nom, String description, String typeDeVoyage) {
            super(nom, description);
            this.typeDeVoyage = typeDeVoyage;
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


    public static class Art extends Loisirs {

        private String formeDart;

        public Art(String nom, String description, String formeDart) {
            super(nom, description);
            this.formeDart = formeDart;
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


        private String typeDeJeux;

        public Jeux(String nom, String description, String typeDeJeux) {
            super(nom, description);
            this.typeDeJeux = typeDeJeux;
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

        private String styleDeDanse;

        public Dance(String nom, String description, String styleDeDanse) {
            super(nom, description);
            this.styleDeDanse = styleDeDanse;
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


    public static class Jardinage extends Loisirs {
        private String nom;
        private String description;
        private String typeDeJardinage;

        public Jardinage(String nom, String description, String typeDeJardinage) {
            super(nom, description);
            this.typeDeJardinage = typeDeJardinage;
        }


        public String getTypeDeJardinage() {
            return typeDeJardinage;
        }

        public void setTypeDeJardinage(String typeDeJardinage) {
            this.typeDeJardinage = typeDeJardinage;
        }


        public void setDescription(String description) {
            this.description = description;
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

        private String genreTheatral;

        public Theatre(String nom, String description, String genreTheatral) {
            super(nom, description);
            this.genreTheatral = genreTheatral;
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