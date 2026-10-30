package com.week7.unguided;

public interface ItemTransaksi {
    // Kontrak publik kasir
    double getNominalBayar();
    String getNamaTransaksi();
    
    // Mencetak satu baris struk
    default void cetakRincianItem(){
        System.out.println("- "+getNamaTransaksi()+" | Total: Rp"+getNominalBayar());
    }
    
    // Mencetak log kasir
    static void catatLogKasir(String pesan){
        System.out.println("[LOG SISTEM KASIR] "+pesan);
    }
}
