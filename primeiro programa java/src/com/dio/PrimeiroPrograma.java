package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		
		Livros livros = new Livros();
		
		/*int a = 2;
		int b = 1;
		System.out.println("Hello World!! " + 0(a+b));
		*/
		
		System.out.println(gato);
		System.out.println(livros);
		
	}
}

class Livros {
	private String nome;
	private String nPag;
}