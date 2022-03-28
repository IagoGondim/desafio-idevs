import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_3 {
	static boolean checkPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int listSoma(List<Integer> list, int lenghtSlice) {
		int soma = 0;
		for (int i = 0; i < lenghtSlice; i++) {
			soma += list.get(i);
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listPrimo = new ArrayList<>();

		System.out.print("Insira um número: ");
		int num = sc.nextInt();
		sc.close();

		for (int i = 2; i <= num; i++) {
			if (checkPrimo(i)) {
				listPrimo.add(i);
			}
		}
		for (int i = listPrimo.size(); i > 0; i--) {
			int aux = listSoma(listPrimo, i);
			if (aux <= num && checkPrimo(aux)) {
				System.out.println("A Maior soma de números primos consecutivos abaixo de " + num
						+ " que gera um número primo é: " + aux);
				break;
			}
		}
	}
}
