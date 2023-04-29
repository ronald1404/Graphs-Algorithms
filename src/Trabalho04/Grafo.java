package Trabalho04;

import java.util.ArrayList;

public class Grafo {

    private final int V;
    private int A;

    ArrayList<Aresta> arestas = new ArrayList<Aresta>();

    Aresta Aux = new Aresta();

    public Grafo(int V){
        this.V = V;
    }

    public int V() {
        return this.V;
    }

    public int A() {
        return this.A;
    }

    // Adiciona aresta v->w no grafo
    public void addAresta(int V, int W){
        if (V < 0 || V > this.V|| W < 0 || W > this.V ){
            System.out.println("O vertice inserido não existe no grafo");
            return;
        }
        for (Aresta aresta : arestas) {
            if ((aresta.getV() == V) && (aresta.getW() == W)) {
                System.out.printf("Atividade04.Aresta %d -> %d já existe\n", V, W);
                return;
            }
        }
        arestas.add(new Aresta(V,W));
        A += 1;
    }

    // vertices adjacentes a "V"
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

    public void listArest(){
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
