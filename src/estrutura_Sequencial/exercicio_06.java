package exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		
		System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);
		System.out.printf("CIRCULO: %.3f\n", (3.14159*C*C));
		System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f\n", (B*B));
		System.out.printf("RETANGULO: %.3f\n", (A*B));
		

	}

}
