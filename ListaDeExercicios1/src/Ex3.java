import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		int num2 = entrada.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma � " + soma);
		
		entrada.close();
		
		

	}

}
