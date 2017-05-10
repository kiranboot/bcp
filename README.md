# bcp

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
