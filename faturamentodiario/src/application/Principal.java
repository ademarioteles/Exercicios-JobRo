package application;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import entity.Faturamento;

public class Principal {

	public static void main(String[] args) {
		Faturamento fatu = new Faturamento();
		List<Faturamento> faturamentos = new ArrayList<>();
		int totalDias = 0;
		int superiorMedia = 0;
		double menorFaturamento = 0;
		double maiorFaturamento = 0;
		double totalValor = 0;
		double mediaFaturamento = 0;
		try {
			FileReader arquivoJson = new FileReader("./src/dados.json");
			JSONParser parser = new JSONParser();
			JSONArray objetoArray = (JSONArray) parser.parse(arquivoJson);

			for (int tamanho = 0; tamanho < objetoArray.size(); tamanho++) {
				fatu = new Faturamento();
				JSONObject rec = (JSONObject) objetoArray.get(tamanho);

				if (Double.valueOf(String.valueOf(rec.get("valor"))) > 0) {
					totalDias++;
					totalValor += Double.valueOf(String.valueOf(rec.get("valor")));
					fatu.setDia(totalDias);
					fatu.setValor(Double.valueOf(String.valueOf(rec.get("valor"))));
					faturamentos.add(fatu);

				}
			}

			menorFaturamento = faturamentos.get(0).getValor();
			maiorFaturamento = faturamentos.get(0).getValor();
			mediaFaturamento = totalValor / totalDias;

			for (Faturamento f : faturamentos) {
				if (menorFaturamento > f.getValor()) {
					menorFaturamento = f.getValor();
				}

				if (maiorFaturamento < f.getValor()) {
					maiorFaturamento = f.getValor();
				}
				if (mediaFaturamento > f.getValor()) {
					superiorMedia++;
				}
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("O menor valor de faturamento ocorrido em um dia do mês: R$ "
				+ String.format("%.2f", menorFaturamento));
		System.out.println("O maior valor de faturamento ocorrido em um dia do mês: R$ "
				+ String.format("%.2f", maiorFaturamento));
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "
				+ superiorMedia);
	}
}