public enum Grad {
    SARAJEVO("Sarajevo"),BUGOJNO("Bugojno"),ORASJE("Orasje"),ZENICA("Zenica"),LIVNO("Livno"),TUZLA("Tuzla"),MOSTAR("Mostar"),BIHAC("Bihac"),GORAZDE("Gorazde"),SIROKIBRIJEG("Siroki Brijeg"),BRCKO("Brcko"),
    MRKONJICGRAD("Mrkonjic Grad"),BANJALUKA("Banja Luka"),PRIJEDOR("Prijedor"),DOBOJ("Doboj"),SAMAC("Samac"),BIJELJINA("Bijeljina"),ZVORNIK("Zvornik"),PALE("Pale"),FOCA("Foca"),TREBINJE("Trebinje");
    public String ime;
    Grad(String ime) {
        this.ime=ime;
    }
   public String dajGrad() {return ime;};
}