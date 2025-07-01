package com.biblioteca.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder

public class Direccion extends Base {
    private String calle;
    private int numero;
    private String ciudad;
    private int codPostal;
}
