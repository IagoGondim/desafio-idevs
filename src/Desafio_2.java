import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio_2 {
	public static void main(String[] args) {
		int num = 10000;
		int divisores_1 = 0;
		int divisores_2 = 0;
		List<Integer> listNum = new ArrayList<Integer>();

		while (num > 0) {
			for (int i = num; i > 0; i--) {
				if (num % i == 0) {
					divisores_1 += 1;
				}
			}
			for (int i = (num + 1); i > 0; i--) {
				if ((num + 1) % i == 0) {
					divisores_2 += 1;
				}
			}
			if (divisores_1 == divisores_2) {
				listNum.add(num);
			}
			divisores_1 = 0;
			divisores_2 = 0;
			num--;
		}
		Collections.sort(listNum);
		System.out.println(listNum);
	}
}