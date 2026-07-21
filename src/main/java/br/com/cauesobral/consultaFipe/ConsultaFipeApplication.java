package br.com.cauesobral.consultaFipe;

import br.com.cauesobral.consultaFipe.principal.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Principal;

@SpringBootApplication
public class ConsultaFipeApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ConsultaFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main principal = new Main();
		principal.exibeMenu();
	}
}
