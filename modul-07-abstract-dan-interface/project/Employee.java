package com.week7.guided.gd1;

public abstract class Employee {
    private String name;
    
    public Employee(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    // Setiap pegawai memiliki gaji, namun rumus berbeda-beda
    public abstract double earnings();
}
