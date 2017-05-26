# kcp

-- Table: public.business

-- DROP TABLE public.business;

CREATE TABLE public.business
(
    id text COLLATE pg_catalog."default" NOT NULL,
    businessname text COLLATE pg_catalog."default" NOT NULL,
    businesstype text COLLATE pg_catalog."default"
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.business
    OWNER to kiran;
    
    
    
INSERT INTO business (id, businessName, businessType) VALUES ('2', 'cat', 'Large');




CREATE TABLE public.address ( id text COLLATE pg_catalog."default" NOT NULL, city text COLLATE pg_catalog."default" NOT NULL, state text COLLATE pg_catalog."default" ) WITH ( OIDS = FALSE ) TABLESPACE pg_default;

INSERT INTO address (id, city, state, businessid) VALUES ('20', 'Wilmington', 'DE', 2);
INSERT INTO address (id, city, state, businessid) VALUES ('21', 'Mooresville', 'NC', 2);
