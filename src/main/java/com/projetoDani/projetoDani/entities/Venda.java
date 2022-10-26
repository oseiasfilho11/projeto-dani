package com.projetoDani.projetoDani.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Venda {

	private @Id @GeneratedValue Long id;
	private String numeroVenda;
	private Double valorTotal;
	private String filial;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "item_venda", joinColumns = @JoinColumn(name = "Venda_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	private List<Item> listaItens;

	public Venda() {
	}

	public Venda(String numeroVenda, Double valorTotal, String filial) {
		this.numeroVenda = numeroVenda;
		this.valorTotal = valorTotal;
		this.filial = filial;
	}

	public Long getId() {
		return id;
	}

	public String getNumeroVenda() {
		return numeroVenda;
	}

	public void setNumeroVenda(String numeroVenda) {
		this.numeroVenda = numeroVenda;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public void addItem(Item item) {
		this.listaItens.add(item);
	}

	public List<Item> getListaItens() {
		return listaItens;
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
		Venda other = (Venda) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", numeroVenda=" + numeroVenda + ", valorTotal=" + valorTotal + ", filial=" + filial
				+ ", listaItens=" + listaItens + "]";
	}

}
