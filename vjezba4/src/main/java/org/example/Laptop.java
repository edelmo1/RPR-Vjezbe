package org.example;

public class Laptop {

    private String brend , model;
    private double cijena , velicinaEkrana;
    private int ram , hdd , ssd ;
    private String procesor , grafickaKartica;

    public Laptop(String brend, String model, double cijena, double velicinaEkrana, int ram, int hdd, int ssd, String procesor, String grafickaKartica) {
        this.brend = brend;
        this.model = model;
        this.cijena = cijena;
        this.velicinaEkrana = velicinaEkrana;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.procesor = procesor;
        this.grafickaKartica = grafickaKartica;
    }

    public Laptop() {
        this.brend = "";
        this.model = "";
        this.cijena = 0;
        this.velicinaEkrana = 0;
        this.ram = 0;
        this.hdd = 0;
        this.ssd = 0;
        this.procesor = "";
        this.grafickaKartica = "";
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public double getCijena() {
        return cijena;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public String getProcesor() {
        return procesor;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }
}