package FlowNetwork;

public class Main {
    public static void main(String[] args) {
        GrafoRedeFluxo g = new GrafoRedeFluxo(6);
        g.addAresta(new Aresta(0, 1, 16));
        g.addAresta(new Aresta(0, 2, 13));
        g.addAresta(new Aresta(2, 1, 4));
        g.addAresta(new Aresta(1, 3, 12));
        g.addAresta(new Aresta(3, 2, 9));
        g.addAresta(new Aresta(2, 4, 14));
        g.addAresta(new Aresta(4, 3, 7));
        g.addAresta(new Aresta(3, 5, 20));
        g.addAresta(new Aresta(4, 5, 4));

        FordFulkerson ff = new FordFulkerson(g, 0, 5);
        System.out.println(ff.emCorte(0));
        System.out.println(ff.valor());

    }
}
