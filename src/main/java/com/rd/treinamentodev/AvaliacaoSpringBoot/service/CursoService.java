package com.rd.treinamentodev.AvaliacaoSpringBoot.service;


import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.ResultData;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CursoService {

    private CursoRepository cursoRepository;

    public ResponseEntity gravar(CursoDTO cursoDTO) {
        CursoEntity curso = new CursoEntity();
        curso.setNomeCurso(cursoDTO.getNome());
        curso.setNrCargaHoraria(cursoDTO.getCargaHoraria());

        curso = cursoRepository.save(curso);

        ResultData resultData = new ResultData(HttpStatus.CREATED.value(), "Curso cadastrado com sucesso", curso.getIdCurso());
        return ResponseEntity.status(HttpStatus.CREATED).body(resultData);


    }

    public List<CursoEntity> buscarPorNome(String nome) {
        return cursoRepository.findByNome(nome);
    }
}
