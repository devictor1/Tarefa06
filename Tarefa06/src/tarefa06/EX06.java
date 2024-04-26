//Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.

package tarefa06;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Insira abaixo o valor da variável A.");
		float a = sc.nextFloat();
		System.out.println("Agora, insira valor da variável B.");
		float b = sc.nextFloat();
		System.out.println("Por último, o valor da variável C.");
		float c = sc.nextFloat();
		if (a > b) {
			if (b > c) {
				System.out.println("As variáveis, em ordem crescente, são: " + c + " " + b + " " + a);
			} else if (c > a){
				System.out.println("As variáveis, em ordem crescente, são: " + b + " " + a + " " + c);
		} else {
			System.out.println("As variáveis, em ordem crescente, são: " + b + " " + c + " " + a);
		}
		} else {
			if (a > c) {
				System.out.println("As variáveis, em ordem crescente, são: " + c + " " + a + " " + b);
			} else if (c > b) {
				System.out.println("As variáveis, em ordem crescente, são: " + a + " " + b + " " + c);
			} else {
				System.out.println("As variáveis, em ordem crescente, são: " + a + " " + c + " " + b);
			}
			
		}
		
		sc.close();
	}

	}

