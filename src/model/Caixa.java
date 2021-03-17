package model;

public class Caixa {
	private double valorInicial;
	private Funcionario funcionario;
	private int numVendas;
	private String dataAberturaCaixa;
	private String horarioAbeturaCaixa;
	private String horarioFechamentoCaixa;
	private double valorFinal;
	private Venda venda;
	
	public Caixa() {
		
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}

	public String getDataAberturaCaixa() {
		return dataAberturaCaixa;
	}

	public void setDataAberturaCaixa(String dataAberturaCaixa) {
		this.dataAberturaCaixa = dataAberturaCaixa;
	}

	public String getHorarioAbeturaCaixa() {
		return horarioAbeturaCaixa;
	}

	public void setHorarioAbeturaCaixa(String horarioAbeturaCaixa) {
		this.horarioAbeturaCaixa = horarioAbeturaCaixa;
	}

	public String getHorarioFechamentoCaixa() {
		return horarioFechamentoCaixa;
	}

	public void setHorarioFechamentoCaixa(String horarioFechamentoCaixa) {
		this.horarioFechamentoCaixa = horarioFechamentoCaixa;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	

}
