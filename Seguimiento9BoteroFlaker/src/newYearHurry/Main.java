package newYearHurry;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		final int LIMAKS_TIME_LEFT = 240;
		int timeToSolve = 5;
		int timeSpend = k;
		int solvedProblems = 0;
		int i=0;
		while(timeSpend<=LIMAKS_TIME_LEFT && solvedProblems<n) {
			i++;
			timeToSolve = 5*i;
			timeSpend+=timeToSolve;
			if(timeSpend<=LIMAKS_TIME_LEFT) {
				
				solvedProblems++;
			}
			
		}
		System.out.println(solvedProblems);
	}
}
