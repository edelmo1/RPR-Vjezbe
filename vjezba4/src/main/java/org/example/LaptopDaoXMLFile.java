package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.* ;
import java.util.ArrayList ;

public class LaptopDaoXMLFile implements LaptopDao{

    private File file;
    private ArrayList<Laptop> laptopi;

    @Override
    public void dodajLaptopUListu(Laptop laptop){
        laptopi.add(laptop);
    }
    @Override
    public void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException , IOException{

        XmlMapper map= new XmlMapper();
        map.writeValue(file,laptop);
    }
    @Override
    public    Laptop getLaptop(String procesor) {
        for(int i=0; i<laptopi.size();i++) {
            if(laptopi.get(i).getProcesor()==procesor) return laptopi.get(i);
        }
        return laptopi.get(0);
    }
    @Override
    public void napuniListu(ArrayList<Laptop> laptopi){
        this.laptopi.addAll(laptopi);
    }
@Override
  public  ArrayList<Laptop> vratiPodatkeIzDatoteke() throws FileNotFoundException, IOException, ClassNotFoundException {

    XmlMapper map = new XmlMapper();
    return map.readValue(file, new TypeReference<ArrayList<Laptop>>() {});
}
}