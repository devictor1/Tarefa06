/*Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar
 * o número lido como sendo um valor positivo, ou seja, o programa deverá
 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
 * número fornecido é menor que zero; sendo, multiplique-o por -1.
 */

package tarefa06;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Insira um número inteiro, por favor!");
		int num = sc.nextInt();
		if (num < 0) {
			int resultado = num * -1;
			System.out.println("O módulo do seu número é " + resultado);
		}else {
			System.out.println("O seu número é " + num);
		}
		sc.close();
	}

}
