
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		double MEDIA = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0;

		if (MEDIA >= 7) {
			System.out.println("Media: " + df.format(MEDIA));
			System.out.println("Aluno aprovado.");

		} else if (MEDIA < 5) {
			System.out.println("Media: " + df.format(MEDIA));
			System.out.println("Aluno reprovado.");

		} else if (MEDIA < 7 && MEDIA >= 5) {
			double Exame = input.nextDouble();

			System.out.println("Media: " + df.format(MEDIA));
			System.out.println("Aluno em exame.");

			MEDIA = (MEDIA + Exame) / 2;
			System.out.println("Nota do exame: " + df.format(Exame));

			if (MEDIA >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(MEDIA));
		} else {
			System.out.println("Aluno reprovado.");
		}

		input.close();
	}
}
