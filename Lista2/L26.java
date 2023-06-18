import java.util.Scanner;

public class L26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int b, i, e, r = 1;

		do {
			System.out.printf("Digite a base");
			b = ler.nextInt();
		} while (b < 0);

		do {
			System.out.printf("Digite o expoente");
			e = ler.nextInt();
		} while (e < 0);

		for (i = 0; i != e; i++) {
			r = r * b;
		}
		System.out.printf("O resultado é %d", r);
	}

}