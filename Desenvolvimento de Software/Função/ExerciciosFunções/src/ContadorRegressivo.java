public class ContadorRegressivo {
    
    public static void contagemRegressiva(int n) {
    	
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        
    }

    public static void main(String[] args) {
        contagemRegressiva(10); 
    }
}