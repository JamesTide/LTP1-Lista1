import java.util.Scanner;

public class L18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salario, prestacao, r;

		System.out.printf("Digite o seu salario");
		salario = ler.nextFloat();

		System.out.printf("Digite o valor da parcela");
		prestacao = ler.nextFloat();

		r = (salario / 100) * 30;

		if (r <= prestacao) {
			System.out.printf("Seu credito não será liberado");
		} else {
			System.out.printf("Seu credito será liberado");
		}

	}

}