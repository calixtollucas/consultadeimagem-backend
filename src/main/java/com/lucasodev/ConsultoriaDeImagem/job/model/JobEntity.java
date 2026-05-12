package com.lucasodev.ConsultoriaDeImagem.job.model;

import com.lucasodev.ConsultoriaDeImagem.job.enums.JobStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "shoulder_width", nullable = false)
    private Double shoulderWidth;

    @Column(name = "waist_size", nullable = false)
    private Double waistSize;

    @Column(name = "hip_size", nullable = false)
    private Double hipSize;

    @Column(name = "chest", nullable = false)
    private Double chest;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "error_message")
    private String errorMessage;
}
