package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String testarAplicacao(){
        return "<html><body><h1><center>Projeto Inicial executando!!!<center></h1></body></html>";
    }
}
