package safe;

public class Euro extends Money{
	// Construtor que recebe um valor em Euros
	public Euro (double valueEuro) {
		this.value = valueEuro;
	}
		
	// Método para exibir informações sobre o objeto Euro
	@Override
	public void info() {
		System.out.println("Euro:" + value);
	}

	@Override
	// Método para converter o valor do objeto Euro com base na cotação em 30/10/23
	public double converter() {
		// Cálculo da conversão do Euro para Reais
		return this.value*5.36; // Valor aproximado da cotação em 30/10/23
	}

	@Override
	//função remover
	// Função para comparar objetos da classe Euro
	public boolean equals (Object moneySpecies) {
		// Verifica se as classes dos objetos são iguais
		if (this.getClass() != moneySpecies.getClass()) {
			return false;
		}
		// Converte o objeto passado para a classe Euro e compara os valores
		Euro moneyEuro = (Euro) moneySpecies;
		// Compara os valores dos objetos Euro
		if (this.value != moneyEuro.value) {
			return false;
		}	
		return true;
	}
}