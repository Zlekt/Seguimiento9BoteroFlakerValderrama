package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		boolean first = false;
		boolean second = true;
		int health = 0;
		String output = "";
		int q = 0;
		int h = 0;
		int[] damages;
		for (int i = 0; i < v; i++) {
			q = sc.nextInt();
			h = sc.nextInt();
			int times = 0;
			damages = new int[q];
			for (int j = 0; j < q; j++) {
				damages[j] = sc.nextInt();
			}
			Arrays.sort(damages);
			first = false;
			second = true;
			do {

				if (first == false) {
					int weapon = damages[damages.length - 1];
					h = h - weapon;
					first = true;
					second = false;
				} else if (second == false) {
					int weapon = damages[damages.length - 2];
					h = h - weapon;
					first = false;
					second = true;
				}
				times++;
			} while (h > 0);

			output += times + "\n";
		}
		System.out.println(output);

	}

}
