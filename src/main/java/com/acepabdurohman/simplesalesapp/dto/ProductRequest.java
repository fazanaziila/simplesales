package com.acepabdurohman.simplesalesapp.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {
    private String nama;
    private BigDecimal harga;
    
    public String getNama() {
        return nama;
    }
    
    public BigDecimal getHarga() {
        return harga;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }
}
