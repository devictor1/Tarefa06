/*Ler quatro valores referentes a quatro notas escolares de um aluno e
 * imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da
 * média escolar for maior ou igual a 7. Se o valor da média for menor
 * que 7, solicitar a nota de exame, somar com o valor da média e obter
 * nova média. Se a nova média for maior ou igual a 5, apresentar uma
 * mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi
 * aprovado, indicar uma mensagem informando esta condição. Apresentar
 * com as mensagens o valor da média do aluno, para qualquer condição.
 * 
 */

package tarefa06;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Insira abaixo a sua primeira nota!");
		float nota1 = sc.nextFloat();
		System.out.println("Perfeito, agora insira a sua segunda nota!");
		float nota2 = sc.nextFloat();
		System.out.println("Insira abaixo a sua terceira nota!");
		float nota3 = sc.nextFloat();
		System.out.println("Por último, insira a sua quarta nota!");
		float nota4 = sc.nextFloat();
		float media = ((nota1 + nota2 + nota3 + nota4) / 4);
		if (media >= 7) {
			System.out.println("Parabéns! Você foi aprovado com uma média de " + media);
		} else {
			System.out.println("Poxa, infelizmente sua média de " + media + " é menor que 7, qual foi a nota do exame?");
			float notaExame = sc.nextFloat();
			float mediaExame = ((media + notaExame)/2);
		if (mediaExame >= 5) {
			System.out.println("Parabéns! Você conseguiu passar com uma média de " + mediaExame);
		} else {
			System.out.println("Poxa, infelizmente sua média de " + mediaExame + " é insuficiente para passar. ");
		}
		sc.close();
	}

}
}
