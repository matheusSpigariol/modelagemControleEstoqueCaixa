package model;

public class Produto {
	private String nomeProduto;
	private int idProduto;
	private int quantidade;
	private String descricaoQuantidade;
	private boolean vencivel;
	private String dataValidade;
	private String observacoes;
	
	public Produto() {
		
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricaoQuantidade() {
		return descricaoQuantidade;
	}

	public void setDescricaoQuantidade(String descricaoQuantidade) {
		this.descricaoQuantidade = descricaoQuantidade;
	}

	public boolean isVencivel() {
		return vencivel;
	}

	public void setVencivel(boolean vencivel) {
		this.vencivel = vencivel;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
