import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Forneça a temperatura em Farenheit? ");
		float tempF = entrada.nextFloat();
		float tempC = (5 * (tempF - 32) / 9);
		System.out.println("É igual a " + tempC + " Celsius.");
		
		entrada.close();
		
		
	}

}
