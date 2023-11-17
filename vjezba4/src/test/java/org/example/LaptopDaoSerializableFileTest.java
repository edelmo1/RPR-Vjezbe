package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LaptopDaoSerializableFileTest {

    @Test
    void dodajLaptopUListu() {
        LaptopDaoSerializableFile laptopi=new LaptopDaoSerializableFile("test.txt");
        Laptop laptop = new Laptop();
        laptopi.dodajLaptopUListu(laptop);
        assertEquals(laptopi.getLaptop(""),laptop);
    }

    @Test
    void getLaptop() {

        LaptopDaoSerializableFile laptopi=new LaptopDaoSerializableFile("test.txt");
        Laptop laptop = new Laptop();
        laptopi.dodajLaptopUListu(laptop);
        assertEquals(laptopi.getLaptop(""),laptop);



    }
}

