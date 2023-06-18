import java.util.Scanner;

public class L19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		float n1, n2, r;

		System.out.printf("Digite um numero");
		n1 = ler.nextFloat();

		System.out.printf("Digite um numero");
		n2 = ler.nextFloat();

		System.out.printf("Digite 1 para somar.\r\n"
				+ "Digite 2 para subtrair.\r\n"
				+ "Digite 3 para multiplicar.\r\n"
				+ "Digite 4 para dividir.\r\n"
				+ "Digite 5 para sair.");
		n = ler.nextInt();

		switch (n) {
			case 1:
				r = n1 + n2;
				System.out.printf("O resultado de %.2f+%.2f é %.2f", n1, n2, r);
				break;
			case 2:
				r = n1 - n2;
				System.out.printf("O resultado de %.2f-%.2f é %.2f", n1, n2, r);
				break;
			case 3:
				r = n1 * n2;
				System.out.printf("O resultado de %.2f*%.2f é %.2f", n1, n2, r);
				break;
			case 4:
				r = n1 / n2;
				System.out.printf("O resultado de %.2f/%.2f é %.2f", n1, n2, r);
				break;
			case 5:
				break;
		}
	}

}