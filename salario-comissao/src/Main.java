import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String nome = input.next();
		double salario = input.nextDouble();
		double vendas = input.nextDouble();
		double TOTAL = salario + (vendas * 0.15);

		System.out.printf(nome + ": TOTAL = R$ %.2f%n", TOTAL);

		input.close();

	}

}
