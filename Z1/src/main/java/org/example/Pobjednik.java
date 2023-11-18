package org.example;

public class Pobjednik {

    private String ime;
    private String prezime;
    private int brojZnakova;
    private KolekcijaImena kolekcijaImena;

    public Pobjednik(KolekcijaImena kolekcijaImena) {
        String imeIPrezime=kolekcijaImena.getNajduzeIme();

        for(int i=0;i<imeIPrezime.length();i++){
            if(imeIPrezime.charAt(i)==' ') {
                brojZnakova=i;
                break;
            }
        }

        ime=imeIPrezime.substring(0,brojZnakova-1);
        prezime=imeIPrezime.substring(brojZnakova+1,imeIPrezime.length());
    }


}
