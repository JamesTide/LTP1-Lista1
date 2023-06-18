import java.util.Scanner;

public class L12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, r;

		System.out.printf("Digite um numero");
		n1 = ler.nextInt();

		r = n1 % 2;

		if (r != 0) {
			System.out.printf("O numero é impar");
		} else {
			System.out.printf("O numero é par");
		}
	}

}