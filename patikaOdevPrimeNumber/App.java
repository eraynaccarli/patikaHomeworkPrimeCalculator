package patikaOdevPrimeNumber;

import java.util.Scanner;

public class App {

	public static String isPrime(int number) {
		boolean isPrime = false; 
		int counter = 0; // counter tanimladik eger girilen sayi tam bolunen bir sayi ise counteri arttirarak devam edicez
		for(int i = 2; i < number; i++) {
			if(number == 2) {	
				isPrime = true; // eger girilen sayi iki ise isPrime degiskenini true ya çektik.	
				return (number + " is prime number.");
			}
			else if(number % i == 0) {
				counter++; // eger girilen sayi 0'a tam bolunuyorsa asal degildir counteri arttiriyoruz.
				isPrime = false;
				return (number + " is not prime number.");
			
			}
		}
		if(counter == 0) { // counter da hic sayý yoksa tam boleni yoktur o bir asal sayýdýr
			isPrime = true;
			return (number + " is prime number.");
		}
		else {
			isPrime = false;
			return (number + " is not prime number.");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		System.out.println(isPrime(number));

	}

}
