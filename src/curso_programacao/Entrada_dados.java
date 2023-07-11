package curso_programacao;

import java.util.Scanner;

public class Entrada_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Associando objeto Scanner ao teclado no modo Console
		int y;
		String x;// Variável do tipo String
		double z;
		char n;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		n = sc.next().charAt(0);
				
		System.out.printf("Digite uma palavra: ");
		x = sc.next();// Faço a leitura e envio para variável x
		
		System.out.printf("Digite um inteiro: ");
		y = sc.nextInt();
		
		System.out.printf("Digite um double: ");
		z = sc.nextDouble();
		
		System.out.printf("Digite um caractere: ");
		n = sc.next().charAt(0);//.charAt() é uma função que pega o primeiro caractere
		
		System.out.println("Você digitou o nome: " + x);
		System.out.println("Você digitou o inteiro: " + y);
		System.out.printf("Você digitou o double: %.2f\n", z);//Com println não aparece a vírgula
		System.out.println("Você digitou o caractere: " + n);
		
		sc.close();
	}

}
