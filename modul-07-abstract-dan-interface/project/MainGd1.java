package com.week7.guided.gd1;

public class MainGd1 {
    public static void main(String[] args) {
        SalariedEmployee salaried = new SalariedEmployee("Budi", 5000000);
        System.out.println("Nama: "+salaried.getName());
        System.out.println("Gaji: Rp"+salaried.earnings());
    }
}
