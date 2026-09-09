import java.util.Scanner;

/**
 * Classe principal do programa.
 * - Instancia Scanner, Livro e CD.
 * - Recebe os dados de cada produto pelo teclado.
 * - Envia os dados para cada objeto (via setters).
 * - Exibe as informações do CD cadastrado.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        CD cd = new CD();

        // ----- Dados do Livro -----
        System.out.println("=== Cadastro de Livro ===");
        System.out.print("Nome do livro: ");
        String nomeLivro = scanner.nextLine();

        System.out.print("Preço do livro: ");
        double precoLivro = Double.parseDouble(scanner.nextLine());

        System.out.print("Autor do livro: ");
        String autorLivro = scanner.nextLine();

        livro.setNome(nomeLivro);
        livro.setPreco(precoLivro);
        livro.setAutor(autorLivro);

        // ----- Dados do CD -----
        System.out.println();
        System.out.println("=== Cadastro de CD ===");
        System.out.print("Nome do CD: ");
        String nomeCD = scanner.nextLine();

        System.out.print("Preço do CD: ");
        double precoCD = Double.parseDouble(scanner.nextLine());

        System.out.print("Número de faixas: ");
        int numFaixas = Integer.parseInt(scanner.nextLine());

        cd.setNome(nomeCD);
        cd.setPreco(precoCD);
        cd.setNumFaixas(numFaixas);

        // ----- Exibe as informações do CD cadastrado -----
        System.out.println();
        cd.exibeInformacoes();

        scanner.close();
    }
}
