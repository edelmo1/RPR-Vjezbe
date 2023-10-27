public class Main {

public static void main(String[] args) {

Korisnik korisnik= new Korisnik("Edi", "Djelmo");
Racun racun= new Racun(19316,korisnik);
korisnik.dodajRacun(racun);

System.out.println("Pocetni racun iznosi "+racun.dajStanjeRacuna());
racun.izvrsiUplatu(250);
System.out.println("Nakon uplate iznosi "+racun.dajStanjeRacuna());




}

}