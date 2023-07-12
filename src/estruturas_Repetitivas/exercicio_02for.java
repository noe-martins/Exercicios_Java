package estruturas_Repetitivas;

import java.util.Scanner;

public class exercicio_02for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in = 0, out = 0;
		
		int N = sc.nextInt();
		
		for(int x=0; x<N; x++) {
			int valor = sc.nextInt();
			if(valor >= 10 && valor <= 20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.println(+ in + " in\n" + out + " out");
		
		sc.close();
		
	}

}
