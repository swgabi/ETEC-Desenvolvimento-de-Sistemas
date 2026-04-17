import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int o, n;
		int f = 1;
		int b = 2;
		int i = 2;
		
		System.out.println("Digite o número de termos desejado:");
		n = in.nextInt();
		
		if (n<=1) {
			System.out.println(f + "");
		

			}else
		
		
		do {
			
			o = f + b;
			System.out.println(o);
			
			f = b;
			b = o;
			i++;
			
			
		}while (i < n);
		
	in.close();	
	}

}
