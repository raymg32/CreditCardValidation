import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a credit card number: ");
		
		long number = input.nextLong();
		
		if(isValid(number)){
			System.out.println("Credit card is valid");
		}
		else
			System.out.println("Invalid");
	}
	
	public static boolean isValid(long creditNum){
		return (getSize(creditNum) >= 13) && (getSize(creditNum) <= 16) && 
		
		prefixMatched(creditNum , 4) ||
		prefixMatched(creditNum , 5) ||
		prefixMatched(creditNum , 37) ||
		prefixMatched(creditNum , 6) && 
		(sumOfDoubleEvenPlace(creditNum) +
		sumOfOddPlace(creditNum) % 10 ==0);
	}
	
	public static int getSize(long creditNum){
		int numOfDigits = 0;
		
		while(creditNum != 0){
			creditNum = creditNum / 10;
			numOfDigits++;
		}
		
		return numOfDigits;
	}
	
	public static boolean prefixMatched(long number, int d){
		return getPrefix(number, getSize(d)) == d;
	}
	
	public static long getPrefix(long number, int k){
		long result = number;
		
		for(int i = 0; i < getSize(number) - k; i++)
			result /= 10;
		
		return result;
	}
	
	public static boolean sumOfDoubleEvenPlace(long k){
	}

}
