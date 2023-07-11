package estrutura_Condicional;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int time = 0;
		
		if(h1 > h2) {
			time = ((h2 + 24) - h1);
		}else if (h1 < h2){
			time = h2 - h1;
			
		}else{
			time = 	24;
		}
				
		System.out.println("O JOGO DUROU " + time + " HORA(S)");

	}

}
