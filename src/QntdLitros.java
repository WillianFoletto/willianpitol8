import java.util.Locale;
import java.util.Scanner;

public class QntdLitros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto, velocidadeMedia;
		
		tempoGasto = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		double quantidadeDeLitros = (tempoGasto * velocidadeMedia) / 12.0;
		
		System.out.printf("%.3f%n", quantidadeDeLitros);
		
		
		sc.close();
		

	}

}
