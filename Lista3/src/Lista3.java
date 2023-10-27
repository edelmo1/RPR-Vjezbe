import java.util.ArrayList;
import java.util.List ;
import java.util.Scanner;
public class Lista3 {


    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Unesite elemente liste:");
        for (; ; ) {

            if (ulaz.hasNext("stop")) break;
            else if (ulaz.hasNextInt()) lista.add(ulaz.nextInt());
            else {String s=ulaz.nextLine();}
        }

        int min = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (min > lista.get(i)) min = lista.get(i);       //minimum
        }


        int max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (max < lista.get(i)) max = lista.get(i);       //maximum
        }

        double mean = 0;
        for (int i = 0; i < lista.size(); i++) mean = mean + lista.get(i);   //srednja vrijednost

        mean = mean / lista.size();

        double st = 0;

        for (int i = 0; i < lista.size(); i++) {

            st = st + Math.pow((lista.get(i) - mean), 2);

        }

        st = st / lista.size();
        st = Math.sqrt(st);

        System.out.println("Minimum je " + min + ", maksimum " + max + ", srednja vrijednost iznosi " + mean + ", a standardna devijacija " + st);


    }
}