package com.week7.guided.gd3;

public class Maingd3 {
    public static void main(String[] args) {
        Payable3.logTransaction("Sistem pembayaran diinisialisasi");

        Payable3[] items = new Payable3[2];
        items[0] = new Invoice("Ram DDP 5 16GB", 2, 2000000);
        items[1] = new SalariedEmployee("Budi", 5000000);

        for (Payable3 item : items) {
            item.printReceipt();
        }

        Payable3.logTransaction("Transaksi selesai diproses");
    }
}
