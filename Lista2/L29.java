import java.util.Scanner;

public class L29 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		float n1, n2, r = 1, i;

		System.out.printf("Digite um numero");
		n1 = ler.nextFloat();

		System.out.printf("Digite um numero");
		n2 = ler.nextFloat();

		while (n1 != 0 && n2 != 0) {

			System.out.printf("Digite 1 para Somar.\r\n"
					+ "Digite 2 para Multiplicar.\r\n"
					+ "Digite 3 para Dividir.\r\n"
					+ "Digite 4 para Elevar.\r\n");
			n = ler.nextInt();

			switch (n) {
				case 1:
					r = n1 + n2;
					System.out.printf("O resultado de %.2f+%.2f é %.2f\n", n1, n2, r);
					break;
				case 2:
					r = n1 * n2;
					System.out.printf("O resultado de %.2f*%.2f é %.2f\n", n1, n2, r);
					break;
				case 3:
					r = n1 / n2;
					System.out.printf("O resultado de %.2f/%.2f é %.2f\n", n1, n2, r);
					break;
				case 4:
					for (i = 0; i != n2; i++) {
						r = r * n1;
					}
					System.out.printf("O resultado de %.2f elevado a %.2f é %.2f\n", n1, n2, r);
					break;
				case 5:
					break;
			}
			System.out.printf("Digite um numero");
			n1 = ler.nextFloat();

			System.out.printf("Digite um numero");
			n2 = ler.nextFloat();
		}

	}
}