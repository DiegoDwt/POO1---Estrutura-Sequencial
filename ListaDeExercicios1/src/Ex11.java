import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua altura (Em metros)? ");
		float alt = entrada.nextFloat();
		double pesoId = (72.7 * alt) - 58;
		System.out.println("O seu peso ideal é: " + pesoId);
		
		entrada.close();
		

	}

}
