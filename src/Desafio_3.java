import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Desafio_3 {
	// Método que verifica se o numero é primo
	static boolean checkPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Soma dos numeros e armazena em uma list.
	static int listSoma(List<Integer> list, int lenghtSlice) {
		int soma = 0;
		for (int i = 0; i < lenghtSlice; i++) {
			soma += list.get(i);
		}
		return soma;
	}

	public static void main(String[] args) {
		List<Integer> listPrimo = new ArrayList<>();

		int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

		for (int i = 2; i <= num; i++) {
			if (checkPrimo(i)) {
				listPrimo.add(i);
			}
		}
		// Começa do maior numero indo até o menor e imprime na caixa de diálogo.
		for (int i = listPrimo.size(); i > 0; i--) {
			int aux = listSoma(listPrimo, i);
			if (aux <= num && checkPrimo(aux)) {
				JOptionPane.showMessageDialog(null, "A maior soma de números primos consecutivos menor que " + num
						+ " que gera um número primo é: " + aux);
				break;
			}
		}
	}
}
