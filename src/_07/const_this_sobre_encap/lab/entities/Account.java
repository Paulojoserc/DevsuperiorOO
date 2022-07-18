package _07.const_this_sobre_encap.lab.entities;

import _07.const_this_sobre_encap.lab.util.TaxaSaque;

public class Account {
	private int numAccount;
	private String name;
	private double saldo;

	public Account() {
	}

	public Account(int numAccount, String name) {
		this.numAccount = numAccount;
		this.name = name;
	}
	public Account(int numAccount, String name, double saldo) {
		this.numAccount = numAccount;
		this.name = name;
		this.saldo = saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAccount() {
		return numAccount;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void sacar(double saldo ) {
		this.saldo -= saldo ;
	}
	
	public String toString() {
		return "Account "
				+ getAccount()
				+", Holder: "
				+getName()
				+", Balance: $ "
				+String.format("%.2f%n", getSaldo());
	}

}
