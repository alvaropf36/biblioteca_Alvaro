package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data //Evita definir getter y setters
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "libro")
    public class Libro{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Se genera de forma automatica
        private Long id; //Clave principal

        @Column(nullable = false) //Al ponerlo a posterior, hay que modificar la propiedad
        private String titulo;

        @Column
        private String autor;
    }
