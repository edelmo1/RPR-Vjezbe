package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

public class GeografijaDAO {
    private static GeografijaDAO instanca = null;
    private Connection conn;
private PreparedStatement dajGradove;
private PreparedStatement dajDrzave;
private PreparedStatement ispisGradova;
    private GeografijaDAO() throws SQLException , ClassNotFoundException{
       // Class.forName("org.sqlite.JDBC");
         //conn= DriverManager.getConnection("jdbc:oracle:thin:@ora.db.lab.ri.etf.unsa.ba:1521:ETFLAB","DE19316","bQ1uofk5");
        conn=DriverManager.getConnection("jdbc:sqlite:baza.db");
        dajGradove=conn.prepareStatement("SELECT g.* FROM Grad g, Drzava d WHERE g.drzava=d.id and d.glavni_grad=g.id ORDER BY g.broj_stanovnika DESC");
         dajDrzave=conn.prepareStatement("SELECT * FROM drzava");
         ispisGradova=conn.prepareStatement("SELECT d.naziv FROM Drzava d , Grad g WHERE d.glavni_grad=g.id and g.drzava=d.id and g.id=?");
    }

    public String ispisGradova(int id) throws SQLException{

        try {
            ispisGradova.setInt(1, id);
        ResultSet rez=ispisGradova.executeQuery();
        return rez.getString(1);
        }
        catch(SQLException e) {
            System.out.println("GRESKA");
        }
        return null;
    }

    public  static GeografijaDAO getInstance() throws SQLException , ClassNotFoundException{
        if (instanca == null) {instanca = new GeografijaDAO();}
        return instanca;
    }

    public ArrayList<Grad> gradovi() throws SQLException{

        ResultSet rez=dajGradove.executeQuery();
        ArrayList<Grad> ret=new ArrayList<Grad>();
        while(rez.next()){
        ret.add(new Grad(rez.getInt(1),rez.getString(2),rez.getInt(3),rez.getInt(4)));
        }
        return ret;
    }

    public Grad glavniGrad(String drzava) throws SQLException{
        boolean postoji=false;
        ResultSet rez=dajDrzave.executeQuery();
        while(rez.next()){
           String temp=rez.getString(2);
           if(drzava.equals(temp)) {
               PreparedStatement prep=conn.prepareStatement("SELECT * FROM grad g, drzava d WHERE g.id = d.glavni_grad AND d.naziv = ?");
               prep.setString(1,drzava);
               ResultSet r=prep.executeQuery();
               return new Grad(r.getInt(1),r.getString(2),r.getInt(3),r.getInt(4));
           }
        }
        return null;
    }

    public void obrisiDrzavu(String drzava)throws SQLException{
        PreparedStatement prep=conn.prepareStatement("SELECT id FROM drzava");
        ResultSet rez=prep.executeQuery();
        int idDrzave=rez.getInt(1);

        //obrisemo drzavu
        PreparedStatement prep2=conn.prepareStatement("DELETE drzava WHERE id=?");
        prep2.setInt(1,idDrzave);
        prep2.executeUpdate();
         //obrisemo gradove
        PreparedStatement prep3=conn.prepareStatement("DELETE grad WHERE drzava=?");
        prep3.setInt(1,idDrzave);
        prep3.executeUpdate();
    }

public void dodajGrad(Grad grad) throws SQLException{

        PreparedStatement prep=conn.prepareStatement("INSERT INTO grad VALUES(? ? ? ?)");
        prep.setInt(1,grad.getId());
    prep.setString(2,grad.getNaziv());
    prep.setInt(3,grad.getBrojStanovnika());
    prep.setInt(4,grad.getDrzava());
    prep.executeUpdate();
}

public void dodajDrzavu(Drzava drzava) throws SQLException{

    PreparedStatement prep=conn.prepareStatement("INSERT INTO drzava VALUES(? ? ?)");
    prep.setInt(1,drzava.getId());
    prep.setString(2,drzava.getNaziv());
    prep.setInt(3,drzava.getGlavniGrad());
    prep.executeUpdate();
}

 public   void izmijeniGrad(Grad grad) throws SQLException{


     PreparedStatement prep=conn.prepareStatement("UPDATE  grad SET id=promjenaID," +
             "                                                          naziv=promjenaNAZIV," +
             "                                                          broj_stanovnika=promjenaBrojStanovnika," +
             "                                                          drzava=promjenaDrzava" +
             " WHERE id=?");
     prep.setInt(1,grad.getId());
     prep.executeUpdate();
    }

    Drzava nadjiDrzavu(String drzava) throws SQLException{

        PreparedStatement prep=conn.prepareStatement("SELECT * from drzava");
        ResultSet rez=prep.executeQuery();
        while(rez.next()){
           if(drzava.equals(rez.getString(2))){

               Drzava d=new Drzava(rez.getInt(1),rez.getString(2),rez.getInt(3));
               return d;
           }
        }
return null;
    }





}
