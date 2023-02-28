package application;

import java.util.Scanner;

/******************************************************************************
 * Vaga para Estágio Job Rotation - São Paulo
 * 
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por
 * estado:
 * 
 * SP – R$67.836,43 RJ – R$36.678,66 MG – R$29.229,88 ES – R$27.165,48 Outros –
 * R$19.849,53
 * 
 * Escreva um programa na linguagem que desejar onde calcule o percentual de
 * representação que cada estado teve dentro do valor total mensal da
 * distribuidora.
 * 
 * 
 *******************************************************************************/

public class Principal {

	public static String faturamento(double SP, double RJ, double MG, double ES, double outros) {

		double total = SP + RJ + MG + ES + outros;
		return "Percentual de Faturamento de SP:" + String.format("%.2f",(SP / total) * 100) + "%" 
				+ "\nPercentual de Faturamento de RJ:"  + String.format("%.2f",(RJ / total) * 100) + "%" 
				+ "\nPercentual de Faturamento de MG:" + String.format("%.2f",(MG / total) * 100 )+ "%" 
				+ "\nPercentual de Faturamento de ES:"  + String.format("%.2f",(ES / total) * 100) + "%" 
				+ "\nPercentual de Faturamento dos outros estados:" + String.format("%.2f",(outros / total) * 100) + "%" ;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite o valor do faturamento de SP em R$:");
		double SP = entrada.nextDouble();

		System.out.printf("Digite o valor do faturamento do RJ em R$:");
		double RJ = entrada.nextDouble();

		System.out.printf("Digite o valor do faturamento de MG em R$:");
		double MG = entrada.nextDouble();

		System.out.printf("Digite o valor do faturamento do ES em R$:");
		double ES = entrada.nextDouble();

		System.out.printf("Digite o valor do faturamento referente aos outros Estados em R$:");
		double outros = entrada.nextDouble();
		
		System.out.println(faturamento(SP,RJ,MG,ES,outros));

	}

}
