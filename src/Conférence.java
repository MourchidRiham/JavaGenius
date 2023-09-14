import java.util.Date;

public class Conférence {
    private String titre;
    private String conférencier;
    private Date date;

    public Conférence(String titre, String conférencier, Date date) {
        this.titre = titre;
        this.conférencier = conférencier;
        this.date = date;
    }

    // ... autres méthodes pour gérer les participants, les inscriptions, etc.
}

