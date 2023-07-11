package exercicios_secao4;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		System.out.println("DIFERENCA = " + ((A*B)-(C*D)));
		
		sc.close();

	}

}
