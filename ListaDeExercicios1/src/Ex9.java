import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Forne�a a temperatura em Farenheit? ");
		float tempF = entrada.nextFloat();
		float tempC = (5 * (tempF - 32) / 9);
		System.out.println("� igual a " + tempC + " Celsius.");
		
		entrada.close();
		
		
	}

}
