package com.week5.Unguided;

public class Kasir {
    private String namakasir;
    
    public Kasir(String namaKasir){
        this.namakasir = namaKasir;
    }
    
    // Asosiasi: Pesanan hanya diterima sebagai parameter, tidak disimpan sebagai field
    public void prosesPembayaran(Pesanan pesanan) {
        double totalSubtotal = 0;
        double totalPajak = 0;

        for (int i = 0; i < pesanan.getJumlahItem(); i++) {
            RincianHarga r = pesanan.getDaftarItem()[i].getRincian();
            totalSubtotal += r.getHargaDasar();
            totalPajak += r.getPajak();
        }
        
        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namakasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + (totalSubtotal + totalPajak));
        System.out.println("==============================");
    }
   
}
