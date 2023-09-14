
import java.util.Date ;
public class Examen {
    private Matière matière;
    private Date date;

    public Examen(Matière matière, Date date) {
        this.matière = matière;
        this.date = date;
    }

    public Matière getMatière() {
        return matière;
    }

    public Date getDate() {
        return date;
    }
}

