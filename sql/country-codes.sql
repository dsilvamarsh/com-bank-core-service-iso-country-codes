DROP TABLE  DEV.country_codes;
CREATE  TABLE dev.country_codes
(
    name character varying NOT NULL UNIQUE,
    code2 character varying(2) NOT NULL ,
    code3 character varying(3) NOT NULL UNIQUE,
    country_code integer NOT NULL UNIQUE,
    region character varying ,
    sub_region character varying ,
    intermediate_region character varying,
    region_code integer,
    sub_region_code integer,
    intermediate_region_code integer,
    PRIMARY KEY (code2)
)

TABLESPACE dev;

ALTER TABLE IF EXISTS dev.country_codes
    OWNER to dev;

COMMENT ON TABLE dev.country_codes
    IS 'ISO 3166
COUNTRY CODES';
