package br.usjt.arqsw.entity;

import java.io.Serializable;

/**
 * 
 * @author Filipe Roque CCP_816118349
 *
 */
public class Fila implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
}
