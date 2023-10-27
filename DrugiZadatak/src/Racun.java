public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;

    public Racun(long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
        this.stanjeRacuna=0;
        this.odobrenjePrekoracenja=false;
    };
    public boolean provjeriOdobrenjePrekoracenja(double stanje) {
        if(this.odobrenjePrekoracenja==true) return true;
        return false;
    };
        public boolean izvrsiUplatu(double x) {
            this.stanjeRacuna=this.stanjeRacuna+x;
        return true;
        };
    public boolean izvrsiIsplatu(double x) {this.stanjeRacuna=this.stanjeRacuna-x;
    return true;
    };
    public void odobriPrekoracenje(double x){
        this.odobrenjePrekoracenja=true;
    };

    public double dajStanjeRacuna() {
        return stanjeRacuna;
    }


}
