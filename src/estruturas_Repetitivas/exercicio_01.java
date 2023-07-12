package estruturas_Repetitivas;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int password = sc.nextInt();
		
		while(password != 2002) {
			System.out.println("Senha Invalida");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
