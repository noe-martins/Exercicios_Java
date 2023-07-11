import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y =32;
		double x = 10.3578;
		//Com quebra de linha
		System.out.println("Olá mundo!");
		System.out.println(y);
		System.out.println(x);
		//Com quebra de linha
		System.out.println("Olá mundo!");
		//Smem quebra de linha. Mesma sintaxe do "C"
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", x);

	}

}
