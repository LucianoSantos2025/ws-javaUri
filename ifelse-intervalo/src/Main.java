import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double num = input.nextDouble();

		if (num < 0 || num > 100) {
			System.out.println("Fora de intervalo");

		} else if (num >= 0 && num <= 25.00) {

			System.out.println("Intervalo [0,25]");

		} else if (num > 25.00 && num <= 50.00) {

			System.out.println("Intervalo (25,50]");

		} else if (num > 50.00 && num <= 75.00) {

			System.out.println("Intervalo (50,75]");

		} else {
			System.out.println("Intervalo (75,100]");
		}

		input.close();

	}

}
