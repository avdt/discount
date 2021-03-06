-- SQL Manager Lite for PostgreSQL 5.2.0.3
-- ---------------------------------------
-- Host      : localhost
-- Database  : discount
-- Version   : PostgreSQL 9.1.3, compiled by Visual C++ build 1500, 64-bit



SET check_function_bodies = false;
--
-- Definition for sequence client_id_seq (OID = 24682) :
--
SET search_path = public, pg_catalog;
CREATE SEQUENCE public.client_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence comment_id_seq (OID = 24684) :
--
CREATE SEQUENCE public.comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence product_id_seq (OID = 24686) :
--
CREATE SEQUENCE public.product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence product_category_id_seq (OID = 24688) :
--
CREATE SEQUENCE public.product_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence product_settings_id_seq (OID = 24690) :
--
CREATE SEQUENCE public.product_settings_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence user_id_seq (OID = 24692) :
--
CREATE SEQUENCE public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence user_role_id_seq (OID = 24694) :
--
CREATE SEQUENCE public.user_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Structure for table client (OID = 24696) :
--
CREATE TABLE public.client (
    id integer NOT NULL,
    name text,
    type text
)
WITH (oids = false);
--
-- Structure for table role (OID = 24699) :
--
CREATE TABLE public.role (
    id integer NOT NULL,
    role text
)
WITH (oids = false);
--
-- Structure for table user (OID = 24702) :
--
CREATE TABLE public."user" (
    id integer NOT NULL,
    login text,
    password text,
    email text,
    "firstName" text,
    "lastName" text
)
WITH (oids = false);
--
-- Structure for table productCategory (OID = 24705) :
--
CREATE TABLE public."productCategory" (
    id integer NOT NULL,
    name text,
    settings text[]
)
WITH (oids = false);
--
-- Structure for table product (OID = 24711) :
--
CREATE TABLE public.product (
    id integer NOT NULL,
    "clientId" integer,
    "productCategoryId" integer,
    name text,
    "longDescription" text,
    "shortDescription" text,
    "initialPrice" integer,
    "discountPrice" integer,
    discount integer,
    "beginShowDate" date,
    "endShowDate" date
)
WITH (oids = false);
--
-- Structure for table comment (OID = 24717) :
--
CREATE TABLE public.comment (
    id integer NOT NULL,
    "userId" integer,
    "productId" integer,
    content text
)
WITH (oids = false);
--
-- Structure for table productSettings (OID = 24723) :
--
CREATE TABLE public."productSettings" (
    id integer NOT NULL,
    "productId" integer,
    "propertyName" text,
    "propertyValue" text
)
WITH (oids = false);
--
-- Structure for table user_role (OID = 24726) :
--
CREATE TABLE public.user_role (
    "userId" integer,
    "roleId" integer
)
WITH (oids = false);
--
-- Data for table public.client (OID = 24696) (LIMIT 0,5)
--
INSERT INTO client (id, name, type)
VALUES (2000, 'Updated name', 'golden');

INSERT INTO client (id, name, type)
VALUES (2150, 'Updated name', 'golden');

INSERT INTO client (id, name, type)
VALUES (2250, 'Updated name', 'golden');

INSERT INTO client (id, name, type)
VALUES (2350, 'Updated name', 'golden');

INSERT INTO client (id, name, type)
VALUES (2450, 'Updated name', 'golden');

--
-- Data for table public.role (OID = 24699) (LIMIT 0,2)
--
INSERT INTO role (id, role)
VALUES (1, 'admin');

INSERT INTO role (id, role)
VALUES (2, 'user');

--
-- Data for table public."user" (OID = 24702) (LIMIT 0,7)
--
INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2350, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2400, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2450, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2500, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2550, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2700, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

INSERT INTO "user" (id, login, password, email, "firstName", "lastName")
VALUES (2750, 'ssmith', 'password', 'test-email@example.com', 'Sem', 'Smith');

--
-- Data for table public."productCategory" (OID = 24705) (LIMIT 0,1)
--
INSERT INTO "productCategory" (id, name, settings)
VALUES (1, 'Laptop', NULL);

--
-- Data for table public.user_role (OID = 24726) (LIMIT 0,4)
--
INSERT INTO user_role ("userId", "roleId")
VALUES (2350, 2);

INSERT INTO user_role ("userId", "roleId")
VALUES (2400, 2);

