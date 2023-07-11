package estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double IR;

        if (valor <= 2000.00) {
            IR = 0.0;
        } else if (valor <= 3000.00) {
            IR = (valor - 2000.00) * 0.08;
        } else if (valor <= 4500.00) {
            IR = (1000.00 * 0.08) + ((valor - 3000.00) * 0.18);
        } else {
            IR = (1000.00 * 0.08) + (1500.00 * 0.18) + ((valor - 4500.00) * 0.28);
        }
        
        if (IR > 0.0) {
            System.out.printf("R$ %.2f", IR);
        } else {
            System.out.println("Isento");
        }
		
        sc.close();

	}

}
