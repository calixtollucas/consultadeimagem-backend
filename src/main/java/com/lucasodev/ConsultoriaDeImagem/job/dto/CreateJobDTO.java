package com.lucasodev.ConsultoriaDeImagem.job.dto;

import java.rmi.server.RMIClassLoader;

public record CreateJobDTO(
        Double shoulderWidth,
        Double waistSize,
        Double hipSize,
        Double chest,
        String imageUrl
) {
}
