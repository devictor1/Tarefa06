/* Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa,
 * apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo
 * informado como masculino, ou a mensagem "Ilma Sra.", para o sexo informado
 * como feminino. Apresente também junto da mensagem de saudação o nome previamente informado.
 */

package tarefa06;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem-vindo! Digite abaixo o seu nome!");
		String nome = sc.next();
		System.out.println("E como você se identifica? Utilize 1 para Masculino e 2 para Feminino");
		int sexo = sc.nextInt();
		if (sexo == 1) {
			System.out.println("Ilmo Sr. " + nome);
		} else if (sexo == 2) {
			System.out.println("Ilma Sra. " + nome);
		} else {
			System.out.println("Ilme Sre. " + nome);
		}
		sc.close();
	}
}
