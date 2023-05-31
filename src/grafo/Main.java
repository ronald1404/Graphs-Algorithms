package grafo;

public class Main {
    public static void main(String[] args) {
        
        // //Descomentar para o grafo sem peso de arestas
        // GrafoNaoOrientado g = new GrafoNaoOrientado(9);
        // g.addAresta(0,1);
        // g.addAresta(1,2);
        // g.addAresta(1,4);
        // g.addAresta(2,3);
        // g.addAresta(3,4);
        // g.addAresta(4,5);
        // g.addAresta(4,6);
        // g.addAresta(6,7);
        // g.addAresta(6,8);
        // System.out.println(g);
        // System.out.println();

        // // Algoritmos de Busca e profundidade para o grafo acima
        // BuscaEmProfundidade busca = new BuscaEmProfundidade(g, 0);
        // BuscaEmLargura bEmLargura = new BuscaEmLargura(g, 0);
        
        
        // // descomentar para testar grafo com peso nas arestas
        // GrafoOrientado g = new GrafoOrientado(6);
        // g.addAresta(0, 2, 10);
        // g.addAresta(0, 1, 5);
        // g.addAresta(1, 3, 1);
        // g.addAresta(2, 1, 3);
        // g.addAresta(2, 3, 8);
        // g.addAresta(2, 4, 2);
        // g.addAresta(3, 4, 4);
        // g.addAresta(3, 5, 4);
        // g.addAresta(4, 5, 6);

        
        // // Algoritmo de dijsktra para o grafo acima
        // System.out.println(g);
        // g.printMatriz();
        // System.out.println();
        // Dijkstra djk = new Dijkstra(g, 0);


        // // descomentar para testar Bellmanford
        // GrafoOrientado g = new GrafoOrientado(6);
        // g.addAresta(0, 1, 10);
        // g.addAresta(0, 2, 5);
        // g.addAresta(1, 3, 1);
        // g.addAresta(2, 1, 3);
        // g.addAresta(2, 3, 8);
        // g.addAresta(2, 4, 2);
        // g.addAresta(3, 4, 4);
        // g.addAresta(3, 5, 4);
        // g.addAresta(4, 5, 6);
        // g.addAresta(3, 1, -7);
        // g.addAresta(5, 3, -9);
        // BellmanFord bf =  new BellmanFord(g,0);

    
        // // descomentar para testar FolydWarshall
        // GrafoOrientado g = new GrafoOrientado(6);
        // g.addAresta(0, 1, 10);
        // g.addAresta(0, 2, 5);
        // g.addAresta(1, 3, 1);
        // g.addAresta(2, 1, 3);
        // g.addAresta(2, 3, 8);
        // g.addAresta(2, 4, 2);
        // g.addAresta(3, 4, 4);
        // g.addAresta(3, 5, 4);
        // g.addAresta(4, 5, 6);
        // // g.addAresta(3, 1, -7);
        // FloydWarshall fw = new FloydWarshall(g);
        

        // // descomentar para testar algoritmo de componentes conectados
        // GrafoNaoOrientado g = new GrafoNaoOrientado(8);
        // g.addAresta(0,1);
        // g.addAresta(0,3);
        // g.addAresta(1,2);
        // g.addAresta(4,5);
        // g.addAresta(6,7);
        // ComponentesConectados cc = new ComponentesConectados(g);

        
    }
}
