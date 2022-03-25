

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_1 {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMapCaractere = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String palavra;
		int soma = 0;

		hashMapCaractere.put("A, E, I, O, U, L, N, R, S, T", 1);
		hashMapCaractere.put("D, G", 2);
		hashMapCaractere.put("B, C, M, P", 3);
		hashMapCaractere.put("F, H, V, W, Y", 4);
		hashMapCaractere.put("K", 5);
		hashMapCaractere.put("J, X", 8);
		hashMapCaractere.put("Q, Z", 10);

		System.out.print("Digite uma palavra: ");

		palavra = sc.next().toUpperCase();
		sc.close();

		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);

			for (Map.Entry<String, Integer> set : hashMapCaractere.entrySet()) {
				if (set.getKey().contains(Character.toString(letra))) {
					soma += set.getValue();
					break;
				}
			}
		}

		System.out.println("Valor: " + soma);
	}
}