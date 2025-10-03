package io.github.aprendizado.curso.controller;

import io.github.aprendizado.curso.model.Produto;
import io.github.aprendizado.curso.repository.ProductRepository;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RequestMapping("products")
@RestController
public class ProdutoController {
    private ProductRepository productRepository;
    @PostMapping
    public void saveProduct(@RequestBody Produto produto){
        System.out.println("Product recieved" + produto);
        String id_product = UUID.randomUUID().toString();
        produto.setId(id_product);
        productRepository.save(produto);
    }

    public void ProductRepository(ProductRepository productRepository){
        this.productRepository= productRepository;
    }
}
