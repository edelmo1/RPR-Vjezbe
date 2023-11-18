package org.example;
import java.util.*;

public class InformacijeONastavniku extends LicneInformacije implements Interfejs{
    private String titula;
    private ArrayList<Ocjena> listaOcjena;
public InformacijeONastavniku(String ime , String prezime, String titula){
    this.ime=ime;
    this.prezime=prezime;
    this.titula=titula;
}
    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String predstavi(){
    return ime+" "+prezime+"" +titula;
    }

}
