import java.util.Scanner;
public class Saldacao {
	
    Scanner in = new Scanner(System.in);

    public void saudacaoPersonalizada() {
    	
        System.out.println("Digite seu nome:");
        String nome = in.next();

        System.out.println("Olá, " + nome + ", seja bem-vindo(a)!");
        
    }

    public static void main(String[] args) {
    	
        Saldacao saudacao = new Saldacao();
        saudacao.saudacaoPersonalizada();
        
    }
}