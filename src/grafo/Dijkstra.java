package grafo;

import java.util.ArrayList;

public class Dijkstra {
    int[] d;
    int[] pi;
    private int cont;
    /**
     * @param g
     * @param s
     */
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
            System.out.printf("de %d para %d =  %d\n",u,v,d[v]);
        }
    }
    public Dijkstra(Grafo g, int s){

        System.out.println("\nMatriz de peso das arestas:");
        g.printMatrizPesoArestas();

        inicializa(g, s);
        ArrayList<Integer> S = new ArrayList<>();
        ArrayList<Integer> Q = g.getVertices();
        
        while(!Q.isEmpty()){
            int u = Q.remove(0);
            S.add(u);
            for(int v: g.adj(u)){
                relax(g,u,v);
            }
        }        
    }
}
