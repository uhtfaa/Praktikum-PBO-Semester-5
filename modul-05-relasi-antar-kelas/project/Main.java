package com.week5.Unguided;

public class Main {
    public static void main(String[] args) {
        // 1. Buat objek Kasir
        Kasir kasir = new Kasir("Budi");

        // 2. Buat 3 objek ItemPesanan secara independen
        ItemPesanan item1 = new ItemPesanan("Iced Americano", 18000);
        ItemPesanan item2 = new ItemPesanan("Beef Croissant", 25000);
        ItemPesanan item3 = new ItemPesanan("Matcha Latte", 22000);

        // 3. Buat objek Pesanan untuk Meja 4 (kapasitas 5 item)
        Pesanan pesanan = new Pesanan(4, 5);

        // 4. Masukkan item ke dalam pesanan
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        // 5. Tampilkan rincian pesanan
        pesanan.tampilkanPesanan();
        System.out.println();

        // 6. Proses pembayaran
        kasir.prosesPembayaran(pesanan);
    }
}
