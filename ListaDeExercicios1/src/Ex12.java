import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua altura (em metros)? ");
		float alt = entrada.nextFloat();
		double pesoIdealHomem = (72.7 * alt) - 58;
		double pesoIdealMulher = (62.1 * alt) - 44.7;
		
		entrada.close();
		
		System.out.println("Seu peso ideal é: ");
		System.out.println("Se homem: " + pesoIdealHomem);
		System.out.println("Se mulher: " + pesoIdealMulher);
		
		

	}

}
