package com.example.Ac1_Atv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Especializacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    
    @ManyToOne
    @JoinColumn(name = "Professores_id")
    private Professor professor;


     @ManyToOne
     @JoinColumn(name = "Cursos_id")
     private Curso curso;

}