import java.util.Scanner;

public class L11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, np;

		System.out.printf("Digite um numero");
		n1 = ler.nextInt();

		if (n1 < 0) {
			np = n1 * -1;
			System.out.printf("%d", np);
		} else {
			System.out.printf("%d", n1);
		}
	}

}