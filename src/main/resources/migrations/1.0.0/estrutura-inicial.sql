--liquibase formatted sql

--changeset fabricio.junior:1
CREATE TABLE APPLICATION.PRODUCTS(
    ID NUMERIC(19) NOT NULL,
    NAME VARCHAR(120) NOT NULL,
    CATEGORY VARCHAR(120),
    PRIMARY KEY(ID)
);
--rollback drop table `product`;