public abstract class Specialite {


    public void programme() {

    }

    public void metier() {

    }

    public void enseigner() {

    }

    public static interface Matiere {
        void enseigner ();
    }

    public static interface Cursus {
        void programme ();
    }

    public static interface debouchee {
        void metier ();
        }

    public static class DeveloppementLogiciel extends Specialite implements Matiere, Cursus, debouchee {
        public void programme() {
            System.out.println("La duree;");
            System.out.println(" Généralement de 3 à 5 ans, selon le niveau d'études (Licence, Master, Doctor");

        }

        public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Développeur logiciel\n" +
                    "Ingénieur logiciel\n" +
                    "Analyste de données\n" +
                    "Architecte logiciel\n" +
                    "Chef de projet informatique ");
        }



        public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Programmation\n" +
                    "Conception logicielle\n" +
                    "Bases de données\n" +
                    "Développement web\n" +
                    "Specialite.Réseaux informatiques\n" +
                    "Gestion de projets\n" +
                    "Sécurité informatique\n" +
                    "Intelligence artificielle\n" +
                    "Systèmes d'exploitat"
            );

        }
    }

    public static class  GénieLogiciel extends Specialite implements Matiere, Cursus, debouchee {
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" Bachelor en génie logiciel : 3 à 4 ans.\n" +
                    "Master en génie logiciel : 1 à 2 ans supplémentaires (environ 5 à 6 ans au total).\n" +
                    "Doctorat en génie logiciel : 3 à 5 ans après le master (environ 8 à 11 ans au total).");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Programmation informatique\n" +
                    "Algorithmes et structures de données\n" +
                    "Conception de logiciels\n" +
                    "Développement web\n" +
                    "Bases de données\n" +
                    "Systèmes d'exploitation\n" +
                    "Specialite.Réseaux informatiques\n" +
                    "Gestion de projets informatiques\n" +
                    "Assurance qualité logicie" );
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println(" Algorithmique et structures de données.\n" +
                    "Programmation orientée objet.\n" +
                    "Conception logicielle.\n" +
                    "Développement web.\n" +
                    "Bases de données.\n" +
                    "Architecture logicielle.\n" +
                    "Gestion de projets informatiques.\n" +
                    "Assurance qualité logicielle.");

            }
            }

    public static class SécuritéInformatique extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println("Certificat en Sécurité Informatique : De quelques mois à un an.\n" +
                    "\n" +
                    "Diplôme d'Études Supérieures en Sécurité Informatique : Environ un an.\n" +
                    "\n" +
                    "Licence en Sécurité Informatique : Trois à quatre ans.\n" +
                    "\n" +
                    "Master en Sécurité Informatique : De un à deux ans après la licence.\n" +
                    "\n" +
                    "Doctorat en Sécurité Informatique : Environ trois à cinq ans après la licence, en" +
                    " fonction de la recherche ");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Analyste en sécurité informatique.\n" +
                    "Consultant en sécurité informatique.\n" +
                    "Ingénieur en sécurité informatique.\n" +
                    "Administrateur de la sécurité des systèmes d'information.\n" +
                    "Expert en cryptographie.\n" +
                    "Auditeur en sécurité informatique.\n" +
                    "Analyste en réponse aux incidents de sécurité.\n" +
                    "Spécialiste en tests de pénétration.\n" +
                    "Architecte de sécurité.\n" +
                    "Responsable de la conformité et de la réglementation en matière de sécurité informatiqu");
            }



    public void enseigner() {
            System.out.println("Les matieres de la formation ;");
            System.out.println("Introduction à la sécurité informatique\n" +
                    "Cryptographie\n" +
                    "Sécurité des réseaux\n" +
                    "Sécurité des systèmes d'exploitation\n" +
                    "Gestion des identités et des accès (IAM)\n" +
                    "Sécurité des applications web\n" +
                    "Sécurité des bases de données\n" +
                    "Analyse des vulnérabilités et tests de pénétration\n" +
                    "Sécurité mobile\n" +
                    "Forensics numériques\n" +
                    "Sécurité dans le cloud\n" +
                    "Législation et éthique en sécurité informatique\n" +
                    "Gestion de la sécurité\n" +
                    "Sécurité physique");

            }
            }

    public static class IA extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" Généralement de 3 à 5 ans, selon le niveau d'études (Licence, Master, Doctorat).");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Chercheur en intelligence artificielle\n" +
                    "Ingénieur en intelligence artificielle\n" +
                    "Développeur d'applications d'IA\n" +
                    "Data scientist spécialisé en IA\n" +
                    "Consultant en IA\n" +
                    "Expert en apprentissage automatique");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Apprentissage automatique\n" +
                    "Traitement du langage naturel\n" +
                    "Vision par ordinateur\n" +
                    "Apprentissage en profondeur (Deep Learning)\n" +
                    "Robotique intelligente\n" +
                    "Éthique de l'IA\n" +
                    "Recherche opérationnelle\n" +
                    "Traitement de données massives (Big Data)\n" +
                    "Logique floue");

            }
            }

    public static class CloudComputing extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" La durée peut varier en fonction du programme d'études. Généralement de 1 à 5" +
                    " pour un diplôme de niveau Master ou Bachelor spécialisé en Cloud Computin");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Ingénieur Cloud\n" +
                    "Architecte Cloud\n" +
                    "Administrateur de systèmes Cloud\n" +
                    "Consultant en Cloud Computing\n" +
                    "Développeur d'applications Cloud\n" +
                    "Gestionnaire de services Cloud\n" +
                    "Analyste en sécurité Cloud\n" +
                    "Expert en migration vers le Cloud");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Concepts de Cloud Computing\n" +
                    "Virtualisation\n" +
                    "Infrastructure en tant que service (IaaS)\n" +
                    "Plateformes en tant que service (PaaS)\n" +
                    "Solutions de stockage Cloud\n" +
                    "Sécurité du Cloud\n" +
                    "Gestion des services Cloud\n" +
                    "Intégration continue et déploiement continu (CI/CD) dans le Cloud\n" +
                    "Gestion des coûts et de la performance Cloud");

            }
            }

    public static class Réseaux  extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" La durée peut varier en fonction du programme d'études. Généralement " +
                    "de 1 a 5 ans pour un diplôme" +
                    " de niveau Master ou Bachelor spécialisé en Réseaux et Sécurité des Réseaux.");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Administrateur Réseau\n" +
                    "Ingénieur Réseau\n" +
                    "Administrateur de Sécurité Réseau\n" +
                    "Analyste en Sécurité des Réseaux\n" +
                    "Architecte de Réseaux\n" +
                    "Consultant en Sécurité des Réseaux\n" +
                    "Responsable de la Sécurité des Réseaux\n" +
                    "Spécialiste en Infrastructures Réseau");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Architecture des Réseaux\n" +
                    "Protocoles de Communication\n" +
                    "Sécurité Informatique\n" +
                    "Gestion de Réseaux\n" +
                    "Routage et Commutation\n" +
                    "Pare-feu et Détection d'intrusions\n" +
                    "Cryptographie\n" +
                    "Virtualisation des Réseaux\n" +
                    "Administration Réseau");

            }
            }

    public static class BigData  extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" La durée peut varier en fonction du programme d'études. " +
                    "Généralement de 1 à 3 ans pour un diplôme de niveau Master ou Bachelor s" +
                    "pécialisé en Big Data.\n" +
                    "\n" +
                    "\n") ;

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Analyste Big Data\n" +
                    "Ingénieur en Données\n" +
                    "Architecte Big Data\n" +
                    "Analyste de Business Intelligence\n" +
                    "Data Scientist\n" +
                    "Ingénieur en Traitement de Données\n" +
                    "Analyste de Données\n" +
                    "Consultant en Big Data\n" +
                    "Responsable de la Gestion des Données");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Bases de Données\n" +
                    "Analyse de Données\n" +
                    "Traitement de Données Massives\n" +
                    "Data Mining\n" +
                    "Programmation en Big Data (par exemple, avec Hadoop)\n" +
                    "Machine Learning\n" +
                    "Visualisation de Données\n" +
                    "Sécurité des Données\n" +
                    "Gestion de Projets en Big Data");

            }
            }

    public static class  FrontEnd extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println("La durée peut varier en fonction du programme d'études. " +
                    "Généralement de 1 à 3 ans pour un diplôme de niveau Master ou Bachelor " +
                    "spécialisé en Front-End.\n" +
                    "\n" +
                    "\n ");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Développeur Front-End\n" +
                    "Intégrateur Web\n" +
                    "Designer Web\n" +
                    "Architecte d'Expérience Utilisateur (UX)\n" +
                    "Analyste en Interface Utilisateur (UI)\n" +
                    "Consultant en Interface Utilisateur\n" +
                    "Spécialiste de l'Accessibilité Web\n" +
                    "Responsable de Projet Web");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("HTML5\n" +
                    "CSS3\n" +
                    "JavaScript\n" +
                    "Frameworks Front-End (par exemple, React, Angular, Vue.js)\n" +
                    "Conception Responsivce\n" +
                    "Animation Web\n" +
                    "Performance Web\n" +
                    "Accessibilité Web\n" +
                    "Tests et Débogage Front-End\n" +
                    "Gestion de Version (par exemple, Git)");

            }
            }

    public static class RealiteVirtuelle extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" La durée peut varier en fonction du programme d'études, mais généralement de 1 à 2 ans pour un diplôme spécialisé en Réalité" +
                    " Virtuelle de niveau bachelor. Pour des formations de niveau master, " +
                    "la durée peut être de 3 à 4 ans.");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Développeur de Réalité Virtuelle\n" +
                    "Concepteur d'Expériences de Réalité Virtuelle\n" +
                    "Artiste 3D spécialisé en Réalité Virtuelle\n" +
                    "Ingénieur en Réalité Virtuelle\n" +
                    "Chercheur en Réalité Virtuelle\n" +
                    "Spécialiste en Interaction Homme-Machine pour la Réalité Virtuelle");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Programmation 3D\n" +
                    "Modélisation 3D\n" +
                    "Conception d'Environnements Virtuels\n" +
                    "Interaction en Réalité Virtuelle\n" +
                    "Interfaces Utilisateur pour la Réalité Virtuelle\n" +
                    "Psychologie de la Perception en Réalité Virtuelle\n" +
                    "Rendu Graphique pour la Réalité Virtuelle\n" +
                    "Technologies de Suivi des Mouvements (Tracking)\n" +
                    "Réalité Augmentée\n" +
                    "Applications et Jeux en Réalité Virtuelle");

            }
            }

    public static class SIG  extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" La durée peut varier en fonction du programme d'études, mais généralement de 1 à 2 ans pour un diplôme spécialisé en " +
                    "SIG de niveau bachelor. Pour des formations de niveau master, la durée peut être de" +
                    " 3 à 4 ans.");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Analyste SIG\n" +
                    "Cartographe\n" +
                    "Gestionnaire de bases de données géospatiales\n" +
                    "Consultant en SIG\n" +
                    "Planificateur urbain\n" +
                    "Responsable de la géomatique\n" +
                    "Spécialiste en télédétection\n" +
                    "Géomaticien");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Géographie et cartographie\n" +
                    "Analyse spatiale\n" +
                    "Bases de données géospatiales\n" +
                    "Programmation SIG\n" +
                    "Télédétection et imagerie satellite\n" +
                    "Géostatistique\n" +
                    "Systèmes de positionnement global (GPS)\n" +
                    "Gestion de projet SIG\n" +
                    "Applications sectorielles des SIG (environnement, urbanisme, transport, etc.)");

            }
            }

    public static class informatiqueMedicale extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println(" La durée peut varier en fonction du programme d'études, mais généralement de 2 à 4 ans pour un diplôme spécialisé en Informatique" +
                    " Médicale de niveau bachelor. Pour des formations de niveau master, la durée peut être de " +
                    "3 à 4 ans.");

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Analyste en informatique médicale\n" +
                    "Développeur de logiciels médicaux\n" +
                    "Responsable de l'informatique dans un établissement de santé\n" +
                    "Consultant en informatique médicale\n" +
                    "Intégrateur de systèmes de santé\n" +
                    "Administrateur de bases de données médicales\n" +
                    "Expert en sécurité des données de santé\n" +
                    "Chercheur en bioinformatique");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Bases de données médicales\n" +
                    "Systèmes d'information hospitaliers\n" +
                    "Gestion des données de santé\n" +
                    "Programmation en santé\n" +
                    "Intégration des systèmes de santé\n" +
                    "Sécurité et confidentialité des données de santé\n" +
                    "Télémédecine et e-santé\n" +
                    "Bioinformatique\n" +
                    "Analyse de données médicales");

            }
            }

    public static class bioInformatique extends Specialite implements Matiere , Cursus , debouchee{
    public void programme() {
            System.out.println("La duree;");
            System.out.println("a durée peut varier en fonction du programme d'études, mais généralement" +
                    " de 4 à 5 ans pour un diplôme spécialisé en Bioinformatique de niveau Master. Pour des" +
                    " formations de niveau Bachelor, la durée peut être de 2 à 3 ans.\n" +
                    "\n" +
                    "\n" );

            }

    public void metier() {
            System.out.println("les debouches : " );
            System.out.println("Bioinformaticien(ne)\n" +
                    "Chercheur en génomique\n" +
                    "Analyste de données en biologie\n" +
                    "Développeur de logiciels pour la recherche en biologie\n" +
                    "Expert en traitement de données génomiques\n" +
                    "Consultant en bioinformatique\n" +
                    "Enseignant-chercheur en bioinformatique\n" +
                    "Responsable de l'analyse de données dans des laboratoires de recherche en biologie");
            }



    public void enseigner() {
            System.out.println("Le programme de la formation ;");
            System.out.println("Génomique\n" +
                    "Analyse de données biologiques\n" +
                    "Algorithmes en bioinformatique\n" +
                    "Programmation en bioinformatique\n" +
                    "Bases de données en biologie\n" +
                    "Biostatistiques\n" +
                    "Biologie moléculaire\n" +
                    "Analyse de séquences génétiques\n" +
                    "Outils et logiciels en bioinformatique");

            }
            }
}

