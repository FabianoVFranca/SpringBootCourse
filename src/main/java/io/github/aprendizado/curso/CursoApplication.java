package io.github.aprendizado.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CursoApplication {

	public static void main(String[] args) {

        SpringApplication.run(CursoApplication.class, args
        );
	}
    //sempre que voce fizer a chamada via get do GetMapping para essa url vai receber a mensagem
    @GetMapping("/hello-world")
    public String hello(){
        return "Hello World, this is my first test";
    }
    @GetMapping("/ingrid")
    public String ingrid(){
        return "OI amor,amo muito voce, tomara que de certo";
    }
}
