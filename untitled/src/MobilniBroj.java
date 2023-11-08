public class MobilniBroj extends TelefonskiBroj{

    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.broj="0"+Integer.toString(mobilnaMreza)+"/"+broj;
    }


    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {    //???????????
        return Integer.valueOf(broj);
    }
}