package _07.const_this_sobre_encap.lab.entities;

public class Account {
	private int numAccount;
	private String name;
	private double saldoConta;

	public Account() {
	}

	public Account(int numAccount, String name) {
		this.numAccount = numAccount;
		this.name = name;
	}
	public Account(int numAccount, String name, double depositoInicial) {
		this.numAccount = numAccount;
		this.name = name;
		deposito(depositoInicial);
	}
	
	public int getAccount() {
		return numAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

		
	public void deposito(double saldo) {
		this.saldoConta += saldo;
	}

	public void sacar(double saldo ) {
		this.saldoConta -= saldo +5.0;
	}
	
	public String toString() {
		return "Account "
				+ getAccount()
				+", Holder: "
				+getName()
				+", Balance: $ "
				+String.format("%.2f%n", saldoConta);
	}

}
