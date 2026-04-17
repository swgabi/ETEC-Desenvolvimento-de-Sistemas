import java.util.Scanner;
public class AnoBissexto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoInicial, anoFinal, ano;
		
		System.out.println("Digite o ano inicial:");
		anoInicial = in.nextInt();
		
		System.out.println("Digite o ano final:");
		anoFinal = in.nextInt();
		
		ano = anoInicial;
		
		while (ano <= anoFinal) {
			if(ano % 4 == 0 && ano % 100 != 0) {
				System.out.println(ano + " é bissexto");
			}
			ano++;
		}

		in.close();
	}
}
