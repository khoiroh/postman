package com.kerajaanIslam.islam.model;

import javax.persistence.*;

@Entity
//untuk membuat table
@Table(name = "Kerajaan")
public class Kerajaan {

//untuk memanggil id secara otomatis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    untuk membuat kolom
    @Column(name = "kerajaan_islam")
    private String kerajaanIslam;

    @Column(name = "letak")
    private String letak;

    @Column(name = "tahun_berdiri")
    private String tahunBerdiri;

    @Column(name = "raja_terkenal")
    private String rajaTerkenal;

    @Column(name = "peninggalan_sejarah")
    private String peninggalanSejarah;

//    untuk memanggil id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//
    public String getKerajaanIslam() {
        return kerajaanIslam;
    }

    public void setKerajaanIslam(String kerajaanIslam) {
        this.kerajaanIslam = kerajaanIslam;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }

    @Override
    public String toString() {
        return "Kerajaan{" +
                "id=" + id +
                ", kerajaanIslam='" + kerajaanIslam + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}
