import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float n3 = entrada.nextFloat();
		System.out.print("Digite a quarta nota: ");
		float n4 = entrada.nextFloat();
		float media = (n1 + n2 + n3 + n4)/4;
		System.out.println("A média é " + media);
		
		entrada.close();
		
		
		

	}

}
