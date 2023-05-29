package grafo;

public class BellmanFord extends Algoritmos{

    public BellmanFord(Grafo G, int s){
        inicializa(G,s);
        for(int i = 0; i< G.V();i++){
            for (Aresta aresta : G.arestas) {
                relax(G,aresta.getV(), aresta.getW());
            }
        }
        for (Aresta aresta : G.arestas) {
            // V --> W
            if (d[aresta.getW()] > d[aresta.getV()] + aresta.getPeso()) System.out.println(true);
        }
    }
}
