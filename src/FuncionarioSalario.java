import java.util.Locale;
import java.util.Scanner;

public class FuncionarioSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int horasTrabalhadas;
		double  valorHora, numeroFuncionario;
		
		numeroFuncionario = sc.nextDouble();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = U$ %.2f%n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
		
		
	
		
	
		

	}

}
