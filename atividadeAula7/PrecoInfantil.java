public class PrecoInfantil extends Preco {

	@Override
	public int getCodigoDePreco() {
		return Fita.INFANTIL;
	}

	@Override
	public double getValor(int diasAlugada) {
		double valor = 1.5;
		if (diasAlugada > 3)
			valor += (diasAlugada - 3) * 1.5;
		return valor;
	}
}
