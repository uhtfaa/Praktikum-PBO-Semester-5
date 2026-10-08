package com.week4.modul.enkapsulasi.Unguided.model;

public class Dataset {
    public static final double BATAS_MISSING = 5.0;
    private static int totalDataset = 0;
    
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;
    
    public Dataset(){
        this.nama = "";
        totalDataset++;
    }
    
    public Dataset(String nama){
        this.nama = nama;
        totalDataset++;
    }
    
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing){
        this(nama);
        setJumlahBaris(jumlahBaris);
        setJumlahKolom(jumlahKolom);
        setJumlahMissing(jumlahMissing);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0){
            this.jumlahBaris = jumlahBaris;
        }
    }

    public void setJumlahKolom(int jumlahKolom) {
         if (jumlahKolom >= 0){
            this.jumlahKolom = jumlahKolom;
        }
    }

    public void setJumlahMissing(int jumlahMissing) {
         if (jumlahMissing >= 0){
            this.jumlahMissing = jumlahMissing;
        }
    }
    
    public static int getTotalDataset(){
        return totalDataset;
    }
    
    // Getter
    public String getNama() {return nama;}
    public int getJumlahBaris() {return jumlahBaris;}
    public int getJumlahKolom () {return jumlahKolom;}
    public int getJumlahMissing() {return jumlahMissing;}
    
    // Persentase sel kosong terhadap total sel
    public double getPersentaseMissing(){
        int totalSel = jumlahBaris * jumlahKolom;
        if (totalSel == 0){
            return 0;
        }
        return (double) jumlahMissing / totalSel * 100;
    }
    
    public boolean perluDibersihkan(){
        return getPersentaseMissing() > BATAS_MISSING;
    }
    
}
