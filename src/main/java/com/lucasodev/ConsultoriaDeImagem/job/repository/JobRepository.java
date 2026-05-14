package com.lucasodev.ConsultoriaDeImagem.job.repository;

import com.lucasodev.ConsultoriaDeImagem.job.model.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
