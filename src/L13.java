import java.util.Scanner;

public class L13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1;

		System.out.printf("Digite um numero");
		n1 = ler.nextFloat();

		if (n1 >= 0 && n1 <= 10) {
			System.out.printf("O numero esta entre 10 e 0");
		} else {
			System.out.printf("O numero não esta entre 10 e 0");
		}
	}

}