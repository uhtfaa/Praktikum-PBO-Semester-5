package com.week7.unguided;

public abstract class TiketBioskop implements ItemTransaksi {
    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;
    
    public TiketBioskop(String judulFilm, double hargaDasar, int jumlahKursi){
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }
    
    public String getJudulFilm(){
        return judulFilm;
    }
    
    public double getHargaDasar(){
        return hargaDasar;
    }
    
    public int getJumlahKursi(){
        return jumlahKursi;
    }
    
    // Diisi oleh class turunan
    public abstract double hitungTotalBayar();
    
    @Override
    public abstract String getNamaTransaksi();
    
    @Override
    public double getNominalBayar(){
        return hitungTotalBayar();
    }
}
