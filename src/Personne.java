import java.util.Date;

public abstract class Personne {
    private int Id ;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String tel ;
    private String email ;
    private String adresse ;



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
        private int Id ;
        private String nom;
        private String prenom;
        private Date dateNaissance;
        private String tel ;
        private String email ;
        private String adresse ;
        private String matiere ;

        public Professeur(){

        }


        public Professeur(int Id ,String nom, String prenom, Date dateNaissance) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
        }

        public Professeur(int Id ,String nom, String prenom,String tel ,String email ) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.tel= tel ;
            this.email= email ;
        }
        public Professeur(int Id ,String nom, String prenom,String matiere ) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.matiere= matiere;
        }


        // Getters et setters
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
        private int Id ;
        private String nom;
        private String prenom;
        private Date dateNaissance;
        private String tel ;
        private String email ;
        private String adresse ;
        private String niveau ;

        public Etudiant(int etudiantId, String etudiantNom, String etudiantPrenom, Date etudiantDateNaissance, String etudiantNiveau){

        }


        public Etudiant(int Id ,String nom, String prenom, Date dateNaissance) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
        }

        public Etudiant(int Id ,String nom, String prenom,String tel ,String email ) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.tel= tel ;
            this.email= email ;
        }
        public Etudiant(int Id ,String nom, String prenom,String niveau) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.niveau= niveau;
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
        private int Id ;
        private String nom;
        private String prenom;
        private Date dateNaissance;
        private String tel ;
        private String email ;
        private String adresse ;
        private String dureeStage ;




        public Stagiere(int Id , String nom, String prenom, Date dateNaissance, String adresse) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
            this.adresse = adresse;
        }

        public Stagiere(int Id ,String nom, String prenom,String tel ,String email ) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.tel= tel ;
            this.email= email ;
        }
        public Stagiere(int Id ,String nom, String prenom , String dureeStage ) {
            this.Id = Id ;
            this.nom = nom;
            this.prenom = prenom;
            this.dureeStage= dureeStage ;

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


