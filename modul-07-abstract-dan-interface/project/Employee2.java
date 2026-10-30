package com.week7.guided.gd3;

public abstract class Employee2 implements Payable3{
    private String name;

    public Employee2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setiap pegawai memiliki gaji, namun rumus berbeda-beda
    public abstract double earnings();

    // Saat ada penagihan, alihkan langsung ke motode kalkulasi gaji (earnings)
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
