package org.example;

import java.util.Scanner;

public class Main{

    public static int sumaCifara(int n){

        int suma=0;
        int a=n;
        while(a!=0) {
            a = n % 10;
            suma += a;
            a /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {

        int n;
        Scanner ulaz= new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        n=ulaz.nextInt();

        System.out.println("Traženi brojevi su:");

        for(int i=2;i<n;i=i+1){
            if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }
}
