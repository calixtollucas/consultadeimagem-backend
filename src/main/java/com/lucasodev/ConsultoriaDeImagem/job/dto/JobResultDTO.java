package com.lucasodev.ConsultoriaDeImagem.job.dto;

import com.lucasodev.ConsultoriaDeImagem.analysis.dto.BiotypeResult;

public record JobResultDTO(
        String biotype,
        String biotypeDescription
){}
