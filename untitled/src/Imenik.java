import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {

    private HashMap<String, TelefonskiBroj> mapa;

    public Imenik() {
        this.mapa = new HashMap<String, TelefonskiBroj>();
    }

    public Imenik(HashMap<String, TelefonskiBroj> mapa) {
        this.mapa = mapa;
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        mapa.put(ime, broj);
    }

    public String dajBroj(String ime) throws NepostojeceIme {

        if (mapa.containsKey(ime) == false) throw new NepostojeceIme("Ime ne postoji");

        return (mapa.get(ime)).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {


        Iterator<Map.Entry<String, TelefonskiBroj>> it = mapa.entrySet().iterator();

        while (it.hasNext() == true) {

            Map.Entry<String, TelefonskiBroj> polje = it.next();
            if (polje.getValue() == broj) return polje.getKey();

        }
        return "";
    }

    public String naSlovo(char s) {

        String povratni = new String();
        Iterator<Map.Entry<String, TelefonskiBroj>> it = mapa.entrySet().iterator();
        int i = 1;
        while (it.hasNext() == true) {

            Map.Entry<String, TelefonskiBroj> polje = it.next();
            if (polje.getKey().charAt(0) == s) {
                povratni = povratni + i + ". " + polje.getKey() + " - ";
                povratni = povratni + polje.getValue().ispisi();
                i++;
            }

        }
        return povratni;
    }
    //Set<String> izGrada(Grad g){} ???????

    // Set<TelefonskiBroj> izGradaBrojevi(Grad g) {} ???????

}
