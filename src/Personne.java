import java.util.Date;

public abstract class Personne {
    private static int Id ;
    private static String nom;
    private static String prenom;
    private static Date dateNaissance;
    private static String tel ;
    private static String email ;
    private static String adresse ;

    public Personne(int id, String nom, String prenom) {
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public int getId() {
        return Id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }


    public void afficher() {

    }

    public void setTel(String nouveauTel) {
    }

    public void setAdresse(String nouvelleAdresse) {
    }

    public void setEmail(String nouvelEmail) {
    }

    public static class Professeur extends Personne{

     private String matiere ;


        public Professeur(int Id ,String nom, String prenom, Date dateNaissance) {
            super(Id , nom , prenom);
        }

        public Professeur(int Id ,String nom, String prenom,String tel ,String email ) {
            super(Id , nom , prenom);;
        }
        public Professeur(int Id ,String nom, String prenom,String matiere ) {
            super(Id , nom , prenom);
            this.matiere= matiere;
        }


        // Getters et setters


        public String getMatiere() {
            return matiere;
        }

        @Override
        public void afficher() {
            System.out.println("ID : " + Id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Adresse : " + adresse);
            System.out.println("Matiere : " + matiere);
        }
    }

    public static class Etudiant extends Personne{

        private String niveau ;


        public Etudiant(int Id ,String nom, String prenom, Date dateNaissance) {
            super(Id , nom , prenom);
        }

        public Etudiant(int Id ,String nom, String prenom,String tel ,String email ) {
            super(Id , nom , prenom);
        }
        public Etudiant(int Id ,String nom, String prenom,String niveau) {
            super(Id , nom , prenom);
            this.niveau= niveau;
        }


        public String getNiveau() {
            return niveau;
        }

        @Override
        public void afficher() {
            System.out.println("ID : " + Id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Adresse : " + adresse);
            System.out.println("Niveau : " + niveau);
        }
    }

    public static class Stagiere extends Personne {

        private String dureeStage ;




        public Stagiere(int Id , String nom, String prenom, Date dateNaissance, String adresse) {
            super(Id , nom , prenom);
        }

        public Stagiere(int Id ,String nom, String prenom,String tel ,String email ) {
            super(Id , nom , prenom);
        }
        public Stagiere(int Id ,String nom, String prenom , String dureeStage ) {
            super(Id , nom , prenom );
            this.dureeStage= dureeStage ;

        }


        public String getDureeStage () {
            return dureeStage;
        }

        public void afficher() {
            System.out.println("ID : " + Id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Adresse : " + adresse);
            System.out.println("Duree de Stage : " + dureeStage);
        }

    }
}


