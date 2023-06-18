import java.util.Scanner;

public class L14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;

		System.out.printf("Digite um numero");
		n1 = ler.nextInt();

		System.out.printf("Digite outro numero");
		n2 = ler.nextInt();

		System.out.printf("Digite outro numero");
		n3 = ler.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.printf("O %d é o maior numero", n1);
		} else {
			if (n2 > n1 && n2 > n3) {
				System.out.printf("O %d é o maior numero", n2);
			} else {
				if (n3 > n1 && n3 > n2) {
					System.out.printf("O %d é o maior numero", n3);
				}
			}

		}

	}

}