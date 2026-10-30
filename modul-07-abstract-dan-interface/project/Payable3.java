package com.week7.guided.gd3;

public interface Payable3 {
    double getPaymentAmount();
    
    // Fitur varu
    default void printReceipt(){
        System.out.println("Struk Resmi - Total: Rp"+getPaymentAmount());
    }
    
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG] "+message);
    }
}
