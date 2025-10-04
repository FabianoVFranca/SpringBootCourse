package io.github.aprendizado.curso.repository;

import io.github.aprendizado.curso.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
