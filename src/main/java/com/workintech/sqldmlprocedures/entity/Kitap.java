package com.workintech.sqldmlprocedures.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitapno;
    private String ad;
    private Integer puan;
    private Long yazarno;
    private Long turno;
}