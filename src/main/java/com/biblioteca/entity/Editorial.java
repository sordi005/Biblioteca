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
public class Editorial extends Base{
    private String nombre;
    private String sitioWeb;
    private Direccion direccion;
}
