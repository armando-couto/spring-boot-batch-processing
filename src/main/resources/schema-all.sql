-- Table: people

DROP TABLE people;

CREATE TABLE people
(
  person_id integer NOT NULL,
  first_name character varying(20),
  last_name character varying(20),
  CONSTRAINT person_id PRIMARY KEY (person_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE people
  OWNER TO postgres;
