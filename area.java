package br.uni.formas.circulos;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class area {

	@SuppressWarnings("resource")
	public static void main(String [] args) {
		//Calcular a area do circulo
		//Area = 2 * PI * R.
		
		System.out.println("Escreva o valor do raio");
		Scanner scan = new Scanner(System.in);

	       double raio = scan.nextFloat();
	       double area = Math.PI * (Math.pow(raio, 2));
	       
	       //Calcula o valor informado do raio e eleva a 2 depois multiplica por PI

	       System.out.println("O valor da area do círculo é " + area);
	       
	}

}