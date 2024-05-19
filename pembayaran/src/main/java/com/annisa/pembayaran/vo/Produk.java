/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisa.pembayaran.vo;

/**
 *
 * @author Dell
 */

public class Produk {
  
    private Long id_produk;
    private String kode;
    private String nama;
    private String satuan;

    public Produk() {
    }

    public Produk(Long id_produk, String kode, String nama, String satuan) {
        this.id_produk = id_produk;
        this.kode = kode;
        this.nama = nama;
        this.satuan = satuan;
    }

    public Long getId() {
        return id_produk;
    }

    public void setId(Long id) {
        this.id_produk = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

        @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}