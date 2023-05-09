package grafo;

/**
 * BuscaEmProfundidade
 */
public class BuscaEmProfundidade {
    private boolean[] marcado;
    private int cont;

    public  BuscaEmProfundidade(Grafo g, int s) {
        marcado = new boolean[g.V()];
        this.dfs(g, s);
    }

    private void dfs(Grafo g, int v) {
        marcado[v] = true;
        cont++;
        System.out.println(v+" para "+g.adj(v));
        for (int w: g.adj(v)){
            if(!marcado[w]){
                dfs(g,w);
            }
        }
    }

    public boolean marcado(int w){
        return marcado[w];
    }

    public int cont(){
        return cont;
    }
}