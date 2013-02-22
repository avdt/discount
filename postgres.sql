-- SQL Manager Lite for PostgreSQL 5.2.0.3
-- ---------------------------------------
-- Host      : localhost
-- Database  : postgres
-- Version   : PostgreSQL 9.1.3, compiled by Visual C++ build 1500, 64-bit



SET check_function_bodies = false;
--
-- Definition for sequence client_id_seq (OID = 16394) :
--
SET search_path = public, pg_catalog;
CREATE SEQUENCE public.client_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence comment_id_seq (OID = 16396) :
--
CREATE SEQUENCE public.comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence product_id_seq (OID = 16398) :
--
CREATE SEQUENCE public.product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence product_category_id_seq (OID = 16400) :
--
CREATE SEQUENCE public.product_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence product_settings_id_seq (OID = 16402) :
--
CREATE SEQUENCE public.product_settings_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence user_id_seq (OID = 16404) :
--
CREATE SEQUENCE public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence user_role_id_seq (OID = 16406) :
--
CREATE SEQUENCE public.user_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Structure for table client (OID = 16408) :
--
CREATE TABLE public.client (
    id integer NOT NULL,
    name char(50),
    type char(50)
)
WITH (oids = false);
--
-- Structure for table role (OID = 16413) :
--
CREATE TABLE public.role (
    id integer NOT NULL,
    role char(50)
)
WITH (oids = false);
--
-- Structure for table user (OID = 16426) :
--
CREATE TABLE public."user" (
    id integer NOT NULL,
    login char(50) NOT NULL,
    password char(50) NOT NULL,
    email char(50) NOT NULL,
    "firstName" char(50),
    "lastName" char(50)
)
WITH (oids = false);
--
-- Structure for table productCategory (OID = 16431) :
--
CREATE TABLE public."productCategory" (
    id integer NOT NULL,
    name char(50),
    settings char(1)[]
)
WITH (oids = false);
--
-- Structure for table product (OID = 16439) :
--
CREATE TABLE public.product (
    id integer NOT NULL,
    "clientId" integer,
    "productCategoryId" integer,
    name char(50),
    "longDescription" char(1000),
    "shortDescription" char(100),
    "initialPrice" integer,
    "discountPrice" integer,
    discount integer,
    "beginShowDate" date,
    "endShowDate" date
)
WITH (oids = false);
--
-- Structure for table comment (OID = 16457) :
--
CREATE TABLE public.comment (
    id integer NOT NULL,
    "userId" integer,
    "productId" integer,
    content char(1000)
)
WITH (oids = false);
--
-- Structure for table productSettings (OID = 16475) :
--
CREATE TABLE public."productSettings" (
    id integer NOT NULL,
    "productId" integer,
    "propertyName" char(50),
    "propertyValue" char(50)
)
WITH (oids = false);
--
-- Structure for table user_role (OID = 16485) :
--
CREATE TABLE public.user_role (
    "userId" integer,
    "roleId" integer
)
WITH (oids = false);
--
-- Definition for index client_pkey (OID = 16411) :
--
ALTER TABLE ONLY client
    ADD CONSTRAINT client_pkey
    PRIMARY KEY (id);
--
-- Definition for index role_pkey (OID = 16416) :
--
ALTER TABLE ONLY role
    ADD CONSTRAINT role_pkey
    PRIMARY KEY (id);
--
-- Definition for index user_pkey (OID = 16429) :
--
ALTER TABLE ONLY "user"
    ADD CONSTRAINT user_pkey
    PRIMARY KEY (id);
--
-- Definition for index productCategory_pkey (OID = 16437) :
--
ALTER TABLE ONLY "productCategory"
    ADD CONSTRAINT "productCategory_pkey"
    PRIMARY KEY (id);
--
-- Definition for index product_pkey (OID = 16445) :
--
ALTER TABLE ONLY product
    ADD CONSTRAINT product_pkey
    PRIMARY KEY (id);
--
-- Definition for index product_clientId_fkey (OID = 16447) :
--
ALTER TABLE ONLY product
    ADD CONSTRAINT "product_clientId_fkey"
    FOREIGN KEY ("clientId") REFERENCES client(id);
--
-- Definition for index product_productCategoryId_fkey (OID = 16452) :
--
ALTER TABLE ONLY product
    ADD CONSTRAINT "product_productCategoryId_fkey"
    FOREIGN KEY ("productCategoryId") REFERENCES "productCategory"(id);
--
-- Definition for index comment_pkey (OID = 16463) :
--
ALTER TABLE ONLY comment
    ADD CONSTRAINT comment_pkey
    PRIMARY KEY (id);
--
-- Definition for index comment_productId_fkey (OID = 16465) :
--
ALTER TABLE ONLY comment
    ADD CONSTRAINT "comment_productId_fkey"
    FOREIGN KEY ("productId") REFERENCES product(id);
--
-- Definition for index comment_userId_fkey (OID = 16470) :
--
ALTER TABLE ONLY comment
    ADD CONSTRAINT "comment_userId_fkey"
    FOREIGN KEY ("userId") REFERENCES "user"(id);
--
-- Definition for index productSettings_pkey (OID = 16478) :
--
ALTER TABLE ONLY "productSettings"
    ADD CONSTRAINT "productSettings_pkey"
    PRIMARY KEY (id);
--
-- Definition for index productSettings_productId_fkey (OID = 16480) :
--
ALTER TABLE ONLY "productSettings"
    ADD CONSTRAINT "productSettings_productId_fkey"
    FOREIGN KEY ("productId") REFERENCES product(id);
--
-- Definition for index user_role_userId_fkey (OID = 16488) :
--
ALTER TABLE ONLY user_role
    ADD CONSTRAINT "user_role_userId_fkey"
    FOREIGN KEY ("userId") REFERENCES "user"(id);
--
-- Definition for index user_role_roleId_fkey (OID = 16493) :
--
ALTER TABLE ONLY user_role
    ADD CONSTRAINT "user_role_roleId_fkey"
    FOREIGN KEY ("roleId") REFERENCES role(id);
--
-- Data for sequence public.client_id_seq (OID = 16394)
--
SELECT pg_catalog.setval('client_id_seq', 1, false);
--
-- Data for sequence public.comment_id_seq (OID = 16396)
--
SELECT pg_catalog.setval('comment_id_seq', 1, false);
--
-- Data for sequence public.product_id_seq (OID = 16398)
--
SELECT pg_catalog.setval('product_id_seq', 1, false);
--
-- Data for sequence public.product_category_id_seq (OID = 16400)
--
SELECT pg_catalog.setval('product_category_id_seq', 1, false);
--
-- Data for sequence public.product_settings_id_seq (OID = 16402)
--
SELECT pg_catalog.setval('product_settings_id_seq', 1, false);
--
-- Data for sequence public.user_id_seq (OID = 16404)
--
SELECT pg_catalog.setval('user_id_seq', 1, false);
--
-- Data for sequence public.user_role_id_seq (OID = 16406)
--
SELECT pg_catalog.setval('user_role_id_seq', 1, false);
--
-- Comments
--
COMMENT ON SCHEMA public IS 'standard public schema';
S