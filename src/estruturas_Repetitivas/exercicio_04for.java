package estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] divisao = new double[N];
		char[] erro = new char[N];
		
		for(int i=0; i<N; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			if(n2 == 0) {
				erro[i] = 'A';
			}else {
				divisao[i] = n1/n2;
				erro[i] = 'B';
			}
		}
		
		for(int i=0; i<N; i++) {
			if(erro[i] == 'A') {
				System.out.println("divisao impossivel");
			}else {
				System.out.printf("%.1f\n", divisao[i]);
			}
			
		}
		
		sc.close();
	}
}