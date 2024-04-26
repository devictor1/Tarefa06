//Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

package tarefa06;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Por favor, insira o primeiro número inteiro!");
		int num1 = sc.nextInt();
		System.out.println("Obrigado! Agora, insira mais um número inteiro!");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			int resultado = num1 - num2;
			System.out.println("O resultado da diferença entre o maior número, " + num1 + ", e o menor, " 
			+ num2 + ", é " + resultado);
		} else {
			int resultado = num2 - num1;
			System.out.println("O resultado da diferença entre o maior número, " + num2 + ", e o menor, " 
			+ num1 + ", é " + resultado);
		}
		sc.close();
	}

}
