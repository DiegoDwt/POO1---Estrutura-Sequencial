import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int n2 = entrada.nextInt();
		System.out.println("Digite um número real: ");
		float n3 = entrada.nextFloat();
		float letraA = (2 * n1) * (n2 / 2);
		float letraB = (3 * n1) + (n3);
		double letraC = Math.pow(n3, 3);
		System.out.println("A resposta da letra A é: " + letraA);
		System.out.println("A resposta da letra B é: " + letraB);
		System.out.println("A resposta da letra C é : " + letraC);
		
		entrada.close();
		
		
		

	}

}
