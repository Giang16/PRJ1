package com.example.demo.JpaRepository;

import com.example.demo.Model.NhaTro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhaTroRepository extends JpaRepository<NhaTro, Integer> {
    NhaTro findByMant(Integer mant);
}
