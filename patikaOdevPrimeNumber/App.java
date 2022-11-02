package patikaOdevPrimeNumber;

import java.util.Scanner;

public class App {

	public static String isPrime(int number) {
		boolean isPrime = false; 
		int counter = 0; // counter tanýmladýk eger girilen sayý tam bolunen bir sayi ise counterý arttýrarak devam edicez
		for(int i = 2; i < number; i++) {
			if(number == 2) {	
				isPrime = true; // eger girilen sayi iki ise isPrime deðiþkenini true ya çektik.	
				return (number + " is prime number.");
			}
			else if(number % i == 0) {
				counter++; // eger girilen sayý 0'a tam bolunuyorsa asal degildir counterý arttýrýyorz 0 a bolunen her sayýda
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
