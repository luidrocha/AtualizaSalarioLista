package entities;

public class Funcionario {

	private  int idFunc;
	private String nomeFunc;
	private double salFunc;
	
	
	public Funcionario(int idFunc, String nomeFunc, double salFunc) {
		
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.salFunc = salFunc;
	}


	public int getIdFunc() {
		return idFunc;
	}		


	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}


	public String getNomeFunc() {
		return nomeFunc;
	}


	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}


	public double getSalFunc() {
		return salFunc;
	}


	public void setSalFunc(double salFunc) {
		this.salFunc = salFunc;
	}
	
	
	public String toString() {
		
		return idFunc +", " + nomeFunc +", " + String.format("%.2f", salFunc);
	}

	
	public void AtualizaSalario( double ajuste) {
	

		salFunc += salFunc * ajuste /100 ;
}
}