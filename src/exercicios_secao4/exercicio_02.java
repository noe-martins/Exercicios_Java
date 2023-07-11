package exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double raio = sc.nextDouble();
		
		System.out.printf("A=%.4f%n", 3.14159*(raio * raio));
		
		sc.close();
		 
	}

}
