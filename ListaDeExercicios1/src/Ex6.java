import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual � o raio do c�rculo? ");
		float raio = entrada.nextFloat();
		double area = Math.PI * raio * raio;
		System.out.println("A �rea do c�rculo � igual a " + area);
		
		entrada.close();
		

	}

}
