package exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hour_work = sc.nextInt();
		double pay_hour = sc.nextDouble();
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f\n", hour_work * pay_hour);
		
		sc.close();

	}

}
