import java.util.*;
public class VetorAoQuadrado {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a[], b[], i;	
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+ (i+1) +"º valor de A");
			a[i] = in.nextInt();
		}
		 
		for(i=0; i<TAM; i++) {
			b[i] = a[i] * a[i];
		}
		
		System.out.print("a = [");	
		for(i=0; i<TAM; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println(" ]");
		
		
		System.out.print("b = [");	
		for(i=0; i<TAM; i++) {
			System.out.print(" " + b[i]);
		}
		System.out.println(" ]");

		in.close();
	}
}
