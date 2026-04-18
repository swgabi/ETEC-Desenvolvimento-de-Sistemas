public class somatorioMatriz5X5 {

	public static void main(String[] args) {

		int[][] m = new int [5][5];
		int s = 0, k=1; 
		
		for(int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				m[i][j] = k; 
				s += k++;
				
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("Somatória = " + s);
		
	}
}