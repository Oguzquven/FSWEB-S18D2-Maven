package com.workintech.sqldmlprocedures.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ogrenci")
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ogrno;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String sinif;
    private Integer puan;
    private String dtarih;
}