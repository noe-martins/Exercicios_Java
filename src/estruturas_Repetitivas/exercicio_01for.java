package estruturas_Repetitivas;

import java.util.Scanner;

public class exercicio_01for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
