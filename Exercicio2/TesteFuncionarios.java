public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Ana Costa", "F001", 2500, "01/03/2020");

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT(
                "Bruno Reis", "C001", 3000, "10/06/2021", 220, 400);

        Gerente gerente = new Gerente(
                "Carla Mendes", "G001", 8000, "15/01/2018",
                300, 500, 12, 0.20);

        Estagiario estagiario = new Estagiario(
                "Diego Alves", "E001", 0, "05/08/2024",
                1500, 20);

        System.out.println(funcionario);
        System.out.println(funcionarioCLT);
        System.out.println(gerente);
        System.out.println(estagiario);
    }
}
