package estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco = 0.0;
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		switch(codigo){
			case 1:
				preco = 4.00;
				System.out.printf("Total: R$ %.2f", (quantidade*preco));
			break;
			case 2:
				preco = 4.50;
				System.out.printf("Total: R$ %.2f", (quantidade*preco));
			break;
			case 3:
				preco = 5.00;
				System.out.printf("Total: R$ %.2f", (quantidade*preco));
			break;
			case 4:
				preco = 2.00;
				System.out.printf("Total: R$ %.2f", (quantidade*preco));
			break;
			case 5:
				preco = 1.50;
				System.out.printf("Total: R$ %.2f", (quantidade*preco));
			break;
			
			default:
				System.out.println("Essa opção não existe!");
			break;
		}
		
		sc.close();
	}

}
