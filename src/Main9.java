import java.util.Locale;
import java.util.Scanner;


public class Main9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nomeVendedor = sc.next();
		double salarioFixo = sc.nextDouble(); 
		double totalDeVendas = sc.nextDouble();
		
		double comissao = totalDeVendas * 0.15;
		double totalReceber = salarioFixo + comissao;
		
		System.out.printf("TOTAL = R$%.2f%n",totalReceber);
		
		sc.close();
		
		
		
		
		
		

	}

}
