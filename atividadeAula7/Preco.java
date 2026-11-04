/**
 * Replace Conditional with Polymorphism (State):
 * cada tipo de fita define seu próprio cálculo de valor e de pontos.
 */
public abstract class Preco {

	public abstract int getCodigoDePreco();

	public abstract double getValor(int diasAlugada);

	// Regra padrão: 1 ponto por aluguel. Subclasses podem sobrescrever.
	public int getPontosDeAlugadorFrequente(int diasAlugada) {
		return 1;
	}
}
