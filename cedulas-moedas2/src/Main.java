import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double valor = input.nextDouble();
		int numInt = 0;
		// (int) serve pra ignorar todo parte decimal de um numero

		System.out.println("NOTAS:");
		numInt = (int) valor / 100;
		System.out.println(numInt + " nota(s) de R$ 100.00");
		valor = valor % 100;
		numInt = (int) valor / 50;
		System.out.println(numInt + " nota(s) de R$ 50.00");
		valor = valor % 50;
		numInt = (int) valor / 20;
		System.out.println(numInt + " nota(s) de R$ 20.00");
		valor = valor % 20;
		numInt = (int) valor / 10;
		System.out.println(numInt + " nota(s) de R$ 10.00");
		valor = valor % 10;
		numInt = (int) valor / 5;
		System.out.println(numInt + " nota(s) de R$ 5.00");
		valor = valor % 5;
		numInt = (int) valor / 2;
		System.out.println(numInt + " nota(s) de R$ 2.00");
		valor = valor % 2;

		System.out.println("MOEDAS:");
		numInt = (int) valor / 1;
		valor = valor % 1;
		System.out.println(numInt + " moeda(s) de R$ 1.00");
		numInt = (int) (valor / 0.5);
		valor = valor % 0.5;
		System.out.println(numInt + " moeda(s) de R$ 0.50");
		numInt = (int) (valor / 0.25);
		valor = valor % 0.25;
		System.out.println(numInt + " moeda(s) de R$ 0.25");
		numInt = (int) (valor / 0.10);
		valor = valor % 0.10;
		System.out.println(numInt + " moeda(s) de R$ 0.10");
		numInt = (int) (valor / 0.05);
		valor = valor % 0.05;
		System.out.println(numInt + " moeda(s) de R$ 0.05");
		numInt = (int) (valor / 0.01);
		System.out.println(numInt + " moeda(s) de R$ 0.01");

		input.close();
	}
}
