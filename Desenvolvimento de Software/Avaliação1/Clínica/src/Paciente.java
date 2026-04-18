import java.util.Scanner;
public class Paciente {
	
	Scanner in = new Scanner(System.in);
	
		public String paciente(String nomePaciente) {
			
			System.out.println("Digite o seu nome: ");
			nomePaciente = in.next();
			
			return nomePaciente;
			
		}
}