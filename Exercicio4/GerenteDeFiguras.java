import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica fig) {
        this.figuras.add(fig);
    }

    public double calculaAreaTotalDeFiguras() {
        double total = 0.0;
        for (FiguraGeometrica fig : this.figuras) {
            total += fig.calculaArea();
        }
        return total;
    }

    public List<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    // Imprime na saída padrão o nome de cada figura cadastrada
    public void imprimeFiguras() {
        for (FiguraGeometrica fig : this.figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }

    // Retorna a área da figura de maior área cadastrada no gerente
    public double getMaiorAreaDeFigura() {
        double maiorArea = 0.0;
        for (FiguraGeometrica fig : this.figuras) {
            double area = fig.calculaArea();
            if (area > maiorArea) {
                maiorArea = area;
            }
        }
        return maiorArea;
    }
}
