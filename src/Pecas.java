import java.util.Locale;
import java.util.Scanner;

public class Pecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroDePecas1;
		double valorUnitario1;
		int codigoPeca2, numeroDePecas2;
		double valorUnitario2;
		
		codigoPeca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		double total = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);

	
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		sc.close();
	}

}
