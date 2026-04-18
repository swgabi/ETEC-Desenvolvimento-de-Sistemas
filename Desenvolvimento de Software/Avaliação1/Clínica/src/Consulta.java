import java.util.Scanner;
public class Consulta {
    
    Scanner in = new Scanner(System.in);
    
	    public String consulta() {
	    	
	        System.out.println("Qual é o tipo de consulta?");
	        return in.next();
	        
	    }
    
    public void mostrarConsulta() {
    	
        Medico medico = new Medico();
        
        String nomeMedico = medico.nome();
        
        String especialidadeMedico = medico.especialidade();

        Paciente paciente = new Paciente();
        
        String nomePaciente = paciente.paciente("");
        
        String tipoConsulta = consulta();
        
        System.out.println("Consulta agendada: ");
        
        System.out.println("Paciente: " + nomePaciente);
        
        System.out.println("Médico: " + nomeMedico);
        
        System.out.println("Especialidade: " + especialidadeMedico);
        
        System.out.println("Tipo: " + tipoConsulta);
        
    }
}