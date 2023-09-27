public abstract class Personne {
    private static int Id ;
    private static String nom;
    private static String prenom;
    private static String dateNaissance;
    private static String tel ;
    private static String email ;


    public Personne(int id, String nom, String prenom, String dateNaissance, String email) {
    }

    public Personne(int id, String nom, String prenom, String email) {
    }

    public Personne(int professeurId, String professeurNom, String professeurPrenom, String professeurDateNaissance, String professeurEmail, String professeurTel) {
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public int getId() {
        return Id;
    }


    public String getEmail() {
        return email;
    }
    public String setEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }
    public String setTel() {
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


        public Professeur(int Id , String nom, String prenom, String tel , String email, String matiere) {
            super(Id , nom , prenom , tel);
            this.matiere= matiere;
        }
        public Professeur(int Id ,String nom, String prenom,String matiere ) {
            super(Id , nom , prenom, matiere);
            this.matiere= matiere;
        }

        public Professeur(int professeurId, String professeurNom, String professeurPrenom, String professeurDateNaissance, String professeurTel, String professeurEmail, String Matiere) {
            super(professeurId , professeurNom , professeurPrenom , professeurDateNaissance , professeurEmail
            ,professeurTel);
            this.matiere= matiere;
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
            System.out.println("Specialite.Matiere : " + matiere);
        }
    }

    public static class Etudiant extends Personne{

        private String niveau ;
        private String filiere ;


        public Etudiant(int Id ,String nom, String prenom, String dateNaissance) {
            super(Id , nom , prenom, dateNaissance);
        }

        public Etudiant(int Id ,String nom, String prenom,String tel ,String email ) {
            super(Id , nom , prenom, tel ,email);
        }
        public Etudiant(int Id ,String nom, String prenom,String tel ,String email, String filiere, String niveau){
            super(Id , nom , prenom,tel , email);
            this.filiere = filiere ;
            this.niveau = niveau ;        }

        public Etudiant(int etudiantId, String etudiantNom, String etudiantPrenom, String etudiantDateNaissance, String etudiantTel, String etudiantEmail, String etudiantNiveau, String etudiantFiliere) {
            super(etudiantId , etudiantNom , etudiantPrenom , etudiantDateNaissance , etudiantEmail , etudiantTel);
            this.filiere = filiere ;
            this.niveau = niveau ;
        }


        public String getNiveau() {
            return niveau;
        }
        public String getFiliere(){
            return filiere;
        }

        @Override
        public void afficher() {
            System.out.println("ID : " + Id);
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + dateNaissance);
            System.out.println("Téléphone : " + tel);
            System.out.println("Email : " + email);
            System.out.println("Filiere  : " + filiere);
            System.out.println("Niveau : " + niveau);
        }
    }

    public static class Stagiere extends Personne {

        private String dureeStage ;

        public Stagiere(int Id , String nom, String prenom , String tel , String email, String stagiaireEmail, String stagiaireDureeStage) {
            super(Id , nom , prenom, tel, email);

        }

        public Stagiere(int Id ,String nom, String prenom , String tel , String email , String dureeStage) {
            super(Id , nom , prenom, tel, email);
            this.dureeStage = dureeStage ;
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
            System.out.println("Duree de Stage : " + dureeStage);
        }

    }
}


