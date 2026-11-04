public class Aluguel {
	private int diasAlugada;
	private Fita fita;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}

	// Extract Method + Move Method: o cálculo saiu de Cliente.extrato()
	// e foi para quem possui os dados (Aluguel / Fita).
	public double getValor() {
		return fita.getValor(diasAlugada);
	}

	public int getPontosDeAlugadorFrequente() {
		return fita.getPontosDeAlugadorFrequente(diasAlugada);
	}
}
