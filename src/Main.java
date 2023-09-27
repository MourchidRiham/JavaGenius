import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Loisirs.Musique musique = new Loisirs.Musique("Science-fiction", "Lire de la science-fiction", "Science-fiction");
        Loisirs.Lecture lecture = new Loisirs.Lecture("Science-fiction", "Lire de la science-fiction", "Science-fiction");
        Loisirs.Cuisine cuisine = new Loisirs.Cuisine("Cuisine italienne", "Cuisiner des plats italiens", "Italienne");
        Loisirs.Voyage voyage = new Loisirs.Voyage("Voyage en Europe", "Voyager en Europe", "Tourisme");
        Loisirs.Art art = new Loisirs.Art("Peinture à l'huile", "Peindre des paysages à l'huile", "Peinture à l'huile");
        Loisirs.Jeux jeux = new Loisirs.Jeux("Échecs", "Jouer aux échecs", "Échecs");
        Loisirs.Dance dance = new Loisirs.Dance("Salsa", "Danser la salsa", "Salsa");
        Loisirs.Jardinage jardinage = new Loisirs.Jardinage("Jardinage biologique", "Jardiner en utilisant des méthodes biologiques", "Biologique");
        Loisirs.Theatre theatre = new Loisirs.Theatre("Comédie", "Participer à des pièces de comédie", "Comédie");


        Specialite DeveloppementLogiciel = new Specialite.DeveloppementLogiciel();
        Specialite GénieLogiciel  = new Specialite.GénieLogiciel();
        Specialite SécuritéInformatique  = new Specialite.SécuritéInformatique();
        Specialite IA  = new Specialite.IA();
        Specialite CloudComputing  = new Specialite.CloudComputing();
        Specialite Réseaux  = new Specialite.Réseaux();
        Specialite BigData  = new Specialite.BigData();
        Specialite FrontEnd = new Specialite.FrontEnd();
        Specialite RealiteVirtuelle = new Specialite.RealiteVirtuelle();
        Specialite SIG = new Specialite.SIG();
        Specialite informatiqueMedicale = new Specialite.informatiqueMedicale();
        Specialite bioInformatique = new Specialite.bioInformatique();





        Personne[] personnes = new Personne[100];
            int nombrePersonnes = 0;

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Menu Principal :");
                System.out.println("1. Ajouter une personne");
                System.out.println("2. Afficher les personnes");
                System.out.println("3. Modifier une personne");
                System.out.println("4. Supprimer une personne");
                System.out.println("5. afficher Loisirs");
                System.out.println("6. afficher Les informations des specilites");
                System.out.println("7. Quitter");
                System.out.print("Choix : ");
                int choixPrincipal = scanner.nextInt();

                int choix = 0;
                switch (choixPrincipal) {
                    case 1:
                        System.out.println("Menu Ajout de Personne :");
                        System.out.println("1. Ajouter un Professeur");
                        System.out.println("2. Ajouter un Etudiant");
                        System.out.println("3. Ajouter un Stagiere");
                        System.out.print("Choix : ");
                        int choixAjout = scanner.nextInt();
                        scanner.nextLine();

                        switch (choixAjout) {
                            case 1:
                                System.out.print("ID : ");
                                int professeurId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Nom : ");
                                String professeurNom = scanner.nextLine();
                                System.out.print("Prénom : ");
                                String professeurPrenom = scanner.nextLine();
                                System.out.print("Date de naissance (jj/mm/aaaa) : ");
                                String professeurDateNaissance = scanner.nextLine();
                                System.out.print("Téléphone : ");
                                String professeurTel = scanner.nextLine();
                                System.out.print("Email : ");
                                String professeurEmail = scanner.nextLine();
                                System.out.print("Matière : ");
                                String professeurMatiere = scanner.nextLine();

                                personnes[nombrePersonnes] = new Personne.Professeur
                                        (professeurId, professeurNom, professeurPrenom, professeurDateNaissance, professeurTel, professeurEmail, professeurMatiere);
                                nombrePersonnes++;

                                System.out.println("Professeur ajouté avec succès.");
                                break;
                            case 2: // Ajouter un Etudiant
                                System.out.print("ID : ");
                                int etudiantId = scanner.nextInt();
                                scanner.nextLine();  // Pour consommer la nouvelle ligne
                                System.out.print("Nom : ");
                                String etudiantNom = scanner.nextLine();
                                System.out.print("Prénom : ");
                                String etudiantPrenom = scanner.nextLine();
                                System.out.print("Date de naissance (jj/mm/aaaa) : ");
                                String etudiantDateNaissance = scanner.nextLine();
                                System.out.print("Téléphone : ");
                                String etudiantTel = scanner.nextLine();
                                System.out.print("Email : ");
                                String etudiantEmail = scanner.nextLine();
                                System.out.print("Niveau : ");
                                String etudiantNiveau = scanner.nextLine();
                                System.out.print("Filière : ");
                                String etudiantFiliere = scanner.nextLine();

                                // Créer un nouvel étudiant et l'ajouter au tableau
                                personnes[nombrePersonnes] = new Personne.Etudiant(etudiantId, etudiantNom, etudiantPrenom
                                        , etudiantDateNaissance, etudiantTel, etudiantEmail, etudiantNiveau, etudiantFiliere);
                                nombrePersonnes++;

                                System.out.println("Etudiant ajouté avec succès.");
                                break;
                            case 3: // Ajouter un Stagiaire
                                System.out.print("ID : ");
                                int stagiaireId = scanner.nextInt();
                                scanner.nextLine();  // Pour consommer la nouvelle ligne
                                System.out.print("Nom : ");
                                String stagiaireNom = scanner.nextLine();
                                System.out.print("Prénom : ");
                                String stagiairePrenom = scanner.nextLine();
                                System.out.print("Date de naissance (jj/mm/aaaa) : ");
                                String stagiaireDateNaissance = scanner.nextLine();
                                System.out.print("Téléphone : ");
                                String stagiaireTel = scanner.nextLine();
                                System.out.print("Email : ");
                                String stagiaireEmail = scanner.nextLine();
                                System.out.print("Durée de stage : ");
                                String stagiaireDureeStage = scanner.nextLine();

                                personnes[nombrePersonnes] = new Personne.Stagiere(stagiaireId, stagiaireNom,
                                        stagiairePrenom, stagiaireDateNaissance, stagiaireTel, stagiaireEmail,
                                        stagiaireDureeStage);
                                nombrePersonnes++;

                                System.out.println("Stagiaire ajouté avec succès.");
                                break;
                            default:
                                System.out.println("Choix invalide.");
                                break;
                        }


                        break;
                    case 2:
                        System.out.println("Liste des Personnes :");
                        for (int i = 0; i < nombrePersonnes; i++) {
                            personnes[i].afficher();
                        }
                        break;
                    case 3:
                        System.out.println("Modifier une Personne :");
                        System.out.print("ID de la personne à modifier : ");
                        int idAModifier = scanner.nextInt();
                        scanner.nextLine();


                        int indexAModifier = -1;
                        for (int i = 0; i < nombrePersonnes; i++) {
                            if (personnes[i].getId() == idAModifier) {
                                indexAModifier = i;
                                break;
                            }
                        }

                        if (indexAModifier != -1) {
                            // Personne trouvée, afficher les détails actuels
                            personnes[indexAModifier].afficher();
                            System.out.println("Menu de Modification :");
                            System.out.println("1. Modifier le téléphone");
                            System.out.println("2. Modifier l'email");
                            System.out.println("3. Annuler la modification");
                            System.out.print("Choix : ");
                            int choixModification = scanner.nextInt();
                            scanner.nextLine();

                            switch (choixModification) {

                                case 1:
                                    System.out.print("Nouveau téléphone : ");
                                    String nouveauTel = scanner.nextLine();
                                    personnes[indexAModifier].setTel(nouveauTel);
                                    break;
                                case 2:
                                    System.out.print("Nouvel email : ");
                                    String nouveauEmail = scanner.nextLine();
                                    personnes[indexAModifier].setEmail(nouveauEmail);
                                    break;
                                case 3:
                                    System.out.println("Annulation de la modification.");
                                    break;
                                default:
                                    System.out.println("Choix invalide");
                            }
                        } else {
                            System.out.println("Aucune personne trouvée avec cet ID.");
                        }
                        break;
                    case 4:
                        System.out.println("Supprimer une Personne :");
                        System.out.print("ID de la personne à supprimer : ");
                        int idASupprimer = scanner.nextInt();
                        scanner.nextLine();

                        boolean personneTrouvee = false;
                        for (int i = 0; i < nombrePersonnes; i++) {
                            if (personnes[i].getId() == idASupprimer) {
                                for (int j = i; j < nombrePersonnes - 1; j++) {
                                    personnes[j] = personnes[j + 1];
                                }
                                nombrePersonnes--;
                                personneTrouvee = true;
                                System.out.println("Personne supprimée avec succès.");
                                break;
                            }
                        }

                        if (!personneTrouvee) {
                            System.out.println("Aucune personne trouvée avec cet ID.");
                        }
                        break;
                    case 5:
                        System.out.println("Choisissez un loisir à afficher :");
                        System.out.println("1. Musique");
                        System.out.println("2. Lecture");
                        System.out.println("3. Cuisine");
                        System.out.println("4. Voyage");
                        System.out.println("5. Art");
                        System.out.println("6. Jeux");
                        System.out.println("7. Danse");
                        System.out.println("8. Jardinage");
                        System.out.println("9. Théâtre");

                        scanner = new Scanner(System.in);
                        choix = scanner.nextInt();

                        switch (choix) {
                            case 1:
                                musique.afficher();
                                break;
                            case 2:
                                lecture.afficher();
                                break;
                            case 3:
                                cuisine.afficher();
                                break;
                            case 4:
                                voyage.afficher();
                                break;
                            case 5:
                                art.afficher();
                                break;
                            case 6:
                                jeux.afficher();
                                break;
                            case 7:
                                dance.afficher();
                                break;
                            case 8:
                                jardinage.afficher();
                                break;
                            case 9:
                                theatre.afficher();
                                break;
                            default:
                                System.out.println("Choix invalide");
                                break;
                        }
                    case 6:

                        System.out.println("Choisissez une specialites à afficher :");
                        System.out.println("1. Developpement logiciel ");
                        System.out.println("2. Génie Logiciel ");
                        System.out.println("3. Sécurité Informatique ");
                        System.out.println("4 Intelligence Artificiel ");
                        System.out.println("5 Computing Cloud ");
                        System.out.println("6 Réseaux et sécurité des réseaux ");
                        System.out.println("7 Analyse de données et Big Data ");
                        System.out.println("8 Front-End ");
                        System.out.println("9 Réalité Virtuelle ");
                        System.out.println("10 Systèmes d'information géographique");
                        System.out.println("11 informatique medicale");
                        System.out.println("12 bio Informatique");
                        System.out.println("Choix :");


                        scanner = new Scanner(System.in);
                        choix = scanner.nextInt();

                        if (choix == 1) {

                            ((Specialite.Matiere) DeveloppementLogiciel).enseigner();
                            ((Specialite.Cursus) DeveloppementLogiciel).programme();
                            ((Specialite.debouchee) DeveloppementLogiciel).metier();
                        }
                        if (choix == 2) {
                            ((Specialite.Matiere) GénieLogiciel).enseigner();
                            ((Specialite.Cursus) GénieLogiciel).programme();
                            ((Specialite.debouchee) GénieLogiciel).metier();


                        }
                        if (choix == 3) {
                        ((Specialite.Matiere)SécuritéInformatique).enseigner();
                        ((Specialite.Cursus) SécuritéInformatique).programme();
                        ((Specialite.debouchee) SécuritéInformatique).metier();

                        }
                        if (choix == 4) {
                            ((Specialite.Matiere) IA).enseigner();
                            ((Specialite.Cursus) IA).programme();
                            ((Specialite.debouchee) IA).metier();

                        }
                        if (choix == 5) {
                            ((Specialite.Matiere)CloudComputing ).enseigner();
                            ((Specialite.Cursus) CloudComputing).programme();
                            ((Specialite.debouchee) CloudComputing).metier();

                        }
                        if (choix == 6) {
                            ((Specialite.Matiere)Réseaux).enseigner();
                            ((Specialite.Cursus) Réseaux).programme();
                            ((Specialite.debouchee) Réseaux).metier();

                        }
                        if (choix == 7) {
                            ((Specialite.Matiere)BigData).enseigner();
                            ((Specialite.Cursus) BigData).programme();
                            ((Specialite.debouchee) BigData).metier();

                        }
                        if (choix == 8) {
                            ((Specialite.Matiere)FrontEnd).enseigner();
                            ((Specialite.Cursus) FrontEnd).programme();
                            ((Specialite.debouchee) FrontEnd).metier();

                        }
                        if (choix == 9) {
                            ((Specialite.Matiere) RealiteVirtuelle).enseigner();
                            ((Specialite.Cursus) RealiteVirtuelle).programme();
                            ((Specialite.debouchee) RealiteVirtuelle).metier();

                        }
                        if (choix == 10) {
                            ((Specialite.Matiere) SIG).enseigner();
                            ((Specialite.Cursus) SIG).programme();
                            ((Specialite.debouchee) SIG).metier();

                        }
                        if (choix == 11) {
                            ((Specialite.Matiere) informatiqueMedicale).enseigner();
                            ((Specialite.Cursus) informatiqueMedicale).programme();
                            ((Specialite.debouchee) informatiqueMedicale).metier();

                        }
                        if (choix == 12) {
                            ((Specialite.Matiere) bioInformatique).enseigner();
                            ((Specialite.Cursus) bioInformatique).programme();
                            ((Specialite.debouchee) bioInformatique).metier();

                        }
                        else {
                    System.out.println("Choix invalide");
                }
            }


    }
    }
}