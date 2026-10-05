package com.week3.projectmodul3.UnGuided;

import java.util.Arrays;
import java.util.Locale;

public class GoSuhu {
    public static void main(String[] args){
        double[] suhuHarian = {30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };
        
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);
        
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());
        System.out.println();
        
        pengolah.isiDataKosong();
        
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();
        
        System.out.println(String.format(Locale.US, "Rata-rata : %.2f C", pengolah.hitungRataRata()));
        System.out.println();
        
        System.out.println("Isi array suhu Harian di main setelah isiDataKosong() dijalankan: ");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");
    }
}
