package Exercicio01;

public class Aniversariante {

	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}

	public Aniversariante(String nome, DataAniversario dataAniversario) {
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public boolean equals(Object outroObjeto) {
		if (this == outroObjeto) {
			return true;
		}
		if (!(outroObjeto instanceof Aniversariante)) {
			return false;
		}
		Aniversariante outroAniversariante = (Aniversariante) outroObjeto;
		return this.nome.equals(outroAniversariante.nome)
				&& this.dataAniversario.equals(outroAniversariante.dataAniversario);
	}

	@Override
	public String toString() {
		return nome + " - " + dataAniversario;
	}
}
