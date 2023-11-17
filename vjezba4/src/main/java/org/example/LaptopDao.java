package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public interface LaptopDao {

    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException , IOException;
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);

    ArrayList<Laptop> vratiPodatkeIzDatoteke() throws FileNotFoundException, IOException, ClassNotFoundException;

}