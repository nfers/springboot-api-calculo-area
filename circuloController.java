package br.uni.formas.controller;


import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uni.formas.circulos.area;
import br.uni.formas.retangulos.area1;
import br.uni.formas.service.Service;

@RestController
@RequestMapping("/formas/retangulo/area1")
public class circuloController {
	
	@Autowired
	
	@GetMapping
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