INSERT INTO user_role ("userId", "roleId")
VALUES (2450, 2);

INSERT INTO user_role ("userId", "roleId")
VALUES (2500, 2);

--
-- Definition for index client_pkey (OID = 24729) :
--
ALTER TABLE ONLY client
    ADD CONSTRAINT client_pkey
    PRIMARY KEY (id);
--
-- Definition for index role_pkey (OID = 24731) :
--
ALTER TABLE ONLY role
    ADD CONSTRAINT role_pkey
    PRIMARY KEY (id);
--
-- Definition for index user_pkey (OID = 24733) :
--
ALTER TABLE ONLY "user"
    ADD CONSTRAINT user_pkey
    PRIMARY KEY (id);
--
-- Definition for index productCategory_pkey (OID = 24735) :
--
ALTER TABLE ONLY "productCategory"
    ADD CONSTRAINT "productCategory_pkey"
    PRIMARY KEY (id);
--
-- Definition for index product_pkey (OID = 24737) :
--
ALTER TABLE ONLY product
    ADD CONSTRAINT product_pkey
    PRIMARY KEY (id);
--
-- Definition for index product_clientId_fkey (OID = 24739) :
--
ALTER TABLE ONLY product
    ADD CONSTRAINT "product_clientId_fkey"
    FOREIGN KEY ("clientId") REFERENCES client(id);
--
-- Definition for index product_productCategoryId_fkey (OID = 24744) :
--
ALTER TABLE ONLY product
    ADD CONSTRAINT "product_productCategoryId_fkey"
    FOREIGN KEY ("productCategoryId") REFERENCES "productCategory"(id);
--
-- Definition for index comment_pkey (OID = 24749) :
--
ALTER TABLE ONLY comment
    ADD CONSTRAINT comment_pkey
    PRIMARY KEY (id);
--
-- Definition for index comment_productId_fkey (OID = 24751) :
--
ALTER TABLE ONLY comment
    ADD CONSTRAINT "comment_productId_fkey"
    FOREIGN KEY ("productId") REFERENCES product(id);
--
-- Definition for index comment_userId_fkey (OID = 24756) :
--
ALTER TABLE ONLY comment
    ADD CONSTRAINT "comment_userId_fkey"
    FOREIGN KEY ("userId") REFERENCES "user"(id);
--
-- Definition for index productSettings_pkey (OID = 24761) :
--
ALTER TABLE ONLY "productSettings"
    ADD CONSTRAINT "productSettings_pkey"
    PRIMARY KEY (id);
--
-- Definition for index productSettings_productId_fkey (OID = 24763) :
--
ALTER TABLE ONLY "productSettings"
    ADD CONSTRAINT "productSettings_productId_fkey"
    FOREIGN KEY ("productId") REFERENCES product(id);
--
-- Definition for index user_role_userId_fkey (OID = 24768) :
--
ALTER TABLE ONLY user_role
    ADD CONSTRAINT "user_role_userId_fkey"
    FOREIGN KEY ("userId") REFERENCES "user"(id);
--
-- Definition for index user_role_roleId_fkey (OID = 24773) :
--
ALTER TABLE ONLY user_role
    ADD CONSTRAINT "user_role_roleId_fkey"
    FOREIGN KEY ("roleId") REFERENCES role(id);
--
-- Data for sequence public.client_id_seq (OID = 24682)
--
SELECT pg_catalog.setval('client_id_seq', 49, true);
--
-- Data for sequence public.comment_id_seq (OID = 24684)
--
SELECT pg_catalog.setval('comment_id_seq', 1, false);
--
-- Data for sequence public.product_id_seq (OID = 24686)
--
SELECT pg_catalog.setval('product_id_seq', 1, false);
--
-- Data for sequence public.product_category_id_seq (OID = 24688)
--
SELECT pg_catalog.setval('product_category_id_seq', 3, true);
--
-- Data for sequence public.product_settings_id_seq (OID = 24690)
--
SELECT pg_catalog.setval('product_settings_id_seq', 1, false);
--
-- Data for sequence public.user_id_seq (OID = 24692)
--
SELECT pg_catalog.setval('user_id_seq', 55, true);
--
-- Data for sequence public.user_role_id_seq (OID = 24694)
--
SELECT pg_catalog.setval('user_role_id_seq', 8, true);
--
-- Comments
--
COMMENT ON SCHEMA public IS 'standard public schema';
