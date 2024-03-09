CREATE TABLE pessoa (
    id UUID PRIMARY KEY,
    nome VARCHAR(255),
    cpf VARCHAR(14),
    email VARCHAR(255)
);

CREATE TABLE funcao (
    cargoid UUID PRIMARY KEY,
    pessoaid UUID,
    codigo VARCHAR(255),
    descricao TEXT
);

CREATE TABLE cargo (
    id UUID PRIMARY KEY,
    codigo VARCHAR(255),
    descricao TEXT,
    pessoa_id UUID,
    FOREIGN KEY (pessoa_id) REFERENCES pessoa(id)
);
