package Trabalho03;

public class Main {
    //implemente representações computaciona de Grafos
    //por meio de Listas de Adjacências e Matrizes de Adjacências.
    public static void main(String[] args) {

        Grafo graph = new Grafo(5);

        graph.addAresta(0,0);
        graph.addAresta(1,1);
        graph.addAresta(2,3);
        graph.addAresta(4,1);
        graph.addAresta(2,5);
        graph.addAresta(0,4);
        graph.addAresta(3,2);

        graph.printMatriz();

    }
}
