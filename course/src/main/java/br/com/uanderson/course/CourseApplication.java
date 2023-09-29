package br.com.uanderson.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.uanderson.core.model"})// especificar quais pacotes queremos verificar para classes de entidade @Entity
@EnableJpaRepositories({"br.com.uanderson"})//O que que de cima, mas paar @Repository
public class CourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }
}

/*
@EntityScan- é uma anotação usada para especificar quais pacotes
o Spring deve verificar em busca de classes de entidade JPA (@Entity).
por isso que estamos indicando exatamente onde 'Course'
deve buscar em 'core' (br.com.uanderson.core.model) para pode reconhecer as nossas entidades

E da mesma forma que precisamos que course reconheca as entidades, precisamos
que ele também saiba quem são os nossos repositories por isso utilizamos
@EnableJpaRepositories({"br.com.uanderson"}) que é uma anotação usada para habilitar
 os repositórios (@Repository JPA do Spring Data informando o seu package.


 */