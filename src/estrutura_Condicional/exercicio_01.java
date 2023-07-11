package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		String result = (number >= 0) ? "NAO NEGATIVO" : "NEGATIVO";
		
		System.out.println(result);

	}

}
