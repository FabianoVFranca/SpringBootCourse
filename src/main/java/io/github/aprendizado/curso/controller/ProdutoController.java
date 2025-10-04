package io.github.aprendizado.curso.controller;

import io.github.aprendizado.curso.model.Product;
import io.github.aprendizado.curso.repository.ProductRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@RequestMapping("products")
@RestController
public class ProdutoController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        System.out.println("Product recieved" + product);
        String id_product = UUID.randomUUID().toString();
        product.setId(id_product);
        return productRepository.save(product);
    }

    public void ProductRepository(ProductRepository productRepository){
        this.productRepository= productRepository;
    }

    //http://localhost:8080/products/:{id} estructure to postman so that we can get a product in path value
    @GetMapping("{id}")
    public Product getById(@PathVariable("id") String id){
        //Optional<Product> productById = productRepository.findById(id);
        //return productById.isPresent() ? productById.get() : null;
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping
    public void deletById(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }
    @PutMapping
    public void refreshProduct(@PathVariable("id") String id,
                               @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);

    }
}
