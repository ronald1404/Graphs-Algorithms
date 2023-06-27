package FlowNetwork;

import java.util.ArrayList;
import java.util.List;

public class GrafoRedeFluxo {
    private final int V;
    private List<Aresta>[] adj;

    public GrafoRedeFluxo(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();
    }

    public void addAresta(Aresta e) {
        int v = e.de();
        int w = e.para();
        adj[v].add(e);
        adj[w].add(e);
    }

    public Iterable<Aresta> adj(int v) {
        return adj[v];
    }

    public int V(){
        return this.V;
    }
}
