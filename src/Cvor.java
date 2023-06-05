import java.util.ArrayList;

public class Cvor {

    protected int id;
    protected ArrayList<Grana> grane;
    protected Cvor roditelj;

    public Cvor(int id) {
        this.id = id;
        this.grane = new ArrayList<Grana>();
    }

    public void ispisiGrane(){
        for (int i = 0; i < grane.size(); i++) {
            System.out.print(grane.get(i).toString());
        }
    }

    public String toString(){
        return this.id + "";
    }
}

