public class PrecoLancamento extends Preco {

	@Override
	public int getCodigoDePreco() {
		return Fita.LANCAMENTO;
	}

	@Override
	public double getValor(int diasAlugada) {
		return diasAlugada * 3;
	}

	// Lançamento alugado por mais de 1 dia ganha ponto extra
	@Override
	public int getPontosDeAlugadorFrequente(int diasAlugada) {
		return (diasAlugada > 1) ? 2 : 1;
	}
}
