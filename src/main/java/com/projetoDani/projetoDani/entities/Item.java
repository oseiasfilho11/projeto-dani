package com.projetoDani.projetoDani.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item {

	private @Id @GeneratedValue Long id;
	private String referencia;
	private Double valor;
	private Integer quantidade;
	private String descricao;
	private String grupo;
	private String grife;

	@ManyToOne
	@JoinColumn(name = "venda")
	private Venda venda;

	public Item() {
	}

	public Item(Long id, String referencia, Double valor, Integer quantidade, String descricao, String grupo,
			String grife, Venda venda) {
		this.id = id;
		this.referencia = referencia;
		this.valor = valor;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.grupo = grupo;
		this.grife = grife;
		this.venda = venda;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getGrife() {
		return grife;
	}

	public void setGrife(String grife) {
		this.grife = grife;
	}

	@JsonIgnore
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id);
	}

}
