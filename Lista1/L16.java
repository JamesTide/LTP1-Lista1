import java.util.Scanner;

public class L16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, m;

		System.out.printf("Digite uma nota");
		n1 = ler.nextFloat();

		System.out.printf("Digite uma nota");
		n2 = ler.nextFloat();

		System.out.printf("Digite uma nota");
		n3 = ler.nextFloat();

		m = (n1 + n2 + n3) / 3;

		if (m >= 6) {
			System.out.printf("O aluno esta aprovado");
		} else {
			System.out.printf("O aluno esta reprovado");
		}
	}
}