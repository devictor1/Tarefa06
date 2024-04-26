//Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

package tarefa06;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] numeros = new int [4];
		
		System.out.println("Seja bem-vindo! Insira abaixo o primeiro número.");
		numeros[1] = sc.nextInt();
		System.out.println("Agora, insira valor do segundo número.");
		numeros[2] = sc.nextInt();
		System.out.println("Obrigado! Insira abaixo o terceiro número.");
		numeros[3] = sc.nextInt();
		System.out.println("Por último, insira o quarto número.");
		numeros[4] = sc.nextInt();
		
		for (int numero : numeros) {
			if (numero % 2 == 0 && numero % 3 == 0) {
				System.out.println("O número digitado " + numero + " pode ser dividido por 2 e 3!");
			}
		}
		sc.close();
	}

}
