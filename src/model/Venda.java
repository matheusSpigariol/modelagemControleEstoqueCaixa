package model;

public class Venda {
	private int idVenda;
	private Produto produtos;
	private double valorVenda;
	private String horarioVenda;
	
	public Venda() {
		
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getHorarioVenda() {
		return horarioVenda;
	}

	public void setHorarioVenda(String horarioVenda) {
		this.horarioVenda = horarioVenda;
	}
	

}
