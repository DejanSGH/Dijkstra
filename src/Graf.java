import java.util.ArrayList;
import java.util.Arrays;

public class Graf {

    private int brojCvorova;
    private Cvor[] cvorovi;
    private Cvor[] poseceni;
    private ArrayList<Grana> grane;


    private int tezinaMst;

    public Graf(int brojCvorova) {
        this.cvorovi = new Cvor[brojCvorova];
        this.grane = new ArrayList<Grana>();
        this.brojCvorova = brojCvorova;
        for (int i = 0; i < brojCvorova; i++) {
            this.cvorovi[i] = new Cvor(i);
        }
    }

    public void dodajGranu(int od, int ka, int tezina) {
        if ((od >= brojCvorova || od < 0) || (ka >= brojCvorova || ka < 0)) {
            //System.out.println("Nepostojeci cvor u grafu!");
            return;
        }
        Grana g = new Grana(cvorovi[od], cvorovi[ka], tezina);
        grane.add(g);
        cvorovi[od].grane.add(g);

    }


    public void ispisiGrane(){
        for (int i = 0; i < grane.size(); i++) {
            System.out.print(grane.get(i).tezina + " ");
        }
    }

    public String toString() {
        return Arrays.toString(cvorovi);
    }

}