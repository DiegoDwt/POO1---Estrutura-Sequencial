import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora (R$)?");
		float valor = entrada.nextFloat();
		System.out.println("Qual foi o n�mero de horas trabalhadas no m�s? ");
		float horas = entrada.nextFloat();
		float salario = valor * horas;
		System.out.println("O sal�rio mensal ser� de R$" + salario);
		
		entrada.close();

	}

}
