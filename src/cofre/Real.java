package safe;

public class Real extends Money {
	// Construtor que recebe um valor em Reais
	public Real (double valueReal) {
		// Chama o construtor da classe pai (Money) para definir o valor
		this.value = valueReal;
	}
	// Método para exibir informações sobre o objeto Real
	@Override
	public void info() {
		// Imprime uma mensagem indicando que se trata de um valor em Reais e o valor em si
		System.out.println("Real:" + value);
	}
	// Método para converter o valor do objeto Real
	@Override
	public double converter() {
		// O valor em Reais é a própria representação em Reais, então retornamos o valor diretamente
		return this.value;
	}
	
	@Override 
	// Função para comparar objetos da classe Real
	public boolean equals (Object moneySpecies) {
		// Verifica se as classes dos objetos são iguais
		if (this.getClass() != moneySpecies.getClass()) {
			return false; // As classes são diferentes, os objetos não são iguais
		}
		// Converte o objeto passado para a classe Real para comparar os valores
		Real moneyReal = (Real) moneySpecies;
		// Compara os valores dos objetos Real
		if (this.value != moneyReal.value) {
			return false; // Os valores são diferentes, os objetos não são iguais
		}
		return true; // Se as classes e os valores forem iguais, os objetos são considerados iguais
	}
}
