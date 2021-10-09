package com.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // Anotando a classe pois essa classe vai ser uma tabela no nosso banco de dados.
public class Convidado {
	
	@Id // Como o rg é único, ele será a chave primária
	private String rg;
	private String nomeconvidado;
	
	@ManyToOne // A tabela convidados para a tabela evento é uma relação de n para 1, ou seja ManyToOne
	private Evento evento;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeconvidado() {
		return nomeconvidado;
	}
	public void setNomeconvidado(String nomeconvidado) {
		this.nomeconvidado = nomeconvidado;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	
}
