import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int NUMBER = input.nextInt();
		int horasTrabalhadas = input.nextInt();
		double valorHora = input.nextDouble();
		double SALARY = horasTrabalhadas * valorHora;

		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);

		input.close();

	}

}
