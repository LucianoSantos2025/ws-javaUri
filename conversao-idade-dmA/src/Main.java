import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idade = input.nextInt();

		int anos = idade / 365;
		int resto = idade % 365;

		int meses = resto / 30;
		int dias = resto % 30;

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

		input.close();

	}

}
