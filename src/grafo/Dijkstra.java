package grafo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra extends Algoritmos {
    // private IndexMinPQ<Double> pq;

    public Dijkstra(Grafo g, int s) {

        System.out.println("\nMatriz de peso das arestas:");
        g.printMatrizPesoArestas();

        inicializa(g, s);
        ArrayList<Integer> S = new ArrayList<>();
        ArrayList<Integer> Q = g.getVertices();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(ve -> d[ve]));
        queue.offer(s); // Adiciona s a fila de prioridade

        while (!queue.isEmpty()) {
            int u = queue.poll(); // Remove e retorna o menor elemento

            S.add(u); // Adiciona a fila de caminhos curtos do grafo
            Q.remove(Integer.valueOf(u)); // remove u da lista de vértices intergers

            for (int v : g.adj(u)) {
                relax(g, u, v);
                System.out.printf("de %d para %d =  %d\n", u, v, d[v]);
                
                if (!queue.contains(v)) {
                    queue.offer(v);
                }
            }
            System.out.println(queue.toString());
        }
        System.out.println("\t" + Arrays.toString(d));
    }
}
