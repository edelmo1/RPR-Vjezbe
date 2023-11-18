package org.example;
import java.util.*;

public class KolekcijaImena {
    private  HashMap<String,String> imena;

    public String getNajduzeIme(){

  Iterator<Map.Entry<String,String>> it = imena.entrySet().iterator();
        Map.Entry<String,String> prvoPolje=it.next();
        String najduzeIme=prvoPolje.getKey();
        imena.put(najduzeIme,prvoPolje.getValue()); //uzeli smo pa ga vratimo

        while(it.hasNext()){

            Map.Entry<String,String> polje=it.next();
           if(polje.getKey().length()>najduzeIme.length()) najduzeIme=polje.getKey();
  }

        return najduzeIme+" "+imena.get(najduzeIme);




    }
}
