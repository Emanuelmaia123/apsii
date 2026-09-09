/**
 * Classe que representa um CD, que é um tipo de Produto
 * e implementa a interface InfoGerais.
 */
public class CD extends Produto implements InfoGerais {

    private int numFaixas;

    public CD() {
        super();
    }

    public CD(String nome, double preco, int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public void exibeInformacoes() {
        System.out.println("=== Informações do CD ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de faixas: " + numFaixas);
    }
}
