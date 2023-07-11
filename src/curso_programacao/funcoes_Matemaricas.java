package curso_programacao;

public class funcoes_Matemaricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A = 0, B = 0, C = 0;
		
		//Método sqrt = Raíz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + z + " = " + C);
		System.out.printf("\n");
		
		//Método pow = Potenciação. Estrutura = Math.pow(Base, Potência)
		A = Math.pow(x, 2);
		B = Math.pow(y, 2);
		C = Math.pow(z, 2);
		System.out.println("O quadrado de " + x + " = " + A);
		System.out.println("O quadrado de " + y + " = " + B);
		System.out.println("O quadrado de " + z + " = " + C);
		System.out.printf("\n");
		
		//Método abs = Módulo de um número
		A = Math.abs(x);
		B = Math.abs(y);
		C = Math.abs(z);
		System.out.println("O módulo de " + x + " = " + A);
		System.out.println("O módulo de " + y + " = " + B);
		System.out.println("O módulo de " + z + " = " + C);

	}

}
