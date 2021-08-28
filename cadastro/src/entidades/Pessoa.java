package entidades;

public class Pessoa {

	//Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
			//nascimento e altura. Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um
			//m�todo para imprimir todos dados de uma pessoa. Crie um m�todo para calcular a idade
			//da pessoa.
	
	private String nome;
	private int nascimento;
	private double altura;
	public Pessoa(String nome, int nascimento, double altura) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNascimento() {
		return nascimento;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int idade (int anoatual) {
		anoatual = 2021;
		return anoatual - nascimento;
	}
	public String toString() {
		return nome + ", " + nascimento + ", " + altura;
	}
}
