import java.util.Scanner;
public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, n, t;
		
		i = 1;
		
		System.out.println("Digite um número para descobrir sua tabuada:");
		t = in.nextInt();
		
		while (i<=10) {
			
		n = i * t;
			
		System.out.println(t + " x " + i + " = " + n);
		i++;
		
		}
		
		in.close();
	}
}
