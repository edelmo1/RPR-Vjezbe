import java.util.HashMap;

public class Program {

public static void main(String[] args) throws NepostojeceIme {

 Imenik imenik = new Imenik();


 TelefonskiBroj broj= new MobilniBroj(62 , " 526 767");
imenik.dodaj("Edi Djelmo" , broj);

    broj= new MobilniBroj(61 , " 387 843");
    imenik.dodaj("Jasmin Djelmo" , broj);

    broj= new MobilniBroj(61 , " 303 764");
    imenik.dodaj("Amra Djelmo" , broj);

System.out.println(imenik.dajBroj("Jasmin Djelmo"));
System.out.println(imenik.dajIme(broj));

try{

    System.out.println(imenik.dajBroj("Nepoznatic"));
}
catch(NepostojeceIme e) {
   System.out.println(e.getMessage());
}




}
}
