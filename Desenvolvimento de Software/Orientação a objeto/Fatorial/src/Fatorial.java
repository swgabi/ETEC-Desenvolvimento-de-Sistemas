import java.util.Scanner;
public class Fatorial {
	
	public int fatorial(int a) {
		int f = 1;
		
		for (int i = 1; i <= a; i++) {
			f = f * i;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número para descobrir seu fatorial");
		int n = in.nextInt();
		
		Fatorial calc = new Fatorial();
        int resultado = calc.fatorial(n);
        
        System.out.println("Fatorial de " + n + " é: " + resultado);
        
	}
}