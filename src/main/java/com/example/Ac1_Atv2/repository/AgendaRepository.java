package com.example.Ac1_Atv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ac1_Atv2.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    List<Agenda> findAllById(Long id);
}
