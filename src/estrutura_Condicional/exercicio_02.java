package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		String result = (number % 2 == 0) ? "PAR":"IMPAR";
		
		System.out.println(result);
	}

}
