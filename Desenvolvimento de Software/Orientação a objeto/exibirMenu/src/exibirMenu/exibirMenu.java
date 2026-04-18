package exibirMenu;
public class exibirMenu {
	
	public void exibirMenu() {
		
		System.out.println("**********Lista de Exercicios***********");
		
		System.out.println("1° Triangulo"+"\n"
			             + "2° Quadrado"+"\n"
			             + "3° Círculo"+"\n"
			             + "4° Losangulo"+"\n"
			             + "5° Sair"
				             );
		
	}
	
	public static void main(String[] args) {

        exibirMenu menu = new exibirMenu();
        menu.exibirMenu();
        
    }
}