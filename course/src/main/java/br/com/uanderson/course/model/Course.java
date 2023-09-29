package br.com.uanderson.course.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor//Construtor sem argumentos
@AllArgsConstructor//Construtor com todos os abritubos
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Course implements AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include//Indica o(s) campo(s) que será usados na geração do EqualsAndHashCode será somente o 'id';
    private Long id;
    @NotNull(message = "The field 'title' is mandatory!!")
    @Column(nullable = false)
    private String title;
    @Override
    public Long getId() {
        return this.id;
    }
}
/*
 onlyExplicitlyIncluded = true: Esta parte da configuração indica
 que a geração automática de equals e hashCode deve levar em
 consideração apenas os campos que são explicitamente marcados com
 a anotação @EqualsAndHashCode.Include. Em outras palavras, apenas
 os campos anotados com @EqualsAndHashCode.Include ou @Include serão considerados
  para a igualdade e para gerar o código hashCode. Quaisquer outros
  campos da classe serão ignorados.
 */