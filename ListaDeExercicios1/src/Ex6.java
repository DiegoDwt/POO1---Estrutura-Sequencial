import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o raio do círculo? ");
		float raio = entrada.nextFloat();
		double area = Math.PI * raio * raio;
		System.out.println("A área do círculo é igual a " + area);
		
		entrada.close();
		

	}

}
