package grafo;

import java.util.ArrayList;
import java.util.Arrays;

public class Dijkstra extends Algoritmos {
    public Dijkstra(Grafo g, int s){

        System.out.println("\nMatriz de peso das arestas:");
        g.printMatrizPesoArestas();

        inicializa(g, s);
        ArrayList<Integer> S = new ArrayList<>();
        ArrayList<Integer> Q = g.getVertices();

        
        System.out.println(Q);
        while(!Q.isEmpty()){
            System.out.println("\t"+Arrays.toString(d));
            int u = Q.remove(0);
            S.add(u);
            for(int v: g.adj(u)){
                relax(g,u,v);
                System.out.printf("de %d para %d =  %d\n",u,v,d[v]);
            }
        }
    }
}
