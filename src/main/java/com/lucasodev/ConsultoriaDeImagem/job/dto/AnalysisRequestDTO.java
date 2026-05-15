package com.lucasodev.ConsultoriaDeImagem.job.dto;

public record AnalysisRequestDTO(
        Double shoulderWidth,
        Double waistSize,
        Double hipSize,
        Double chest,
        String imageUrl
) {
}
