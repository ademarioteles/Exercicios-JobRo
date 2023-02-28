package application;

import java.util.Scanner;
/******************************************************************************

Vaga para Estágio Job Rotation - São Paulo

5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;


*******************************************************************************/
public class Principal {

	public static String inverter(String palavra) {
		String palavraInvertida = "";
		for (int x = 0; x < palavra.length(); x++) {

			palavraInvertida += String.valueOf(palavra.charAt(palavra.length() - x - 1));
		}

		return palavraInvertida;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a palavra ou nome a ser invertido:");
		String palavra = entrada.next();

		System.out.println(inverter(palavra));

	}

}
