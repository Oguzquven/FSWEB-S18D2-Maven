package com.workintech.sqldmlprocedures.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tur")
public class Tur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turno;
    private String ad;
}