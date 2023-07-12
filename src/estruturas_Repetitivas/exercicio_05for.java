package estruturas_Repetitivas;

import java.util.Scanner;

public class exercicio_05for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fat = 1;
		
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			fat *=  i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
	
}