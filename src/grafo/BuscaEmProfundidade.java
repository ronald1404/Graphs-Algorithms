package grafo;

/**
 * BuscaEmProfundidade
 */
public class BuscaEmProfundidade {
    private boolean[] marcado;
    private String[] cor;
    private int[] d;
    private int[] f;
    private int[] pi;
    private int tempo = 0;
    
    public  BuscaEmProfundidade(GrafoOrientado g, int s) {    
            
        marcado = new boolean[g.V()];
        cor = new String[g.V()];
        inicializaCores(g);
        d = new int[g.V()];
        f = new int[g.V()];
        pi = new int[g.V()];
        this.dfs(g, s);
    }

    private void inicializaCores(GrafoOrientado g){
        for (int i = 0 ; i < g.V(); i++){
            cor[i] = "branco";
        }
    }
    
    private void dfs(GrafoOrientado g, int v) {

        cor[v] = "cinza";
        marcado[v] = true;
        tempo++;
        d[v] = tempo;

        System.out.printf("\nd[%d] = %d\n",v,d[v]);
        System.out.println("cor["+v+"] = "+ cor[v]);

        for (int w: g.adj(v)){
            if(!marcado[w]){
                pi[w] = v;
                dfs(g,w);
            }
        }

        tempo ++;
        f[v] = tempo;
        cor[v] = "preto";

        
        System.out.println("\nf["+v+"] = "+ f[v]);
        System.out.println("cor["+v+"] = "+ cor[v]);
        System.out.println("pi["+v+"] = "+ pi[v]);
    }

    public boolean marcado(int w){
        return marcado[w];
    }

    public int tempo(){
        return tempo;
    }
}