package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "NhaTro")
public class NhaTro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNT")
    private Integer mant;
    @Column(name = "TenNT")
    private String tennt;
    @Column(name = "DiaChi")
    private String diachi;

    public NhaTro(){}

    public NhaTro(String tennt, String diachi) {
        this.tennt = tennt;
        this.diachi = diachi;
    }

    public Integer getMant() {
        return mant;
    }

    public void setMant(Integer mant) {
        this.mant = mant;
    }

    public String getTennt() {
        return tennt;
    }

    public void setTennt(String tennt) {
        this.tennt = tennt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
