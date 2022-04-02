package punto1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		
			while(reader.hasNext()) {
				int booksNumber = reader.nextInt();
				int[] prices = new int[booksNumber];
				for(int i = 0; i<booksNumber; i++) {
					
					prices[i] = reader.nextInt();
					
				}
				int petersMoney = reader.nextInt();
				Arrays.sort(prices);
				int lowestDifference = -777;
				int bookA = 0;
				int bookB = 0;
				
				for(int i=0; i<booksNumber; i++) {
					
					int remaining = petersMoney - prices[i];
					int findSecondBook = Arrays.binarySearch(prices, i+1, booksNumber, remaining);
					
					if(findSecondBook>=0&&prices[findSecondBook]+prices[i]==petersMoney) {
						int difference;
						if(prices[i]>prices[findSecondBook]) {
							difference = prices[i] - findSecondBook;
						}else {
							difference = prices[findSecondBook] - prices[i];
						}
						if(lowestDifference==-777||lowestDifference>difference) {
							lowestDifference=difference;
							if(prices[i]<prices[findSecondBook]) {
								bookA = prices[i];
								bookB = prices[findSecondBook];
							}else {
								bookA = prices[findSecondBook];
								bookB = prices[i];
							}
						}
				}
				
			}
				System.out.println("Peter should buy books whose prices are "+bookA+" and "+bookB+".\n");
				
			
			}
	}
}
