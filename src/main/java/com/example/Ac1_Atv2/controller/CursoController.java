package com.example.Ac1_Atv2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ac1_Atv2.model.Agenda;
import com.example.Ac1_Atv2.model.Curso;
import com.example.Ac1_Atv2.model.Especializacao;
import com.example.Ac1_Atv2.model.Professor;
import com.example.Ac1_Atv2.repository.CursoRepository;
import com.example.Ac1_Atv2.repository.EspecializacaoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;
    private EspecializacaoRepository especializacaoRepository;

    @GetMapping
    public List<Curso> ListaCurso(){
       return cursoRepository.findAll();
    }

    @GetMapping("/{id}")
    public List<Curso> ListaCurso(@PathVariable Long id){
       return cursoRepository.findAllById(id);
    }
    
    @PostMapping
    public Curso inserirCurso(@RequestBody Curso curso){
       return cursoRepository.save(curso);
    }

    @PutMapping("/alterar")
    public Curso editarCurso(@RequestBody Curso curso){
       return cursoRepository.save(curso);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarCurso(@PathVariable Long id){
        cursoRepository.deleteById(id);
    }

    @GetMapping("/professoresPorCurso")
    public List<Professor> ExibirProfessor(@RequestBody Especializacao curso){
         return especializacaoRepository.findProfessores(curso);
    }

    @GetMapping("/cursoPorAgenda")
    public List<Agenda> ExibirAgenda(@RequestBody Especializacao horarios){
       return especializacaoRepository.findAgendas(horarios);
    }

}
