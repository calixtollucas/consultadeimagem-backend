package com.lucasodev.ConsultoriaDeImagem.job.controller;

import com.lucasodev.ConsultoriaDeImagem.job.dto.AnalysisRequestDTO;
import com.lucasodev.ConsultoriaDeImagem.job.dto.JobResultDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @PostMapping("/analyze")
    public ResponseEntity<JobResultDTO> analyze(AnalysisRequestDTO analysisRequest) {
        //inicia job no banco
        //chama processamento
        //retorna ao usuario
        return ResponseEntity.ok(null);
    }
}
