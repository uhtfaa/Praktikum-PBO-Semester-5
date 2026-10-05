package Guided03.Enkapsulasi;

public class Rekening {
    private int saldo = 0;
    
    public void tambahSaldo(int jumlah){
        saldo = saldo + jumlah;
        System.out.println("saldo berhasil ditambahkan");
    }
    
    public void tampilkanSaldo(){
        System.out.println("Saldo anda: " + saldo);
    }
}
