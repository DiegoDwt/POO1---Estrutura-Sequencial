import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int num2 = entrada.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma é " + soma);
		
		entrada.close();
		
		

	}

}
