package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer tkid;
    @Column
    private String tendangnhap;
    @Column
    private String matkhau;
    @Column
    private String hoten;
    @Column
    private String sdt;
    @Column
    private String cccd;

    public TaiKhoan(){}

    public TaiKhoan(Integer tkid, String tendangnhap, String matkhau, String hoten, String sdt, String cccd) {
        this.tkid = tkid;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.sdt = sdt;
        this.cccd = cccd;
    }

    public Integer getTkid() {
        return tkid;
    }

    public void setTkid(Integer tkid) {
        this.tkid = tkid;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
}
