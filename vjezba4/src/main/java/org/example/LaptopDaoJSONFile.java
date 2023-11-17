package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.* ;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{

    private File file;
    private ArrayList<Laptop> laptopi;
    @Override
    public void dodajLaptopUListu(Laptop laptop){laptopi.add(laptop);}

    public void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException , IOException{

        ObjectMapper o= new ObjectMapper();
        o.writeValue(file,laptop);
    }
    @Override
    public Laptop getLaptop(String procesor){

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
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws FileNotFoundException, IOException, ClassNotFoundException{

        FileInputStream f= new FileInputStream(file);
        ObjectMapper o = new ObjectMapper();

        laptopi=(ArrayList<Laptop>) o.readValue(file,new TypeReference<ArrayList<Laptop>>(){});
        return laptopi;
    }














}