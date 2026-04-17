import java.util.Scanner;
public class NumeroElevado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	int e, b;			
	int r = 1;
	int i = 0;
	
	System.out.println("Digite a base: ");
	b = in.nextInt();

	System.out.println("Digite seu expoente: ");
	e = in.nextInt();
	
	do {
	
	r = r * b;
	i = i + 1;	
		
	}while (i < e);
	
	System.out.println("Seu resultado é :" + r);
	
	in.close();
	}

}
