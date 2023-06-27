package FlowNetwork;

public class Aresta {
    private final int v, w;
    private final double capacidade; 
    private double fluxo;

    public Aresta(int v, int w, double capacidade) {
        this.v = v;
        this.w = w;
        this.capacidade = capacidade;
    }

    public int de() {
        return v;
    }

    public int para() {
        return w;
    }

    public double capacidade() {
        return capacidade;
    }

    public double fluxo() {
        return fluxo;
    }

    public int outro(int vertice) {
        if (vertice == v)
            return w;
        else if (vertice == w)
            return v;
        else
            throw new IllegalArgumentException();
    }

    public double capacidadeResidualPara(int vertice) {
        if (vertice == v)
            return fluxo;
        else if (vertice == w)
            return capacidade - fluxo;
        else
            throw new IllegalArgumentException();
    }

    public void AddFluxoResidualPara(int vertice, double delta) {
        if (vertice == v)
            fluxo -= delta;
        else if (vertice == w)
            fluxo += delta;
        else
            throw new IllegalArgumentException();
    }
}