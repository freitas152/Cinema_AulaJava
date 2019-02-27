package br.com.etec.cinema;

public class Descontos {
	// Atributos
	public String filme;
	public String DiadaSemana;
	public int NroSala;
	public double preco;
	public double desconto;
	
	//metados
	public void CalcularDesconto() {
		if((DiadaSemana=="Quarta")||(DiadaSemana=="quarta")){
			System.out.println("Seu ingresso com desconto: "+(this.desconto = this.preco*0.5));
			}
		else
		{
			System.out.println("Preço normal");
		}
		
		
	}
	
	public void MostraDescontos() 
	{
		System.out.println("Filme de hoje: "+this.filme);
		System.out.println("Hoje é: "+this.DiadaSemana);
		System.out.println("Sua sala é: "+this.NroSala);
		System.out.println("Preço: "+this.preco);
	}
}
