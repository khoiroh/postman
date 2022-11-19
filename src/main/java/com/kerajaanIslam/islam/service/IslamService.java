package com.kerajaanIslam.islam.service;

import com.kerajaanIslam.islam.model.Kerajaan;

import java.util.List;

public interface IslamService {

//    menambahkan data
    Kerajaan addKerajaan(Kerajaan kerajaan);

//    melihat sesuai id
    Kerajaan getKerajaanById(Long id);

//    melihat semua data
    List<Kerajaan> getAllKerajaan();

//    untuk mengedit sesuai data
    Kerajaan editKerajaanById(Long id, String kerajaanIslam, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);

//    untuk menghapus sesuai id
    void deleteKerajaanById(Long id);
}
