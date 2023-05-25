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
        // criar a matriz ao inicializar os vértices
        MatrizAdjacente = new int[v][v];
    }

    public int V() {
        return this.V;
    }
    
    public int A() {
        return this.A;
    }

//    Adicionar aresta sem peso
    public void addAresta(int v, int W) {
        if (v >= this.V || W < 0 || W >= this.V) return;
        boolean aux = vertices.get(v).ListAdjacencias.contains(W);
        if (!aux){
            vertices.get(v).ListAdjacencias.add(W);
            vertices.get(W).ListAdjacencias.add(v);
            arestas.add(new Aresta(W,v));
            arestas.add(new Aresta(v,W));
            A += 1;
        }
    }
//    Adicionar aresta com peso
    public void addAresta(int v, int W, int u) {

        if (v >= this.V || W < 0 || W >= this.V) return;
        boolean aux = vertices.get(v).ListAdjacencias.contains(W);

        if (!aux){
            vertices.get(v).ListAdjacencias.add(W);
            vertices.get(W).ListAdjacencias.add(v);
            arestas.add(new Aresta(W,v, u));
            arestas.add(new Aresta(v,W, u));
            A += 1;
        }
    }
    
    private int[][] percorreMatriz() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                boolean aux = vertices.get(i).ListAdjacencias.contains(j);
                MatrizAdjacente[i][j] = (aux) ? 1 : 0;
            }
        }
        return MatrizAdjacente;
    }

    public void printMatriz() {
        
        percorreMatriz();
        System.out.print("\t-");
        for (int j = 0; j < V; j++) {
            System.out.print( j+" - ");
        }
        System.out.println();
        for (int i = 0; i < V; i++) {
            System.out.printf("L%d\t|", i);
            for (int j = 0; j < V; j++) {
                System.out.print(MatrizAdjacente[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public Iterable<Integer> adj(int v) {
        ArrayList<Integer> list = vertices.get(v).ListAdjacencias;
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
        return "\nGrafo=(" +
                "V=" + V +
                ", A=" + A +
                ')';
    }
}
