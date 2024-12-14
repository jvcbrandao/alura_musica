package com.joaobrandao.alura_musica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AluraMusicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraMusicaApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		var opcao =-1;

		while (opcao!=0){

			System.out.println("""
					Escolha a opção desejada!
					
					1 - Cadastrar artista
					2 - Cadastrar música
					3 - Listar músicas
					4 - Buscar músicas por artista
					5 - Pesquisar dados sobre um artista
								
					0 - Sair
					""");

			opcao = scanner.nextInt();
		}
		scanner.close();
	}

}
