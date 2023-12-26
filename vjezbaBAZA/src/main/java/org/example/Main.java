package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

public static String ispisiGradove() throws SQLException, ClassNotFoundException{

    GeografijaDAO geo=GeografijaDAO.getInstance();
    ArrayList<Grad> gradovi=geo.gradovi();
    String s=new String();
    for(int i=0;i<gradovi.size();i++){
        Grad grad=gradovi.get(i);
        s+=grad.getNaziv()+"("+geo.ispisGradova(grad.getId())+") - "+grad.getBrojStanovnika()+"\n";
    }
    return s;
}

   public static void glavniGrad() throws SQLException, ClassNotFoundException{

    Scanner ulaz=new Scanner(System.in);

    System.out.println("Unesite naziv drzave: ");
    String s= ulaz.nextLine();
    GeografijaDAO geo=GeografijaDAO.getInstance();
    Grad grad=geo.glavniGrad(s);
    if(grad==null) System.out.println("Nepostojeca drzava!");
    System.out.println("Glavni grad drzave "+s+" je grad "+grad.getNaziv());
   }


    public static void main(String[] args) throws SQLException, ClassNotFoundException{

    System.out.println(ispisiGradove());




    }
}