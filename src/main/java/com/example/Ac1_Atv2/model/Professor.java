package com.example.Ac1_Atv2.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(length = 200, nullable = false)
    private String nome, cpf, rg, endereco, celular;

    
    @OneToMany(mappedBy = "professores")
    List<Agenda> agendas;

    @OneToMany(mappedBy = "professor")
    List<Especializacao> especializacao;


}
