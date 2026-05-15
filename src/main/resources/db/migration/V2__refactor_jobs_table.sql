DROP TABLE IF EXISTS jobs;
CREATE TABLE IF NOT EXISTS jobs(
    id UUID PRIMARY KEY,
    status VARCHAR(20) CHECK (status IN ('PENDING','PROCESSING', 'DONE', 'FAILED')),
    image_url TEXT NOT NULL,
    shoulder_width DECIMAL(5,2) NOT NULL,
    waist_size DECIMAL(5,2) NOT NULL,
    hip_size DECIMAL(5,2) NOT NULL,
    chest DECIMAL (5,2) NOT NULL,
    error_message TEXT,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);