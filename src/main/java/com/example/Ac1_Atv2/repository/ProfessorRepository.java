package com.example.Ac1_Atv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ac1_Atv2.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

    List<Professor> findAllById(Long id);

}
