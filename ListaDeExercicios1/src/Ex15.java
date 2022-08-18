import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o tamanho (em metros quadrados) da área a ser pintada? ");
		float area = entrada.nextFloat();
		float litros = area / 3;
		double lata = Math.ceil(litros / 18);
		double preco = lata * 80;
		System.out.println("Quantidade de latas: " + lata);
		System.out.println("Preço total: R$ " + preco );
		
		entrada.close();
		

	}

}
