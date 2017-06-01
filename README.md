# kcp
docker pull postgres
docker run --name kcpdb1 -e POSTGRES_PASSWORD=kiran -p 32768:5432 -d postgres

CREATE TABLE public.business
(
    business_id text COLLATE pg_catalog."default" NOT NULL,
    business_name text COLLATE pg_catalog."default" NOT NULL,
    business_type text COLLATE pg_catalog."default",
    CONSTRAINT businessid_pk PRIMARY KEY (business_id)
)

    
INSERT INTO business (business_id, business_name, business_type) VALUES ('1', 'cat', 'Large')

CREATE TABLE public.address
(
    address_id text COLLATE pg_catalog."default" NOT NULL,
    city text COLLATE pg_catalog."default" NOT NULL,
    state text COLLATE pg_catalog."default",
    business_id text COLLATE pg_catalog."default",
    CONSTRAINT address_id_pk PRIMARY KEY (address_id),
    CONSTRAINT "business_id_FK" FOREIGN KEY (business_id)
        REFERENCES public.business (business_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

INSERT INTO address (address_id, city, state, business_id) VALUES ('20', 'Wilmington', 'DE', 1)
INSERT INTO address (address_id, city, state, business_id)  VALUES ('21', 'Mooresville', 'NC', 1)

mvn clean
mvn -U install
mvn eclipse:eclipse





