import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escreva a medida em metros(m): ");
		float n1 = entrada.nextFloat();
		float convert = n1 * 100;
		System.out.println(n1 + " metro(s)" + " é igual a " + convert + " centímetro(s).");
		
		entrada.close();

	}

}
