package com.lucasodev.ConsultoriaDeImagem.job.service;

import com.lucasodev.ConsultoriaDeImagem.analysis.dto.BiotypeResult;
import com.lucasodev.ConsultoriaDeImagem.analysis.service.BiotypeAnalyzer;
import com.lucasodev.ConsultoriaDeImagem.job.dto.AnalysisRequestDTO;
import com.lucasodev.ConsultoriaDeImagem.job.dto.CreateJobDTO;
import com.lucasodev.ConsultoriaDeImagem.job.dto.JobResultDTO;
import com.lucasodev.ConsultoriaDeImagem.job.model.JobEntity;
import com.lucasodev.ConsultoriaDeImagem.job.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private JobRepository jobRepository;
    //private AnalysisService analysisService;

    public JobResultDTO processJob(AnalysisRequestDTO analysisRequest) {
        //inicia job no banco de dados
        this.createJob(new CreateJobDTO(
                analysisRequest.shoulderWidth(),
                analysisRequest.waistSize(),
                analysisRequest.hipSize(),
                analysisRequest.chest(),
                "example.com/image.jpeg"));
        //chama processamento
        BiotypeResult biotypeResult = BiotypeAnalyzer.analyze(
                analysisRequest.shoulderWidth(),
                analysisRequest.waistSize(),
                analysisRequest.hipSize(),
                analysisRequest.chest());
        //retorna resposta
        return new JobResultDTO(
                biotypeResult.biotype(),
                biotypeResult.description()
                );
    }

    public void createJob(CreateJobDTO createJobDto) {
        JobEntity jobEntity = JobEntity.createJob(createJobDto.imageUrl(), createJobDto.shoulderWidth(),
                createJobDto.hipSize(), createJobDto.waistSize(), createJobDto.chest());

        jobRepository.save(jobEntity);
    }
}
