package grafo;


public class GrafoOrientado extends Grafo{
    
    public GrafoOrientado(int V) {
        super(V);
    }

    @Override
    public void addAresta(int u, int v, int w){

        boolean aux = vertices.get(u).ListAdjacencias.contains(v);
        if (!aux){
            vertices.get(u).ListAdjacencias.add(v);
            arestas.add(new Aresta(u,v,w));
            A += 1;
            MatrizPesosArestas[u][v] = arestas.get(A-1).getU(u, v);
        }
    }
}
