package com.lucasodev.ConsultoriaDeImagem.job.dto;

public record AnalysisRequestDTO(
        String image_url,
        Double shoulderWidth,
        Double waistSize,
        Double hipSize,
        Double chest
) {
}
