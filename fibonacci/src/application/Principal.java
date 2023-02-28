package application;

import java.util.Scanner;

/******************************************************************************
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
 * avisando se o número informado pertence ou não a sequência.
 * 
 * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua
 * preferência ou pode ser previamente definido no código;
 * 
 *******************************************************************************/

public class Principal {

	public static boolean eFibo(int valor) {

		int raiz = (int) Math.sqrt(valor);

		return (raiz * raiz == valor);
	}

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int nFibo = numero.nextInt();

		if (eFibo(5 * nFibo * nFibo + 4) || eFibo(5 * nFibo * nFibo - 4)) {

			System.out.println("Pertence a sequência de Fibonnaci");

		} else {

			System.out.println("Não pertence a sequência de Fibonnaci");

		}

	}

}
