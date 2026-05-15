CREATE TABLE IF NOT EXISTS analysis_results(
    id UUID PRIMARY KEY,
    job_id UUID UNIQUE,
    biotype VARCHAR(50),
    skin_temperature VARCHAR(50) CHECK (skin_temperature IN ('WARM', 'NEUTRAL', 'COLD')),
    face_shape VARCHAR(50),
    image_prompt TEXT,
    created_at TIMESTAMP DEFAULT NOW(),
    CONSTRAINT fk_job
        FOREIGN KEY (job_id)
        REFERENCES jobs(id)
        ON DELETE CASCADE
);