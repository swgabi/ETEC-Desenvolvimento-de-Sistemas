import java.util.Scanner;
public class Tabuada {
    
	public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			
        	int a[], i, t, resultado;
			final int TAM = 5;
			a = new int[TAM];

			for(i = 0; i < TAM; i++) {
			    System.out.print("Digite o " + (i + 1) + "º número: ");
			    a[i] = in.nextInt();
			}

			for(i = 0; i < TAM; i++) {
			    int num = a[i];
			    System.out.println("Tabuada do " + num + ":");
			    
			    for(t = 1; t <= 10; t++) {
			        resultado = num * t;
			        System.out.println(num + " x " + t + " = " + resultado);
			    }
			}

			in.close();
		}
    }
}