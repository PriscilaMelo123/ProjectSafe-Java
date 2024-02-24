package safe;

import java.util.Scanner;

public class Menu {
	
	private Scanner start;
	private Safe safeEconomy;
	// Construtor da classe Menu
	public Menu() {
		start = new Scanner(System.in);
		safeEconomy = new Safe();
	}
	// Método para iniciar o menu
	public void MenuStart () { 
		System.out.println("Cofre - RU1878658 PRISCILA TAIS DE MELO");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular Total Convertido para Real");
		System.out.println("0 - Encerrar");
		String option = start.next();
		System.out.println(option);
		
		switch (option) {
			case "0":
				System.out.println("Operação Finalizada!");
				break;
				
			case "1":
				addMoney();
				System.out.println();
				MenuStart();
				break;
				
			case "2":
				removeMoney();
				System.out.println();
				MenuStart();
				break;
			
			case "3": 
				safeEconomy.listMoney();
				System.out.println();
				MenuStart();
				break;
			
			case "4": 
				double totalConverter = safeEconomy.converter();
				System.out.println("Valor total com conversão para Real: " + totalConverter);
				MenuStart();
				break;
				
			default:
				System.out.println("Opção Inválida, escolha uma opção válida!");
				MenuStart();			
				break;
		}
	}
		// Método para adicionar moedas ao cofre
		private void addMoney() {
			System.out.println("Selecione a Moeda desejada");
			System.out.println("1 - Dolar");
			System.out.println("2 - Euro");
			System.out.println("3 - Real");
			System.out.println("0 - Retornar ao Menu");		
			int optionMoney = start.nextInt();
			if (optionMoney == 0) {
				MenuStart();
			}
			System.out.println("Valor à Depositar:");
			String deposit = start.next();
			double valorDeposit = Double.valueOf(deposit);
			Money money = null;
			if (optionMoney == 1) {
				money = new Dolar(valorDeposit);
			}
			else if (optionMoney == 2) {
				money = new Euro (valorDeposit);
			}
			else if	(optionMoney == 3) {
				money = new Real (valorDeposit);
			}	
			else {
				System.out.println("Opção Inválida, selecione uma opção válida!");				
			}
			safeEconomy.addPlus(money);
			System.out.println("Valor depositado!");
		}
		// Método para remover moedas do cofre
		private void removeMoney() {
			System.out.println("Selecione a Moeda Desejada");
			System.out.println("1 - Dolar");
			System.out.println("2 - Euro");
			System.out.println("3 - Real");
			System.out.println("0 - Retornar ao menu");
			int optionMoney = start.nextInt();
			if (optionMoney == 0) {
				MenuStart();
			}
			System.out.println("Moeda à remover:");
			String withdraw = start.next();
			double valueWithdraw = Double.valueOf(withdraw);
			Money money=null;		
			if (optionMoney == 1) {
				money = new Dolar(valueWithdraw);
			}
			else if (optionMoney == 2) {
				money = new Euro (valueWithdraw);
			}
			else if (optionMoney == 3) {
				money = new Real (valueWithdraw);
			}
			else {
				System.out.println("Opção Inválida, selecione opção válida!");
				removeMoney();
			}
			if (safeEconomy.remove(money)) {
				System.out.println("Moeda removida com sucesso!");
			}
			else {
				System.out.println("Moeda Existe");
			}			
		}
}