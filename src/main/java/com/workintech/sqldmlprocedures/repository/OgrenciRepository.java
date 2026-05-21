package com.workintech.sqldmlprocedures.repository;

import com.workintech.sqldmlprocedures.entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {
    List<Ogrenci> findBySinif(String sinif);

    @Transactional
    @Query(value = "SELECT * FROM ogrencilistesi()", nativeQuery = true)
    List<Ogrenci> findAllOgrenci();

    @Modifying
    @Transactional
    @Query(value = "CALL sil(:ogrno)", nativeQuery = true)
    void removeOgrenci(@Param("ogrno") Long ogrno);
}