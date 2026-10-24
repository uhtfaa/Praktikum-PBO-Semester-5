package com.week6.Unguided;

public class Main {
    public static void main(String[] args) {
        ModelUmum[] daftarModel = new ModelUmum[3];
        daftarModel[0] = new ModelRegresi("Regresi Linier", 500, 4);
        daftarModel[1] = new ModelKlasifikasi("Decision Tree", 800, 3);
        daftarModel[2] = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        int totalBiaya = 0;
        for (ModelUmum m : daftarModel) {
            m.tampilInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }
        System.out.println("Total biaya: " + totalBiaya);

        // Neural Network (indeks 2): versi epoch milik kelas induk
        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));

        // Regresi Linier (indeks 0)
        System.out.println("Biaya 10 epoch (Regresi Linier): " + daftarModel[0].hitungBiaya(10));

        // Versi epoch + batch hanya ada di ModelRegresi, perlu casting
        ModelRegresi regresi = (ModelRegresi) daftarModel[0];
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}
