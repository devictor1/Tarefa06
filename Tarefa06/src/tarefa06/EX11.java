/* Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
 * apresentação, caso o valor não seja maior que três.
 * 
 */
package tarefa06;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Digite abaixo um número inteiro!");
		float num = sc.nextInt();
		if (num <= 3) {
			System.out.println("O valor digitado foi " + num);
		} else {
		}
		sc.close();
	}

}
