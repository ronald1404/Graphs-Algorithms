package grafo;

public class CC {
    private boolean[] marcado;
    private int[] id;
    private int count;

    public CC(Grafo G) {
        marcado = new boolean[G.V()];
        id = new int[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marcado[v]) {
                dfs(G, v);
                count++;
            }
        }
    }

    public int count(){
        return count;
    }

    private void dfs(Grafo G, int v){
        marcado[v] = true;
        id[v] = count;
        for (int w : G.adj(v)){
            if (!marcado[w]) 
                dfs(G, w);
        }
    }
}