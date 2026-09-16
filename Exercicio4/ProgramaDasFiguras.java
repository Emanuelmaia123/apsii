public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        // a) Adiciona mais dois losangos ao gerente
        Losango l1 = new Losango(4.0, 6.0);
        Losango l2 = new Losango(5.0, 8.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        // b) Imprime todas as figuras cadastradas
        gerente.imprimeFiguras();

        // c) Calcula e imprime a área total de todas as figuras cadastradas
        double areaTotal = gerente.calculaAreaTotalDeFiguras();
        System.out.println("Área total das figuras: " + areaTotal);
    }
}
