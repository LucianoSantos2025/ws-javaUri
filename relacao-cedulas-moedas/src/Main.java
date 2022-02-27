import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double valor1 = input.nextDouble();
		int valor = 0;

		System.out.println("NOTAS:");
		valor = (int) valor1 / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valor1 = valor1 % 100;
		valor = (int) valor1 / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valor1 = valor1 % 50;
		valor = (int) valor1 / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valor1 = valor1 % 20;
		valor = (int) valor1 / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valor1 = valor1 % 10;
		valor = (int) valor1 / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valor1 = valor1 % 5;
		valor = (int) valor1 / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valor1 = valor1 % 2;
		valor1 = valor1 * 100.0;

		System.out.println("MOEDAS:");
		valor = (int) valor1 / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		valor1 = valor1 % 100.0;
		valor = (int) valor1 / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		valor1 = valor1 % 50.0;
		valor = (int) valor1 / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		valor1 = valor1 % 25.0;
		valor = (int) valor1 / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		valor1 = valor1 % 10.0;
		valor = (int) valor1 / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		valor1 = valor1 % 5.0;
		valor = (int) valor1 / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);

		input.close();

	}

}
