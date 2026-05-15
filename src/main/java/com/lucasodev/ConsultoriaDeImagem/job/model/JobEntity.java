package com.lucasodev.ConsultoriaDeImagem.job.model;

import com.lucasodev.ConsultoriaDeImagem.job.enums.JobStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "jobs")
public class JobEntity {

    protected JobEntity() {}
    private JobEntity(UUID id,
                      JobStatus status,
                      String imageUrl,
                      Double shoulderWidth,
                      Double hipSize,
                      Double waistSize,
                      Double chest,
                      LocalDateTime createdAt,
                      LocalDateTime updatedAt) {
        this.id = id;
        this.status = status;
        this.imageUrl = imageUrl;
        this.shoulderWidth = shoulderWidth;
        this.hipSize = hipSize;
        this.waistSize = waistSize;
        this.chest = chest;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
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

    public static JobEntity createJob(String imageUrl, Double shoulderWidth,
                                      Double hipSize, Double waitSize,
                                      Double chest) {

        return new JobEntity(
                null,
                JobStatus.PROCESSING,
                imageUrl,
                shoulderWidth,
                hipSize,
                waitSize,
                chest,
                LocalDateTime.now(),
                null);
    }
}
