import java.util.Scanner;
public class ConversordeTemperatura {
	
	public static double converterCelsiusParaFahrenheit(double c) {
	
		double f;
		
		return f = (c*1.8)+32;
	
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double c;
		
		System.out.println("Digite um número: ");
		c = in.nextDouble();
		
		double r = converterCelsiusParaFahrenheit(c);
		
		System.out.println("São "+ c +" Celsius e isso é "+ r +" Fahrenheit.");
		
	}
}