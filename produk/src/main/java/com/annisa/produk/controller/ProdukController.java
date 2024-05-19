/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisa.produk.controller;

import com.annisa.produk.entity.Produk;
import com.annisa.produk.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @Dell
 */
@RestController
@RequestMapping("api/v1/produk")
public class ProdukController {

     @Autowired
    private ProdukService produkService;
    
    @GetMapping
    public List<Produk> getAll(){
        return produkService.getAll();
    }
    
    @PostMapping
    public void insert (@RequestBody Produk produk){
        produkService.insert(produk);
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long Id){
        produkService.delete(Id);
    }
    
    @PutMapping(path = "{id}")
    public void update (@PathVariable("id") Long id,
        @RequestParam(required = false) String kode,
        @RequestParam(required = false) String nama,
        @RequestParam(required = false) String satuan,
        @RequestParam(required = false) Double harga) {
        produkService.update(id, kode, nama, satuan, harga);
    }
    
    @GetMapping(path = "{id}")
    public Produk getProductById(@PathVariable("id") Long id){
        return produkService.getProdukById(id);
    }
}
