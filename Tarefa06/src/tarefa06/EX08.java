//Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

package tarefa06;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];

		System.out.println("Seja bem-vindo! Insira abaixo o primeiro número inteiro!");
		numeros[0] = sc.nextInt();
		System.out.println("Agora, insira o segundo.");
		numeros[1] = sc.nextInt();
		System.out.println("Abaixo, o digite o terceiro número.");
		numeros[2] = sc.nextInt();
		System.out.println("Obrigado, agora digite o terceiro valor.");
		numeros[3] = sc.nextInt();
		System.out.println("Por último, insira o quinto valor");
		numeros[4] = sc.nextInt();
		int maior = numeros[4];
		int menor = numeros[4];

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("O maior número dos digitados é: " + maior);
		System.out.println("E o menor dos números digitados é: " + menor);

		sc.close();
	}

}
