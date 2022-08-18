import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o tamanho da área (em metros quadrados) a ser pintada? ");
		float area = entrada.nextFloat();
		float litros = area / 6;
		double lata = Math.ceil(litros /18);
		double precoLata = lata * 80;
		double galao = Math.ceil(litros / 3.6);
		double precoGalao = galao * 25;
		
		entrada.close();
		
		System.out.println("Lata: " + lata + " Unid  Preço: R$ " + precoLata);
		System.out.println("Galão: " + galao + " Unid  Preço: R$ " + precoGalao);
		

	}

}
