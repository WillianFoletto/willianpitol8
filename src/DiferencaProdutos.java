import java.util.Scanner;

public class DiferencaProdutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		int DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		
		
		sc.close();
		

	}

}
