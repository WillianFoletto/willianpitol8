import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio");
		
	    double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * raio * raio;
		
		System.out.println("o raio digitado foi " + area);
		
		
		
		sc.close();
		

	}

}
