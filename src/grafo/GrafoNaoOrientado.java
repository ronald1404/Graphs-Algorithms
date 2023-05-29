package grafo;


public class GrafoNaoOrientado extends Grafo{
    
    public GrafoNaoOrientado(int V) {
        super(V);
    }

    @Override
    public void addAresta(int u, int v ){
        boolean aux = vertices.get(u).ListAdjacencias.contains(v);
        int w = pesoAresta(u, v);
        if (!aux){
            vertices.get(u).ListAdjacencias.add(v);
            vertices.get(v).ListAdjacencias.add(u);
            arestas.add(new Aresta(u,v,w));
            arestas.add(new Aresta(v,u,w));
            A += 1;
            MatrizPesosArestas[u][v] = arestas.get(A-1).getU(u, v);
            MatrizPesosArestas[u][v] = arestas.get(A-1).getU(v, u);
        }
    }
}
