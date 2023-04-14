package com.example.Ac1_Atv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ac1_Atv2.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

    List<Curso> findAllById(Long id);
    List<Curso> findAll(Long id);

    

}
