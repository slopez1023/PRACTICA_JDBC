package org.example.MODELS;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PRODUCTO {



        private Long id;
        private String nombre;
        private double precio;
        private LocalDate fechaRegistro;

    }


