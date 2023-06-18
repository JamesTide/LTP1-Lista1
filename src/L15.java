import java.util.Scanner;

public class L15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char c;

		System.out.printf("Digite uma letra");
		c = ler.next().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.printf("Esta letra é uma vogal");
		} else {
			System.out.printf("Esta letra é uma consoante");
		}
	}

}