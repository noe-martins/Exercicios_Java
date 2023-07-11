package exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_1 = sc.nextInt();
		double valor_unit_1 = sc.nextDouble();
		
		int numero_2 = sc.nextInt();
		double valor_unit_2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", (numero_1*valor_unit_1) + (numero_2*valor_unit_2));
		
		sc.close();
		
	}
}
