CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS gehStofe;
CREATE TABLE gehStofe(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    verwendung VARCHAR(50),
    heizwert NUMERIC(15,2),
    massenstrom NUMERIC(15,2),
    betribes BOOLEAN,
    grund VARCHAR(250)
);

DROP TABLE IF EXISTS gehBrenstofe;
CREATE TABLE gehBrenstofe(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    stoffNr VARCHAR(50),
    aggr VARCHAR(15),
    dichte NUMERIC(15,2),
    eins NUMERIC(15,2),
    energ NUMERIC(15,2),
    heizwert NUMERIC(15,2),
    sgehalt NUMERIC(15,2),
    kgehalt NUMERIC(15,2),
    mass NUMERIC(15,2),
    betribes BOOLEAN,
    grund VARCHAR(250)
);

DROP TABLE IF EXISTS tierhaltung;
CREATE TABLE tierhaltung(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    stoffNr VARCHAR(50),
    aTiere NUMERIC(15,2),
    mMasseTier NUMERIC(15,2),
    gvon NUMERIC(15,2),
    gbiz NUMERIC(15,2),
    tMass NUMERIC(15,2),
    betribes BOOLEAN,
    grund VARCHAR(250)
);

DROP TABLE IF EXISTS tierhaltung;
CREATE TABLE tierhaltung(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    stoffNr VARCHAR(50),
    aTiere NUMERIC(15,2),
    mMasseTier NUMERIC(15,2),
    gvon NUMERIC(15,2),
    gbiz NUMERIC(15,2),
    tMass NUMERIC(15,2),
    betribes BOOLEAN,
    grund VARCHAR(250)
);