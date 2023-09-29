package br.com.uanderson.course.endpoint.service;

import br.com.uanderson.course.model.Course;
import br.com.uanderson.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> listAllPageable(Pageable pageable){
        log.info("Listing all courses . . . . . ");
        return courseRepository.findAll(pageable);
    }
}
/*
    @RequiredArgsConstructor: Gera um constructor com
    todos os atributos finais declarados na class.

    onConstructor = @__(@Autowired): Esta parte da configuração indica que
    a anotação @Autowired deve ser adicionada ao construtor gerado pelo Lombok.
    Isso significa que o construtor gerado será anotado com @Autowired,
    permitindo que o Spring injete automaticamente as dependências necessárias
     quando uma instância da classe for criada.
 */