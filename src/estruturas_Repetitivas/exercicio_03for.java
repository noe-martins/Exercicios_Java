package estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] media = new double[N];
		
		for(int i=0; i<N; i++) {
			double teste1 = sc.nextDouble();
			double teste2 = sc.nextDouble();
			double teste3 = sc.nextDouble();
			
			media[i] = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0)/10.0;
			
		}
		
		for(double m : media) {
			System.out.printf("%.1f\n", m);
		}
		
		sc.close();
		
	}

}
