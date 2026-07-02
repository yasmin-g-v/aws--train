package com.treinamento.aws_train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Diz ao Spring que esta classe vai responder requisições HTTP
public class AwsTrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsTrainApplication.class, args);
	}

	@GetMapping("/hello") // Define que o caminho para acessar será /hello
	public String helloWorld() {
		return "Hello World! Minha API no Spring Boot funcionou! 🚀";
	}
	@GetMapping("/amiga")
	public String mensagemAmiga() {
		return "Te amo amiga, você é muito importante pra mim! ❤️";
	}

}
