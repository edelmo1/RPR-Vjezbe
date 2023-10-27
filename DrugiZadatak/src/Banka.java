import java.util.List ;

public class Banka {

    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
    protected long brojRacuna;


    public Banka() {};
    public Korisnik kreirajNovogKorisnika(String ime,String prezime) {
        Korisnik korisnik=new Korisnik(ime,prezime) ;
  korisnici.add(korisnik) ;
        return korisnik;
    }

   public Uposlenik kreirajNovogUposlenika(String ime , String prezime) {

       Uposlenik uposlenik=new Uposlenik(ime,prezime) ;
       uposlenici.add(uposlenik) ;
       return uposlenik;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik korisnik) {
        Racun racun= new Racun(brojRacuna,korisnik);
        korisnik.dodajRacun(racun);
        return racun;
    }
}

