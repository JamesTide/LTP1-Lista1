import java.util.Scanner;

public class L17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float p, a, imc;

		System.out.printf("Digite um numero");
		p = ler.nextFloat();

		System.out.printf("Digite um numero");
		a = ler.nextFloat();

		imc = p / (a * a);

		if (imc >= 40) {
			System.out.printf("Obesidade grave");
		} else {
			if (imc >= 30 && imc <= 39.9) {
				System.out.printf("Obesidade");
			} else {
				if (imc >= 25 && imc <= 29.9) {
					System.out.printf("Sobrepeso");
				} else {
					if (imc >= 18.5 && imc <= 24.9) {
						System.out.printf("Normal");
					} else {
						System.out.printf("Magresa");
					}
				}
			}
		}
	}

}