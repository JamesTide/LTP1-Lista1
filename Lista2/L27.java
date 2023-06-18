import java.util.Scanner;

public class L27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, resto, r = 0, m, i = 0;

		do {
			System.out.println("Digite um numero");
			n = ler.nextInt();

			resto = n % 2;

			if (resto == 0 && n > 0) {
				r = r + n;
				i++;
			}
		} while (n != 0);
		m = r / i;
		System.out.printf("Media é %d", m);
	}
}