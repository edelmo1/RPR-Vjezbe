package org.example;

import java.io.File;
import java.io.*;
import java.io.Serializable ;

import java.util.ArrayList;


public class LaptopDaoSerializableFile implements LaptopDao {

    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoSerializableFile(String put) {
        laptopi=new ArrayList<Laptop>();
        file= new File(put);
    }


    @Override

    public void dodajLaptopUListu(Laptop laptop){laptopi.add(laptop);
    }


    public  void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException , IOException {
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream o = new ObjectOutputStream(f);

        o.writeObject(laptop);

        o.close();
        f.close();
    }

    @Override
    public Laptop getLaptop(String procesor) {
        for(int i=0;i<laptopi.size();i++) {

            if(laptopi.get(i).getProcesor()==procesor)  return laptopi.get(i);

        }
        return laptopi.get(0);
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi){
        this.laptopi.addAll(laptopi);
    }
    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream f= new FileInputStream(file);
        ObjectInputStream o = new ObjectInputStream(f);

        laptopi=(ArrayList<Laptop>) o.readObject();
        return laptopi;
    }

}