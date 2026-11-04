import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> alugueis = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		alugueis.add(aluguel);
	}

	public String extrato() {
		String resultado = "Registro de Alugueis de " + getNome() + "\n";

		for (Aluguel aluguel : alugueis) {
			resultado += "\t" + aluguel.getFita().getTitulo() + "\t" + aluguel.getValor() + "\n";
		}

		resultado += "Valor total devido: " + getValorTotal() + "\n";
		resultado += "Você ganhou " + getTotalDePontosDeAlugadorFrequente() + " pontos de alugador frequente";
		return resultado;
	}

	// Replace Temp with Query: as variáveis temporárias viraram métodos
	private double getValorTotal() {
		double total = 0;
		for (Aluguel aluguel : alugueis) {
			total += aluguel.getValor();
		}
		return total;
	}

	private int getTotalDePontosDeAlugadorFrequente() {
		int pontos = 0;
		for (Aluguel aluguel : alugueis) {
			pontos += aluguel.getPontosDeAlugadorFrequente();
		}
		return pontos;
	}
}
