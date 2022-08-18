import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora (R$)?");
		float valor = entrada.nextFloat();
		System.out.println("Qual foi o número de horas trabalhadas no mês? ");
		float horas = entrada.nextFloat();
		float salario = valor * horas;
		System.out.println("O salário mensal será de R$" + salario);
		
		entrada.close();

	}

}
