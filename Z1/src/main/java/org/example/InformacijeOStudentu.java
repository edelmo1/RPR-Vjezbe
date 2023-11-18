package org.example;

public class InformacijeOStudentu extends LicneInformacije implements Interfejs{

private String godinaStudija;
private String brojIndexa;

public InformacijeOStudentu(String ime, String prezime, String godinaStudija, String brojIndexa) {
    this.ime=ime;
    this.prezime=prezime;
    this.godinaStudija=godinaStudija;
    this.brojIndexa=brojIndexa;
}

public String getGodinaStudija() {
    return this.godinaStudija;
}
public String getBrojIndexa() {
    return this.brojIndexa;
}

public void setGodinaStudija(String godinaStudija){
    this.godinaStudija=godinaStudija;
}

public void setBrojIndexa(String brojIndexa){
    this.brojIndexa=brojIndexa;
}

@Override
    public String predstavi(){
    return ime+" "+prezime+" "+godinaStudija+" "+" "+brojIndexa;
}





}
