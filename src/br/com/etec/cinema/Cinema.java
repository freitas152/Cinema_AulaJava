package br.com.etec.cinema;

public class Cinema {

	public static void main(String[] args) {
     Descontos cinema = new Descontos();
		
		cinema.filme = "Zumbi";
		cinema.preco = 8.00;
		cinema.DiadaSemana = "quarta";
		cinema.NroSala = 3;
		cinema.desconto = 0.5;
		
		//chamada de métodos
		
		cinema.MostraDescontos();
		cinema.CalcularDesconto();

	}

}
