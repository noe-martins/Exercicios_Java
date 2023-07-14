package curso_programacao;

import java.util.Scanner;

public class Funcoes_Sintaxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	// public = Disponível em outras classes;
	// static = Pode ser chamada independente de se cria rum objeto
	// int = Tipo que a função vai retornar
	// max = Nome da função
	// () = Argumentos da função
	// (int) = Tipo do Argumento
	// (int x) = Nome do Argumento
	public static int max(int x, int y, int z) {
		
		int aux;
		
		if (x > y && x > z) {
		aux = x;
		} else if (y > z) {
		aux = y;
		} else {
		aux = z;
		}
		
		return aux;
		
	}
		
	public static void showResult(int value) {
		
		System.out.println("Higher = " + value);
	
	}
}
