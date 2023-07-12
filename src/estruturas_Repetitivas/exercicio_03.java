package estruturas_Repetitivas;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int combustivel = sc.nextInt();
		
		
		while(combustivel != 4) {
			switch(combustivel) {
			
				case 1:
					alcool++;
				break;
				
				case 2:
					gasolina++;
				break;
				
				case 3:
					diesel++;
				break;
				
			}
			
			combustivel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel + "\n");
		
		sc.close();
		
	}

}
