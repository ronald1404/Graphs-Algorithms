package grafo;

public abstract class Algoritmos {
    int[] d;
    int[] pi;
    
    public void inicializa(Grafo g, int s){
        d = new int[g.V()];
	    pi = new int[g.V()];
        for  (int v = 0 ; v < g.V(); v++){
            pi[v] = -1;
            d[v] = 99999;
        }         
        d[s] = 0;
    }

    public void relax(Grafo g, int u, int v){
        int peso = g.pesoAresta(u, v);
        if (d[v] > d[u] + peso){ 
            // System.out.printf("d[%d] era %d\n",v,d[v]);
            d[v] = d[u] + peso;
            pi[v] = u;
        }
    }
}
