package com.example.springboot.Posta.springboot.model;

public class Cliente {
	 private int numerocoda;

	public int getNumerocoda() {
		return numerocoda;
	}

	public void setNumerocoda(int numerocoda) {
		this.numerocoda = numerocoda;
	}

	@Override
	public String toString() {
		return "il tuo numero coda è numerocoda=" + numerocoda ;
	}
	 

}
