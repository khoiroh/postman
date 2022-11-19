package com.kerajaanIslam.islam.controller;

import com.kerajaanIslam.islam.model.Kerajaan;
import com.kerajaanIslam.islam.repository.IslamRepository;
import com.kerajaanIslam.islam.service.IslamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//untuk memanggil data
@RequestMapping("/kerajaan")
public class IslamController {

//    untuk memanggil file islamRespository
    @Autowired
    private IslamRepository islamRepository;

//    untuk memanggil file islamService
    @Autowired
    private IslamService islamService;

//    untuk menambahkan
    @PostMapping
    public Kerajaan addKerajaan(@RequestBody Kerajaan kerajaan) {
        return islamService.addKerajaan(kerajaan);
    }

//    untuk melihat data sesuai id
    @GetMapping("/{id}")
    public Kerajaan getKerajaanById(@PathVariable("id") Long id) {
        return islamService.getKerajaanById(id);
    }

//    untuk mengedit sesuai id
    @PutMapping("/{id}")
    public Kerajaan editKerajaanById(@PathVariable("id") Long id, @RequestBody Kerajaan kerajaan) {
        return islamService.editKerajaanById(id, kerajaan.getKerajaanIslam(), kerajaan.getLetak(), kerajaan.getTahunBerdiri(), kerajaan.getRajaTerkenal(), kerajaan.getPeninggalanSejarah());
    }

//    untuk melihat semua data
    @GetMapping("all")
    public List<Kerajaan> getAllKerajaan() {
        return islamService.getAllKerajaan();
    }

//    untuk menghapus sesuai id
    @DeleteMapping("/{id}")
    public void deleteKerajaanById(@PathVariable("id") Long id) {
        islamService.deleteKerajaanById(id);
    }
}
