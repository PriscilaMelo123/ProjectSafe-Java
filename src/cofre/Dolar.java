package safe;

public class Dolar extends Money{
	// Construtor que recebe um valor em Dólares
	public Dolar (double valueDolar) {
		this.value = valueDolar;
	}
	// Método para exibir informações sobre o objeto Dólar	
	@Override
	public void info() {
		System.out.println("Dólar:" + value);
	}

	// Método para converter o valor do objeto Dólar com base na cotação em 30/10/23
	@Override
	public double converter() {
		// Cálculo da conversão do Dólar para Reais
		return this.value*5.05; // Valor aproximado da cotação em 30/10/23
	}

	@Override
	// Função para comparar objetos da classe Dólar
	public boolean equals (Object moneySpecies) {
		// Verifica se as classes dos objetos são iguais
		if (this.getClass() != moneySpecies.getClass()) {
			return false;
		}
		// Converte o objeto passado para a classe Dólar e compara os valores
		Dolar moneyDolar = (Dolar) moneySpecies;
		// Compara os valores dos objetos Dólar
		if (this.value != moneyDolar.value) {
			return false;
		}
		return true;
	}
}