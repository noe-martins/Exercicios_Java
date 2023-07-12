package estruturas_Repetitivas;

import java.util.Scanner;

public class exercicio_07for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=5; i++) {
			System.out.println(""+ i + " "+ (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}
		
		sc.close();
	}

}
