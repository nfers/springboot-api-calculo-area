package br.uni.formas.retangulos;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;

import br.uni.formas.circulos.area;

public class area1 {
	
public static void main(String[]args) {
		
		double base, altura, area1;
		
		Scanner scan = new Scanner(System.in);
		   System.out.println("Informe a base:");
	       System.out.println("Informe a altura:");
	       
	       base = 5;
	       
	       altura = 22;
	      
	       area1 = base * altura;
	       
	       //Calcula o valor e altura * base
	       
	       
	       System.out.println("O valor da area do retangulo é " + area1);
		
	}

}