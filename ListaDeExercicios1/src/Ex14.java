import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora (R$)? ");
		float valor = entrada.nextFloat();
		System.out.println("Qual o número de horas trabalhadas no mês? ");
		float horas = entrada.nextFloat();
		float bruto = valor * horas;
		double imposto = bruto * 0.11;
		double inss = bruto * 0.08;
		double sindicato = bruto * 0.05;
		double liq = bruto - imposto - inss - sindicato;
		System.out.println("Salário bruto: R$ " + bruto);
		System.out.println("INSS: R$ " + inss);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("O imposto é igual a R$ " + imposto);
		System.out.println("Salário líquido: R$ " + liq);
		
		entrada.close();

	}

}
