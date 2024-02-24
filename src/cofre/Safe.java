package safe;

import java.util.ArrayList;

public class Safe {
	// Lista para armazenar objetos Money
	private ArrayList<Money> listMoney;
	// Inicializa a lista de Money
	public Safe () {
		this.listMoney = new ArrayList<>();
	}
	// Adiciona um objeto Money à lista
	public void addPlus (Money money) {
		this.listMoney.add(money);
	}
	// Remove um objeto Money da lista
	public boolean remove (Money money) {
		return this.listMoney.remove(money);
	}
	// Lista todos os objetos Money no cofre
	public void listMoney () {
		// Verifica se a lista está vazia
		if (this.listMoney.isEmpty()) { 
			System.out.println("Seu cofre zerado!");
		}
		// Percorre a lista de Money e chama o método info() em cada um
		for (Money Money : this.listMoney) {
			money.info();
		}
		System.out.println();
	}
	// Converte o valor total dos objetos Money no cofre
	public double converter () {
		// Verifica se a lista está vazia
		if (this.listMoney.isEmpty()) {
			return 0;
		}
		double valueSum = 0;
		// Percorre a lista de Money e soma os valores usando o método converter()
		for (Money money : this.listMoney) {
			valueSum = valueSum + money.converter();		
		}	
		return valueSum;
	}
}