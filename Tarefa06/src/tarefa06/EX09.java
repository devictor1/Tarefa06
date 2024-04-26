//Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

package tarefa06;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Digite abaixo um número inteiro!");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("O seu número é par!");
		} else {
			System.out.println("O seu número é impar!");
		}
		sc.close();
	}

}
