import java.util.Locale;
import java.util.Scanner;

public class MediaCombustivel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distanciaTotal;
		double combustivelGasto;
		
		distanciaTotal = sc.nextInt();
		combustivelGasto = sc.nextDouble();
		
		double media = (distanciaTotal / combustivelGasto);
		

		System.out.printf("%.3f km/l%n ", media);
		
		
		sc.close();

	}

}
