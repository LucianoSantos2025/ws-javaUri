import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double notaA = input.nextDouble();
		double notaB = input.nextDouble();
		double MEDIA = ((notaA * 3.5) + (notaB * 7.5)) / 11.0;

		System.out.printf("MEDIA =  %.5f%n", MEDIA);

		input.close();

	}

}
