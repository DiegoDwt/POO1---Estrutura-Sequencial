import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora (R$)? ");
		float valor = entrada.nextFloat();
		System.out.println("Qual o n�mero de horas trabalhadas no m�s? ");
		float horas = entrada.nextFloat();
		float bruto = valor * horas;
		double imposto = bruto * 0.11;
		double inss = bruto * 0.08;
		double sindicato = bruto * 0.05;
		double liq = bruto - imposto - inss - sindicato;
		System.out.println("Sal�rio bruto: R$ " + bruto);
		System.out.println("INSS: R$ " + inss);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("O imposto � igual a R$ " + imposto);
		System.out.println("Sal�rio l�quido: R$ " + liq);
		
		entrada.close();

	}

}
