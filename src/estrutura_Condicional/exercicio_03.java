package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			String result = (A % B == 0) ? "Sao Multiplos":"Nao sao Multiplos";
			System.out.println(result);
		}else{
			String result = (B % A == 0) ? "Sao Multiplos":"Nao sao Multiplos";
			System.out.println(result);
		}
	}
}
