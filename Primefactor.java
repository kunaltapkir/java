package primefactor.test;

import java.util.ArrayList;
import java.util.List;

public class Primefactor {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int candidate = 2; i > 1; candidate++) {
			for (; i % candidate == 0; i /= candidate) {
				prime.add(candidate);
			}
		}
		return prime;
	}

}
