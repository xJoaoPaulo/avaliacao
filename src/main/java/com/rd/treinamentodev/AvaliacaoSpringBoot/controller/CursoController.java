package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.CursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class CursoController {

    private CursoService cursoService;

    public ResponseEntity gravar(@RequestBody CursoDTO cursoDTO){
        return cursoService.gravar(cursoDTO);
    }

}
