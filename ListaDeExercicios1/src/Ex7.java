import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a medida do lado do quadrado? ");
		float n1 = entrada.nextFloat();
		float area = n1 * n1;
		System.out.println("A área do quadrado é igual a " + area);
		
		entrada.close();
		

	}

}
