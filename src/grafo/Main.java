package grafo;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo(5);

        g.addAresta(1,4);
        g.addAresta(1,4);
        g.addAresta(4,2);
        g.addAresta(4,3);
        g.addAresta(5,3);
        g.addAresta(1,3);
        g.addAresta(3,1);

        System.out.println(g);

        
        System.out.println();
        System.out.println("Adjacentes de 1:"+g.adj(1));
        System.out.println("Adjacentes de 2:"+g.adj(2));
        System.out.println("Adjacentes de 3:"+g.adj(3));
        System.out.println("Adjacentes de 4:"+g.adj(4));
        g.printMatriz();

        BuscaEmProfundidade busca = new BuscaEmProfundidade(g, 1
        );

        System.out.println("teste "+ busca.cont());
    }
}
