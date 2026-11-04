public class Fita {

	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;

	private String titulo;
	private Preco preco;

	public Fita(String titulo, int codigoDePreco) {
		this.titulo = titulo;
		setCodigoDePreco(codigoDePreco); // Rename Method (antes: setcodigoDePreco)
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCodigoDePreco() {
		return preco.getCodigoDePreco();
	}

	// Único ponto do sistema que ainda decide qual Preco usar
	public void setCodigoDePreco(int codigoDePreco) {
		switch (codigoDePreco) {
		case NORMAL:
			preco = new PrecoNormal();
			break;
		case LANCAMENTO:
			preco = new PrecoLancamento();
			break;
		case INFANTIL:
			preco = new PrecoInfantil();
			break;
		default:
			throw new IllegalArgumentException("Código de preço inválido: " + codigoDePreco);
		}
	}

	public double getValor(int diasAlugada) {
		return preco.getValor(diasAlugada);
	}

	public int getPontosDeAlugadorFrequente(int diasAlugada) {
		return preco.getPontosDeAlugadorFrequente(diasAlugada);
	}
}
