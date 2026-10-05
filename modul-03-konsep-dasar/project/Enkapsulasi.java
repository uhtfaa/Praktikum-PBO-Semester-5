package Guided03.Enkapsulasi;

public class Enkapsulasi {
    public static void main(String[] arg){
        Rekening rek = new Rekening();
        
        rek.tambahSaldo(150000);
        rek.tampilkanSaldo();
        rek.tambahSaldo(300000);
        rek.tampilkanSaldo();
    }
}
