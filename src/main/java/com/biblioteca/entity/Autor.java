package com.biblioteca.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class Autor extends Base {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
}
