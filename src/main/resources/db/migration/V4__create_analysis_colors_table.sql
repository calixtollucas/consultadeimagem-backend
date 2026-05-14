CREATE TABLE IF NOT EXISTS analysis_colors(
    id UUID PRIMARY KEY,
    result_id UUID NOT NULL,
    hex_code VARCHAR(6) NOT NULL,
    created_at TIMESTAMP DEFAULT NOW(),
    CONSTRAINT fk_analysis_result
    FOREIGN KEY (result_id)
    REFERENCES analysis_results(id)
    ON DELETE CASCADE
);