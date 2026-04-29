package base;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Buenos días Ceinmark, soy Moisés");
		System.out.println("Introduce un número para averiguar si es primo o no");
		int num = Integer.parseInt(ent.nextLine());
		if (num % 2 == 0) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		} // fin if
	}// fin main
}
