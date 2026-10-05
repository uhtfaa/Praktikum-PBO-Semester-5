package com.week3.projectmodul3.UnGuided;

public class PengolahSuhu {
    private double[] suhuHarian;
    private static final double NilaiKosong = -1.0;
    public PengolahSuhu(double[] suhuHarian){
        this.suhuHarian = suhuHarian; //menyimpan referensi array yang sama
    }
    
    public void tampilkanData(){
        for (int i = 0; i < suhuHarian.length; i++){
            if (suhuHarian[i] == NilaiKosong) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            }else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + " C");
            }
        }
    }
    
    public int cariIndexKosong(){
        for (int i = 0; i < suhuHarian.length; i++){
            if (suhuHarian[i] == NilaiKosong){
                return i;
            }
        }
        return -1;
    }
    
    public void isiDataKosong(){
        int i = cariIndexKosong();
        if (i != -1){
            suhuHarian[i] = (suhuHarian[i - 1] + suhuHarian[i + 1]) / 2;
        }
    }
    
    public double hitungRataRata(){
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }
    
}
