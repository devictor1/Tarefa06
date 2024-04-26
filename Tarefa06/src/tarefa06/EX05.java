/*Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o
 * cálculo da equação completa de segundo grau, apresentando as duas raízes,
 * se para os valores informados for possível efetuar o referido cálculo.
 * Lembre-se de que a variável A deve ser diferente de zero.
 */

package tarefa06;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Insira abaixo o valor de A, sendo ele diferente de zero!");
		float a = sc.nextFloat();
		System.out.println("Obrigado, agora insira o valor de B.");
		float b = sc.nextFloat();
		System.out.println("Por último, insira o valor da variável C.");
		float c = sc.nextFloat();
		double delta = Math.pow(b, b) - 4 * a * c;
		if (delta > 0) {
			double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
			double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Existem as seguintes raízes para essa equação: " + raiz1 + " e " + raiz2);
		} else if (delta == 0) {
			double raiz = (-b / (2 * a));
			System.out.println("Existe a seguinte raíz para a equação: " + raiz);
		} else {
			System.out.println("Não existem raízes reais para essa equação!");
		}
				
		sc.close();
	}

}
