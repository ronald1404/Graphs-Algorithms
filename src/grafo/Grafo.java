package grafo;

import java.util.ArrayList;

public abstract class  Grafo {
    
    private final int V;
    protected int A;
    
    ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    ArrayList<Vertice> vertices = new ArrayList<>();
    int[][] MatrizAdjacente; 
    int[][] MatrizPesosArestas;

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
        MatrizPesosArestas = new int[v][v];;
    }

    public int V() {
        return this.V;
    }
    
    public int A() {
        return this.A;
    }

//    Adicionar aresta sem peso
    public void addAresta(int v, int W) {

    }
//    Adicionar aresta com peso
    public void addAresta(int v, int W, int u){
        
    }
    public int pesoAresta(int v, int w){
        for(Aresta aux: arestas){
            if (aux.getV() == v && aux.getW() == w) 
             return aux.getU(v,w);
        }
        return 0;
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

    private void listingArest(){
        for (Aresta aresta : arestas) {
            System.out.println(aresta);
        }
    }

    public ArrayList<Integer> getVertices(){
        ArrayList<Integer> aux = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            aux.add(i);
        }
        return aux;
    }
    
    public void printMatrizPesoArestas() {

        System.out.print("\t-");
        for (int j = 0; j < V; j++) {
            System.out.print( j+" - ");
        }
        System.out.println();
        for (int i = 0; i < V; i++) {
            System.out.printf("L%d\t|", i);
            for (int j = 0; j < V; j++) {
                System.out.print(MatrizPesosArestas[i][j] + " | ");
            }
            System.out.println();
        }
    }
    @Override
    public String toString() {
        System.out.println();
        this.listingArest();
        return "\nGrafo=(" +
                "V=" + V +
                ", A=" + A +
                ')';
    }
}
