
import java.util.Date;

public class Repas {
    private String menu;
    private Date date;

    public Repas(String menu, Date date) {
        this.menu = menu;
        this.date = date;
    }

    public String getMenu() {
        return menu;
    }

    public Date getDate() {
        return date;
    }

    public void add(Repas repas) {
    }
}

