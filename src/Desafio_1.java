
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Desafio_1 {
	public static void main(String[] args) {

		/*
		 * Criação do hashMap
		 * (https://www.geeksforgeeks.org/hashmap-entryset-method-in-java/).
		 */
		HashMap<String, Integer> hashMapCaractere = new HashMap<>();
		String palavra;
		int soma = 0;

		hashMapCaractere.put("A, E, I, O, U, L, N, R, S, T", 1);
		hashMapCaractere.put("D, G", 2);
		hashMapCaractere.put("B, C, M, P", 3);
		hashMapCaractere.put("F, H, V, W, Y", 4);
		hashMapCaractere.put("K", 5);
		hashMapCaractere.put("J, X", 8);
		hashMapCaractere.put("Q, Z", 10);

		/*
		 * Caixa de dialogo solicitando a palavra e colocando automaticamente em
		 * maiusculo.
		 */
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ").toUpperCase();

		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);

			// Verifica o hashmap com cada letra digitada.
			for (Map.Entry<String, Integer> set : hashMapCaractere.entrySet()) {
				if (set.getKey().contains(Character.toString(letra))) {
					soma += set.getValue();
					break;
				}
			}
		}
		// Criação da caixa de dialogo com o somátorio das letras
		JOptionPane.showMessageDialog(null, "Valor do somatório das letras são: " + soma);
	}
}