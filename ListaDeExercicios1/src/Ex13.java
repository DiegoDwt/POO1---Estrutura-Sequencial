import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float excesso = 0;
		float multa = 0;
		System.out.println("Qual é o peso dos peixes vendidos? ");
		float peso = entrada.nextFloat();
		if (peso>50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}
		entrada.close();
		System.out.println("O excesso é igual a: " + excesso + " Kg");
		System.out.println("A multa é igual a: R$ " + multa);
		
	}

}
