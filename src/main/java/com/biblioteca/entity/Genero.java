package com.biblioteca.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class Genero extends Base {
    private String nombre;
    private String descripcion;
}
