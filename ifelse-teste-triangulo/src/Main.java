import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		if ((A < B + C) && (B < A + C) && (C < B + A)) {
			double perimetro = A + B + C;
			
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			double area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}

		input.close();

	}

}
