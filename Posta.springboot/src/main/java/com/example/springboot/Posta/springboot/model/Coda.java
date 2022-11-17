package com.example.springboot.Posta.springboot.model;

import java.util.ArrayList;

public class Coda {
	private ArrayList<Cliente> coda1;

	public void aggiungiCliente(Cliente cliente) {
		this.coda1.add(cliente);
	}
	
	public int totaleCoda() {
		return coda1.size();	
	}
	
	public Coda() {
		this.coda1 = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Coda1 [coda1=" + coda1 + "]";
	}

	public ArrayList<Cliente> getCoda1() {
		return coda1;
	}

	public void setCoda1(ArrayList<Cliente> coda1) {
		this.coda1 = coda1;
	}
	
}
