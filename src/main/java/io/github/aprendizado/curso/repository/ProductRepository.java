package io.github.aprendizado.curso.repository;

import io.github.aprendizado.curso.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produto,String> {

}
