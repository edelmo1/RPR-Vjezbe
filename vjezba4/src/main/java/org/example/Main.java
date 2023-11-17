package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

Laptop laptop1=new Laptop();
laptop1.setBrend("brend1");
        laptop1.setModel("model1");
        laptop1.setCijena(500);
        laptop1.setRam(200);
        laptop1.setHdd(200);
        laptop1.setSsd(200);
        laptop1.setProcesor("procesor1");
        laptop1.setGrafickaKartica("graficka1");


        Laptop laptop2=new Laptop();
        laptop2.setBrend("brend2");
        laptop2.setModel("model2");
        laptop2.setCijena(500);
        laptop2.setRam(200);
        laptop2.setHdd(200);
        laptop2.setSsd(200);
        laptop2.setProcesor("procesor2");
        laptop2.setGrafickaKartica("graficka2");

LaptopDaoSerializableFile l=new LaptopDaoSerializableFile("C:\\Users\\x\\Desktop\\vjezba4\\src\\main\\java\\org\\example\\LaptopDaoSerializableFile.java");
l.dodajLaptopUListu(laptop1);
l.dodajLaptopUListu(laptop2);
try {
    l.dodajLaptopUFile(laptop1);
    l.vratiPodatkeIzDatoteke();
}
catch(FileNotFoundException e){
    System.out.println(e.getMessage());
    System.exit(0);
}

catch(IOException e) {
    System.out.println(e.getMessage());
    System.exit(0);
        }

catch(ClassNotFoundException e) {
    System.out.println(e.getMessage());
    System.exit(0);
}

Laptop test= l.getLaptop(laptop1.getProcesor());
System.out.println(test.getProcesor());

    }



}