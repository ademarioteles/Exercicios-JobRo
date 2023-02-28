package application;

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
		return "Percentual de Faturamento de SP:" + String.format("%.2f", (SP / total) * 100) + "%"
				+ "\nPercentual de Faturamento de RJ:" + String.format("%.2f", (RJ / total) * 100) + "%"
				+ "\nPercentual de Faturamento de MG:" + String.format("%.2f", (MG / total) * 100) + "%"
				+ "\nPercentual de Faturamento de ES:" + String.format("%.2f", (ES / total) * 100) + "%"
				+ "\nPercentual de Faturamento dos outros estados:" + String.format("%.2f", (outros / total) * 100)
				+ "%";
	}

	public static void main(String[] args) {

		double SP = 67.83643;

		double RJ = 36.67866;

		double MG = 29.22988;

		double ES = 27.16548;

		double outros = 19.84953;

		System.out.println(faturamento(SP, RJ, MG, ES, outros));

	}

}
