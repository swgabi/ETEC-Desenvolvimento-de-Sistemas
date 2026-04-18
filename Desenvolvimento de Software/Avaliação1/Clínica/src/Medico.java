import java.util.Scanner;
public class Medico {
    
    Scanner in = new Scanner(System.in);

	    public String nome() {
	    	
	        System.out.println("Digite o nome do médico: ");
	        return in.next();
	        
	    }

	    public String especialidade() {
	    	
	        System.out.println("Qual a especialidade do médico? ");
	        return in.next();
	        
	    }
}