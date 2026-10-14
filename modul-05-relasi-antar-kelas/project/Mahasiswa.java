package com.week5.Guided.agregasi;

public class Mahasiswa {
    private String NIM, Nama;
    
    //Constructor
    public Mahasiswa(String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
    }
    
    //Gentter
    public String getNIM(){
        return NIM;
    }
    
    public String getNama(){
        return Nama;
    }
    
    //Setter
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
}
