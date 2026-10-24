package com.week6.Guided.gd3;

public class Lagu {
    String pencipta;
    String judul;
    
    void isiParam(String param1){
        judul = param1;
        pencipta = "Tidak Dikenal";
    }
    
    void isiParam(String param1, String param2){
        judul = param1;
        pencipta = param2;
    }
    
    void tampilkan(){
        System.out.println("Judul: "+ judul +", Pencipta; "+ pencipta);
    }
}
