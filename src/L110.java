import java.util.Scanner;

class L110 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char r;
		System.out.printf("O seu numero é maior que 4?\n");
		r = ler.next().charAt(0);

		if (r == 's') {
			System.out.printf("O seu numero é maior que 6?\n");
			r = ler.next().charAt(0);

			if (r == 's') {
				System.out.printf("O seu numero é par\n");
				r = ler.next().charAt(0);

				if (r == 's') {
					System.out.printf("O seu numero é 8\n");
				} else {
					System.out.printf("O seu numero é 7\n");
				}
			} else {
				System.out.printf("O seu numero é par\n");
				r = ler.next().charAt(0);

				if (r == 's') {
					System.out.printf("O seu numero é 6\n");
				} else {
					System.out.printf("O seu numero é 5\n");
				}
			}
		} else {
			System.out.printf("O seu numero é maior que 2?\n");
			r = ler.next().charAt(0);
			if (r == 's') {
				System.out.printf("O seu numero é par\n");
				r = ler.next().charAt(0);

				if (r == 's') {
					System.out.printf("O seu numero é 4\n");
				} else {
					System.out.printf("O seu numero é 3\n");
				}
			} else {
				System.out.printf("O seu numero é par\n");
				r = ler.next().charAt(0);

				if (r == 's') {
					System.out.printf("O seu numero é 2\n");
				} else {
					System.out.printf("O seu numero é 1\n");
				}
			}
		}
	}
}