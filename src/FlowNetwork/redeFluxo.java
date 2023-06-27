package FlowNetwork;

import java.util.ArrayList;
import java.util.List;

public class redeFluxo {
    private final int V;
    private List<Aresta>[] adj;

    public redeFluxo(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int v = 0; v < V; v++)
            adj[v] = new ArrayList<>();
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
