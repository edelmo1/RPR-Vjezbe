import java.util.Scanner ;

public class UnosBroja {

    public static void main(String[] args) {

        int x,y;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        x= ulaz.nextInt();
        System.out.println("Unesite drugi broj: ");
        y= ulaz.nextInt();

        System.out.println("Uneseni brojevi su: " + x + " i " + y);
    }
}
