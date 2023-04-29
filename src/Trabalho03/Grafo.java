package Trabalho03;

import Trabalho04.Aresta;

import java.util.ArrayList;

public class Grafo {

    private final int V;

    ArrayList<Vertice> vertices = new ArrayList<>();
    int[][] MatrizAdjacente;

    public Grafo(int V) {
        this.V = V;
        initVertices(V);
        MatrizAdjacente = new int[V][V];
    }

    private void initVertices(int v) {
        for (int i = 0; i < V; i++) {
            vertices.add(new Vertice());
        }
    }

    public int getV() {
        return V;
    }

    public void addAresta(int v, int W) {
        if (v >= this.V || W < 0 || W >= this.V) return;
        if (!vertices.get(v).ListAdjacencias.contains(W))
            vertices.get(v).ListAdjacencias.add(W);
    }

    private int[][] percorreMatriz() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (vertices.get(i).ListAdjacencias.contains(j))
                    MatrizAdjacente[i][j] = 1;
                else MatrizAdjacente[i][j] = 0;
            }
        }
        return MatrizAdjacente;
    }

    public void printMatriz() {

        percorreMatriz();

        for (int j = 0; j < V; j++) {
            System.out.print("\t C" + j);
        }System.out.println();

        for (int i = 0; i < V; i++) {
            System.out.printf("L%d\t|", i);
            for (int j = 0; j < V; j++) {
                System.out.print(MatrizAdjacente[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
