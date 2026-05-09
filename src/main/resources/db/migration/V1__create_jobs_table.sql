CREATE TABLE IF NOT EXISTS jobs(
    id UUID PRIMARY KEY,
    status VARCHAR(20) CHECK (status IN ('PENDING','PROCESSING', 'DONE', 'FAILED')),
    image_url TEXT NOT NULL,
    measurements JSONB,
    result JSONB,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);