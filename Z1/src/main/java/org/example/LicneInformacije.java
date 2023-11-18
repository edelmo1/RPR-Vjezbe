package org.example;

public abstract class LicneInformacije implements Interfejs{

   protected String ime;
   protected String prezime;

 public LicneInformacije() {
     this.ime="";
     this.prezime="";
 }
    public LicneInformacije(String ime, String prezime) {
     this.ime=ime;
     this.prezime=prezime;
    }

  public void setIme(String ime) {
     this.ime=ime;
  }
  public void setPrezime(String prezime) {
     this.prezime=prezime;
  }
  public String getIme() {
     return this.ime;
  }

  public String getPrezime() {
     return this.prezime;
  }

  @Override
    public String predstavi(){
     return ime+" "+prezime;
  }
}
