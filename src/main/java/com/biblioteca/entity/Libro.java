package com.biblioteca.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class Libro  extends Base {
    private String isbn;
    @ToString.Exclude
    private List<Autor> autores;
    private Editorial editorial;
}
