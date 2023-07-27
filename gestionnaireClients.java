import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

interface ClientOperations {
    void ajouterClient();

    void ajouterClient(Client client);
    void afficherClients();
    void modifierClient(int id);
    void supprimerClient(int id);
    void enregistrerClients();

}

interface Operations {
    void commander(Client client, String menu);

    void listedescommandes(Client client);

}

public abstract class gestionnaireClients implements ClientOperations, Operations {
    private final List<Client> clients;
    private final Scanner scanner;
    private int choix;
    private String nom;
    private String prenom;
    private int Age ;
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
    private Client client;


    public gestionnaireClients() {
        clients = new ArrayList<>();
        scanner = new Scanner(in);
    }

    public static void main(String[] args) {
        gestionnaireClients gestionnaire = new gestionnaireClients() {
            @Override
            public void commander(Client client, String menu) {

            }

            @Override
            public void listedescommandes(Client client) {

            }

        };
        gestionnaire.afficherMenu();
    }

    public void afficherMenu() {
        do {
            out.println("=== Gestionnaire de clients ===");
            out.println("1. Ajouter un client");
            out.println("2. Afficher les clients");
            out.println("3. Modifier un client");
            out.println("4. Supprimer un client");
            out.println("5. Enregistrer les clients");
            out.println("6. Commander un menu");
            out.println("7. Afficher les commandes d'un client");
            out.println("0. Quitter");
            out.print("Votre choix : ");

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
                    listedescomandes() ;
                    break;
                case 0:
                    out.println("Au revoir !");
                    break;
                default:
                    out.println("Choix invalide. Veuillez réessayer.");
            }

            out.println();
        } while (choix != 0);
    }
    public void ajouterClient() {
        out.println("=== Ajouter un client ===");
        out.print("Nom : ");
        nom = scanner.nextLine();
        out.print("Prénom : ");
        prenom = scanner.nextLine();
        out.print("Age : ");
        Age = Integer.parseInt(scanner.nextLine());
        out.print("Numero de telephone : ");
        tel= scanner.nextInt();

        Client client = new Client(nom, prenom, tel , Age);
        ajouterClient(client);

        out.println("Le client a été ajouté avec succès !");
    }

    @Override
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    @Override
    public void afficherClients() {
        out.println("=== Gestionnaire de clients ===");
        for (Client client : clients) {
            out.println("Nom: " + client.getNom());
            out.println("Prénom: " + client.getPrenom());
            out.println("Âge: " + client.getAge());
            out.println("Téléphone: " + client.getTel());
            out.println("Menu: " + client.getMenu());
            out.println("-------------------------");
        }
    }

    public void modifierClient() {
        out.println("=== Modifier un client ===");
        out.print("ID du client : ");
        idModification = scanner.nextInt();

        modifierClient(idModification);
    }

    @Override
    public void modifierClient(int id) {
        boolean clientTrouve = false;

        for (Client client : clients) {
            if (client.getId() == id) {

                out.print("Nouveau numero de telephone : ");
                tel = scanner.nextInt();
                client.setTel(tel);

                clientTrouve = true;
                break;
            }
        }

        if (clientTrouve) {
            out.println("Le client a été modifié avec succès !");
        } else {
            out.println("Aucun client trouvé avec cet ID.");
        }
    }

    public void supprimerClient() {
        out.println("=== Supprimer un client ===");
        out.print("ID du client : ");
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
            out.println("Le client a été supprimé avec succès !");
        } else {
            out.println("Aucun client trouvé avec cet ID.");
        }
    }

    @Override
    public void enregistrerClients() {
        out.println("=== Enregistrer les clients ===");
        out.println("Les clients ont été enregistrés avec succès !");
    }

    public void commander() {
        out.println("=== Commander un menu ===");
        out.print("ID du client : ");
        idCommande = scanner.nextInt();
        scanner.nextLine();

        out.print("Menu : ");
        Commander = scanner.nextLine();

        for (Client client : clients)
            if (client.getId() == idCommande) {
                commander(client, Commander);
                break;
            }
    }

    @Override
    public void commander(Client client, String menu) {
        client.setMenu(menu);
        out.println("Le menu a été commandé avec succès !");
    }
    public void listedescomandes() {
        out.println("=== Afficher les commandes d'un client ===");
        out.print("ID du client : ");
        idAffichage = scanner.nextInt();

        for (Client client : clients)
            if (client.getId() == idAffichage) {
                listedescomandes();
                break;
            }
           out.println("Commandes de " + client.getNom() + " " + client.getPrenom() + " :");
           out.println("Menu : " + client.getMenu());
    }
    public void listedesCommandes(Client client) {
        out.println("Commandes de " + client.getNom() + " " + client.getPrenom() + " :");
        out.println("Menu : " + client.getMenu());
    }
}

class Client {
    private static int compteurId = 0;
    private final int id;
    private String nom;
    private String prenom;
    private int tel;
    private int Age;
    private String menu;

    public Client(String nom, String prenom, int tel, int age) {
        this.id = ++compteurId;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.Age = Age;
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
    }

    public void setAge(int tel) {
        this.tel = tel;
    }

    public int getAge() {
        return Age;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        String s = "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + " ,Age " + Age + ", Numero de telephone: " + tel;
        return s;
    }
}



