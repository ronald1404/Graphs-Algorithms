package grafo;

import java.util.ArrayList;

public class Grafo {
    
    private final int V;
    private int A;
    
    ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    ArrayList<Vertice> vertices = new ArrayList<>();
    int[][] MatrizAdjacente; 

    public Grafo(int V) {
        this.V = V;
        initVertices(V);
    }
    
    private void initVertices(int v) {
        for (int i = 0; i < V; i++) {
            vertices.add(new Vertice());
        }
        MatrizAdjacente = new int[v][v];
    }

    public int V() {
        return this.V;
    }
    
    public int A() {
        return this.A;
    }
    
    public void addAresta(int v, int W) {
        if (v >= this.V || W < 0 || W >= this.V) return;
        if (!vertices.get(v).ListAdjacencias.contains(W)){
            vertices.get(v).ListAdjacencias.add(W);
            arestas.add(new Aresta(v,W));
            A += 1;
        }
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
        System.out.print("\t-");
        for (int j = 0; j < V; j++) {
            System.out.print( j+" - ");
        }System.out.println();

        for (int i = 0; i < V; i++) {
            System.out.printf("L%d\t|", i);
            for (int j = 0; j < V; j++) {
                System.out.print(MatrizAdjacente[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public Iterable<Integer> adj(int v) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Aresta aux : arestas) {
            if (aux.getV() == v) {
                if (!list.contains(aux.getW()))
                    list.add(aux.getW());
            } else if (aux.getW() == v) {
                if (!list.contains(aux.getV()))
                    list.add(aux.getV());
            }
        }
        return list;
    }

    private void listArest(){
        for (Aresta aresta : arestas) {
            System.out.println(aresta);
        }
    }

    @Override
    public String toString() {
        System.out.println();
        this.listArest();
        return "\nAtividade04.Grafo=(" +
                "V=" + V +
                ", A=" + A +
                ')';
    }
}
