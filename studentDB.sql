PGDMP     .    2                 {         	   studentDB    15.1    15.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                        0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    18846 	   studentDB    DATABASE     ?   CREATE DATABASE "studentDB" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE "studentDB";
                postgres    false                        2615    18847    school    SCHEMA        CREATE SCHEMA school;
    DROP SCHEMA school;
                postgres    false            ?            1259    18848    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            ?            1259    18849    student    TABLE     ?   CREATE TABLE public.student (
    id integer NOT NULL,
    course character varying(255),
    email character varying(255),
    first_name character varying(255),
    last_name character varying(255),
    gpa double precision
);
    DROP TABLE public.student;
       public         heap    postgres    false            ?            1259    18854    student_seq    SEQUENCE     u   CREATE SEQUENCE public.student_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.student_seq;
       public          postgres    false            ?            1259    18855    student_seq    SEQUENCE     t   CREATE SEQUENCE school.student_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE school.student_seq;
       school          postgres    false    6            ?          0    18849    student 
   TABLE DATA           P   COPY public.student (id, course, email, first_name, last_name, gpa) FROM stdin;
    public          postgres    false    216   Y                  0    0    hibernate_sequence    SEQUENCE SET     A   SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);
          public          postgres    false    215                       0    0    student_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.student_seq', 201, true);
          public          postgres    false    217                       0    0    student_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('school.student_seq', 1, false);
          school          postgres    false    218            i           2606    18857    student student_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.student DROP CONSTRAINT student_pkey;
       public            postgres    false    216            ?   D   x?340??M??/R??S?--?L?̭L?H??LN?qp?M???K???tO-J,J?,O??4?3?????? U?q     