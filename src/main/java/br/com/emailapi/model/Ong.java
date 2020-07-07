package br.com.emailapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ong {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("database")
	private String database;

	public Ong() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "Ong [id=" + id + ", nome=" + nome + ", database=" + database + "]";
	}
}
