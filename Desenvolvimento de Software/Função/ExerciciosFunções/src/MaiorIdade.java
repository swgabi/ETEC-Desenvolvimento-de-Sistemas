import java.util.Scanner;
public class MaiorIdade {
	
	public static boolean ehMaiorDeIdade() {
		boolean l = false;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int i = in.nextInt();
		
		if (i>=18) {
			l = true;
		}
		return l;
		
	}
	
	public static void main(String[] args) {
		
	if (ehMaiorDeIdade()) {
		System.out.println("É maior de idade!");
	}
	else {
		System.out.println("É menor de idade!");
	}
	
	}
}