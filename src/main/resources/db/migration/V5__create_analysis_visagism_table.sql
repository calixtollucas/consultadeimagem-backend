CREATE TABLE IF NOT EXISTS analysis_visagism(
    id UUID PRIMARY KEY,
    result_id UUID NOT NULL,
    hair_suggestion TEXT NOT NULL,
    accessories_suggestion TEXT NOT NULL,
    style_suggestion TEXT NOT NULL,
    CONSTRAINT fk_analysis_visagism_result
    FOREIGN KEY (result_id)
    REFERENCES anlysis_results(id)
    ON DELETE CASCADE
);