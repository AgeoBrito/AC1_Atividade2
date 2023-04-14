package com.example.Ac1_Atv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ac1_Atv2.model.Agenda;
import com.example.Ac1_Atv2.model.Especializacao;
import com.example.Ac1_Atv2.model.Professor;


public interface EspecializacaoRepository extends JpaRepository<Especializacao, Long>{

    List<Especializacao> findAllById(Long id);
    List<Professor> findProfessores(Especializacao professor);
    List<Agenda> findAgendas(Especializacao horarios);
}