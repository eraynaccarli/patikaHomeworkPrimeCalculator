package patikaOdevPrimeNumber;

import java.util.Scanner;

public class App {

	public static String isPrime(int number) {
		boolean isPrime = false; 
		int counter = 0; // counter tan�mlad�k eger girilen say� tam bolunen bir sayi ise counter� artt�rarak devam edicez
		for(int i = 2; i < number; i++) {
			if(number == 2) {	
				isPrime = true; // eger girilen sayi iki ise isPrime de�i�kenini true ya �ektik.	
				return (number + " is prime number.");
			}
			else if(number % i == 0) {
				counter++; // eger girilen say� 0'a tam bolunuyorsa asal degildir counter� artt�r�yorz 0 a bolunen her say�da
				isPrime = false;
				return (number + " is not prime number.");
			
			}
		}
		if(counter == 0) { // counter da hic say� yoksa tam boleni yoktur o bir asal say�d�r
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
