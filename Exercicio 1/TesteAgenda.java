package Exercicio01;

public class TesteAgenda {

	public static void main(String[] args) {
		AgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

		agenda.adicionarAniversariante("Maria", 12, 5);
		agenda.adicionarAniversariante("João", 20, 8);
		agenda.adicionarAniversariante("Pedro", 12, 5);

		System.out.println("Aniversariantes de 12/5: " + agenda.obterAniversariantesDoDia(12, 5));

		agenda.removerAniversariante("Maria");
		System.out.println("Após remover Maria, aniversariantes de 12/5: " + agenda.obterAniversariantesDoDia(12, 5));

		Aniversariante a1 = new Aniversariante("Ana", 3, 1);
		Aniversariante a2 = new Aniversariante("Ana", new DataAniversario(3, 1));
		Aniversariante a3 = new Aniversariante("Ana", 4, 1);

		System.out.println("a1.equals(a2): " + a1.equals(a2)); 
		System.out.println("a1.equals(a3): " + a1.equals(a3));
	}
}
