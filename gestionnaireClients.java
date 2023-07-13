import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ClientOperations {
    void ajouterClient(Client client);
    void afficherClients();
    void modifierClient(int id);
    void supprimerClient(int id);
    void enregistrerClients();

    void commander(Client client, String menu);

    void afficherCommandes();
}

interface Operations {
    void commander(Client client, String menu);

    default void afficherCommandes() {
        afficherCommandes(null);
    }

    void afficherCommandes(Client client);
}

public abstract class gestionnaireClients implements ClientOperations, Operations {
    private List<Client> clients;
    private Scanner scanner;
    private int choix;
    private String nom;
    private String prenom;
    private int tel;
    private int idModification;
    private int idSuppression;
    private String Commander;
    private int idCommande;
    private int idAffichage;
    private int idClient1;
    private int idClient2;
    private int idClient3;
    private int idClient4;
    private int idClient5;
    private String nomClient1;
    private String nomClient2;
    private String nomClient3;
    private String nomClient4;
    private String nomClient5;

    public gestionnaireClients() {
        clients = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        gestionnaireClients gestionnaire = new gestionnaireClients() {
            @Override
            public void commander(Client client, String menu) {

            }
        };
        gestionnaire.afficherMenu();
    }

    public void afficherMenu() {
        do {
            System.out.println("=== Gestionnaire de clients ===");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher les clients");
            System.out.println("3. Modifier un client");
            System.out.println("4. Supprimer un client");
            System.out.println("5. Enregistrer les clients");
            System.out.println("6. Commander un menu");
            System.out.println("7. Afficher les commandes d'un client");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterClient();
                    break;
                case 2:
                    afficherClients();
                    break;
                case 3:
                    modifierClient();
                    break;
                case 4:
                    supprimerClient();
                    break;
                case 5:
                    enregistrerClients();
                    break;
                case 6:
                    commander();
                    break;
                case 7:
                    afficherCommandes();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

            System.out.println();
        } while (choix != 0);
    }

    public void ajouterClient() {
        System.out.println("=== Ajouter un client ===");
        System.out.print("Nom : ");
        nom = scanner.nextLine();
        System.out.print("Prénom : ");
        prenom = scanner.nextLine();
        System.out.print("Numero de telephone : ");
        tel= scanner.nextInt();

        Client client = new Client(nom, prenom, tel);
        ajouterClient(client);

        System.out.println("Le client a été ajouté avecsuccès !");
    }

    @Override
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    @Override
    public void afficherClients() {
        System.out.println("=== Gestionnaire de clients ===");
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public void modifierClient() {
        System.out.println("=== Modifier un client ===");
        System.out.print("ID du client : ");
        idModification = scanner.nextInt();

        modifierClient(idModification);
    }

    @Override
    public void modifierClient(int id) {
        boolean clientTrouve = false;

        for (Client client : clients) {
            if (client.getId() == id) {

                System.out.print("Nouvel âge : ");
                tel = scanner.nextInt();
                client.setAge(tel);

                clientTrouve = true;
                break;
            }
        }

        if (clientTrouve) {
            System.out.println("Le client a été modifié avec succès !");
        } else {
            System.out.println("Aucun client trouvé avec cet ID.");
        }
    }

    public void supprimerClient() {
        System.out.println("=== Supprimer un client ===");
        System.out.print("ID du client : ");
        idSuppression = scanner.nextInt();

        supprimerClient(idSuppression);
    }

    @Override
    public void supprimerClient(int id) {
        boolean clientTrouve = false;

        for (Client client : clients) {
            if (client.getId() == id) {
                clients.remove(client);
                clientTrouve = true;
                break;
            }
        }

        if (clientTrouve) {
            System.out.println("Le client a été supprimé avec succès !");
        } else {
            System.out.println("Aucun client trouvé avec cet ID.");
        }
    }

    @Override
    public void enregistrerClients() {
        System.out.println("=== Enregistrer les clients ===");
        System.out.println("Les clients ont été enregistrés avec succès !");
    }

    public void commander() {
        System.out.println("=== Commander un menu ===");
        System.out.print("ID du client : ");
        idCommande = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Menu : ");
        Commander = scanner.nextLine();

        for (Client client : clients) {
            if (client.getId() == idCommande) {
                commander(client, Commander);
                break;
            }
        }
    }

    @Override
    public void commander(Client client, String menu) {
        client.setMenu(menu);
        System.out.println("Le menu a été commandé avec succès !");
    }

    @Override
    public void afficherCommandes() {
        System.out.println("=== Afficher les commandes d'un client ===");
        System.out.print("ID du client : ");
        idAffichage = scanner.nextInt();

        for (Client client : clients) {
            if (client.getId() == idAffichage) {
                afficherCommandes(client);
                break;
            }
        }
    }

    @Override
    public void afficherCommandes(Client client) {
        System.out.println("Commandes de " + client.getNom() + " " + client.getPrenom() + " :");
        System.out.println("Menu : " + client.getMenu());
    }
}

class Client {
    private static int compteurId = 0;
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String menu;

    public Client(String nom, String prenom, int age) {
        this.id = ++compteurId;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.menu = "";
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
}
