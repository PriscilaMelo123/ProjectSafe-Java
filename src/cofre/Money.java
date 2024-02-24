package safe;
// Classe abstrata Money que serve como base para representar dinheiro
public abstract class Money {
	// Variável que armazena o valor do dinheiro
	double value;
	// Método abstrato para exibir informações sobre o dinheiro
	public abstract void info();
	// Método abstrato para converter o valor do dinheiro
	public abstract double converter();
}
