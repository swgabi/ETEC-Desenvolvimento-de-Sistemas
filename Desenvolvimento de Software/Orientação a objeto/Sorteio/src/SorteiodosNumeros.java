import java.util.Scanner;
public class SorteiodosNumeros {
	
	Scanner in = new Scanner(System.in);
	
	public int inteiros() {
		
		System.out.println("Digite um número inteiro");
		return in.nextInt();
		
	}
	
	public int sorteio() {
		
		return (int) (Math.random()*10);
		
	}
	
	public static boolean comparar(int a, int ra) {
		
		if (a == ra) {
			return true;
		} else {
			return false;
		}   
		
    }
	
	public static void main(String[] args) {
		
		SorteiodosNumeros apresentar = new SorteiodosNumeros();

		int a = apresentar.inteiros();
		int b = apresentar.inteiros();
		
		int ra = apresentar.sorteio();
		int rb = apresentar.sorteio();
		
		System.out.println("O primeiro número sortiado é "+ ra);
		System.out.println("O segundo número sortiado é "+ rb);
		
		System.out.println(comparar(a, ra));
		System.out.println(comparar(b, rb));
		
	}
}