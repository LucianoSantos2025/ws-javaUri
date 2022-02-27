import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for (int i=1; i <=10; i++){
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
		}
		
		input.close();

	}

}
