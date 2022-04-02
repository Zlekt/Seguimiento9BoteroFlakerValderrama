package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		double resultado = 0.0;
		int rFinal = 0;
		String eq = "";
		String output = "";
		sc.nextLine();
		for (int i = 0; i < times; i++) {
			eq = sc.nextLine();
			String[] lines = eq.split(" ");
			int a = Integer.parseInt(lines[0]);
			int b = Integer.parseInt(lines[1]);
			int c = Integer.parseInt(lines[2]);
			int k = Integer.parseInt(lines[3]);

			c = c - k;
			int inside = b * b - 4 * a * c;
			resultado =((Math.sqrt(inside)-b) / (2 * a));
			rFinal = (int) Math.ceil(resultado);
			output = output+"\n"+rFinal;
		}
			System.out.print(output);
	}

}
