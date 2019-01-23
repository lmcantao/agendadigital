package br.com.iftm.entity;

public class Telefone {

	private Integer codigo;

	private Integer DDD;

	private Integer numero;

	private PrestadorDeServico codPrestadorServico;

	public PrestadorDeServico getCodPrestadorServico() {
		return codPrestadorServico;
	}

	public void setCodPrestadorServico(PrestadorDeServico codPrestadorServico) {
		this.codPrestadorServico = codPrestadorServico;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getDDD() {
		return DDD;
	}

	public void setDDD(Integer dDD) {
		DDD = dDD;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
