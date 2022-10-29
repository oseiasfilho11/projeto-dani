package com.projetoDani.projetoDani.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrdemServico {

	private @Id @GeneratedValue Long id;
	private String documento;
	private String numeroOs;
	private String codigo_externo;

	@ManyToOne
	@JoinColumn(name = "venda")
	private Venda venda;

	public OrdemServico() {
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNumeroOs() {
		return numeroOs;
	}

	public void setNumeroOs(String numeroOs) {
		this.numeroOs = numeroOs;
	}

	public String getCodigo_externo() {
		return codigo_externo;
	}

	public void setCodigo_externo(String codigo_externo) {
		this.codigo_externo = codigo_externo;
	}

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
		return Objects.hash(codigo_externo, documento, id, numeroOs, venda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(codigo_externo, other.codigo_externo) && Objects.equals(documento, other.documento)
				&& Objects.equals(id, other.id) && Objects.equals(numeroOs, other.numeroOs)
				&& Objects.equals(venda, other.venda);
	}
	
	

}
