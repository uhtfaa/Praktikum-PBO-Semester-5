package com.week4.modul.enkapsulasi.Unguided.laporan;

import com.week4.modul.enkapsulasi.Unguided.model.Dataset;

public class LaporanDataset {
    public static void cetak(Dataset d){
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + d.getNama());
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.println("Missing      : " + d.getJumlahMissing() + " Sel (" + String.format("%.2f", d.getPersentaseMissing()) + "%)");
        System.out.println("Status       : " + (d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih"));
        System.out.println();
    }
}
