package com.kerajaanIslam.islam.service;

import com.kerajaanIslam.islam.model.Kerajaan;
import com.kerajaanIslam.islam.repository.IslamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IslamServiceImpl implements IslamService {

//    untuk memanggil file islamRepository
    @Autowired
    IslamRepository islamRepository;

//    untuk menambahkan data
    @Override
    public Kerajaan addKerajaan(Kerajaan kerajaan) {
        return islamRepository.save(kerajaan);
    }

//    untuk menghapus sesuai id
    @Override
    public Kerajaan getKerajaanById(Long id) {
        return islamRepository.findById(id).get();
    }

//    untuk mengedit sesuai data
    @Override
    public Kerajaan editKerajaanById(Long id, String kerajaanIslam, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah) {
        Kerajaan kerajaan = islamRepository.findById(id).get();
        kerajaan.setKerajaanIslam(kerajaanIslam);
        kerajaan.setLetak(letak);
        kerajaan.setTahunBerdiri(tahunBerdiri);
        kerajaan.setRajaTerkenal(rajaTerkenal);
        kerajaan.setPeninggalanSejarah(peninggalanSejarah);
        return islamRepository.save(kerajaan);
    }

//    untuk melihat semua data
    @Override
    public List<Kerajaan> getAllKerajaan() {
        return islamRepository.findAll();
    }

//    untuk menghapus sesuai id
    @Override
    public void deleteKerajaanById(Long id) {
        islamRepository.deleteById(id);
    }
}
