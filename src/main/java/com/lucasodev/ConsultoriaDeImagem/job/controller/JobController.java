package com.lucasodev.ConsultoriaDeImagem.job.controller;

import com.lucasodev.ConsultoriaDeImagem.job.dto.AnalysisRequestDTO;
import com.lucasodev.ConsultoriaDeImagem.job.dto.JobResultDTO;
import com.lucasodev.ConsultoriaDeImagem.job.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    private JobService jobService;

    public JobController() {}

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/analyze")
    public ResponseEntity<JobResultDTO> analyze(AnalysisRequestDTO analysisRequest) {
        //inicia job
        JobResultDTO jobResult = jobService.processJob(analysisRequest);
        //retorna ao usuario
        return ResponseEntity.ok(jobResult);
    }
}
