import java.util.ArrayList;
import java.util.List;


public class HundDagis {
    private List<Hund> hundar = new ArrayList<>();

    public void taEmot(Hund hund) {
        hundar.add(hund);
    }

    public void ropaUpp() {
        for (Hund h : hundar) {
            System.out.println(h.getNamn());
        }
    }

}
