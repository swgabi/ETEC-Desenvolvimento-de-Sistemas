public class PotenciaBase2 {
    
	public static void main(String[] args) {
    	
        final int TAM = 11; 
        int a[] = new int[TAM];
        int potencia = 1;
        
        for(int i = 0; i < TAM; i++) {
            a[i] = potencia;
            potencia = potencia * 2; 
        }

        System.out.print("Potência de base 2 de 0 a 10: [");
        
        for(int i = 0; i < TAM; i++) {
            System.out.print(" " + a[i]);
            if (i < TAM - 1) {
                 System.out.print("");
            }
        }
        System.out.println(" ]");
    }
}