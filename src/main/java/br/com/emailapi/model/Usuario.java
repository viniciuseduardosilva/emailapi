package br.com.emailapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {

	@JsonProperty("id")
	private Long id;

	@JsonProperty("ong")
	private Ong ong;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("nivel")
	private String nivel;

	@JsonProperty("login")
	private String login;

	@JsonProperty("senha")
	private String senha;

	@JsonProperty("email")
	private String email;

	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ong getOng() {
		return ong;
	}

	public void setOng(Ong ong) {
		this.ong = ong;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", ong=" + ong + ", nome=" + nome + ", nivel=" + nivel + ", login=" + login
				+ ", senha=" + senha + ", email=" + email + "]";
	}
}
