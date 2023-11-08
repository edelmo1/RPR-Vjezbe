public class FiksniBroj extends TelefonskiBroj{

    private String broj;
    private Grad grad;
    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(broj);
    }





    public FiksniBroj(Grad grad, String broj) {
        this.grad=grad;
        if(grad.ordinal()==0) this.broj="033"+"/"+broj;
        else if(grad.ordinal()==1) this.broj="030"+"/"+broj;
        else if(grad.ordinal()==2) this.broj="031"+"/"+broj;
        else if(grad.ordinal()==3) this.broj="032"+"/"+broj;
        else if(grad.ordinal()==4) this.broj="034"+"/"+broj;
        else if(grad.ordinal()==5) this.broj="035"+"/"+broj;
        else if(grad.ordinal()==6) this.broj="036"+"/"+broj;
        else if(grad.ordinal()==7) this.broj="037"+"/"+broj;
        else if(grad.ordinal()==8) this.broj="038"+"/"+broj;
        else if(grad.ordinal()==9) this.broj="039"+"/"+broj;
        else if(grad.ordinal()==10) this.broj="049"+"/"+broj;
        else if(grad.ordinal()==11) this.broj="050"+"/"+broj;
        else if(grad.ordinal()==12) this.broj="051"+"/"+broj;
        else if(grad.ordinal()==13) this.broj="052"+"/"+broj;
        else if(grad.ordinal()==14) this.broj="053"+"/"+broj;
        else if(grad.ordinal()==15) this.broj="054"+"/"+broj;
        else if(grad.ordinal()==16) this.broj="055"+"/"+broj;
        else if(grad.ordinal()==17) this.broj="056"+"/"+broj;
        else if(grad.ordinal()==18) this.broj="057"+"/"+broj;
        else if(grad.ordinal()==19) this.broj="058"+"/"+broj;
        else if(grad.ordinal()==20) this.broj="059"+"/"+broj;

    }
    public String dajGrad() {return grad.dajGrad();};
}