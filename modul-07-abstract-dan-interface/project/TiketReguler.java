package com.week7.unguided;

public class TiketReguler extends TiketBioskop {
    private int nomorStudio;
    
    public TiketReguler(String judulFilm, double hargaDasar, int jumlahKursi, int nomorStudio){
        super(judulFilm, hargaDasar, jumlahKursi);
        this.nomorStudio = nomorStudio;
    }
    
    @Override
    public double hitungTotalBayar(){
        return getHargaDasar() * getJumlahKursi();
    }
    
    @Override
    public String getNamaTransaksi(){
        return "Tiket reguler (Studio " + nomorStudio + ") - " + getJudulFilm() +
                " (" + getJumlahKursi() + " x Rp" + getHargaDasar() + ")";
    }
}
