package grafo;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo(9);

        g.addAresta(0,1);
        g.addAresta(1,2);
        g.addAresta(1,4);
        g.addAresta(2,3);
        g.addAresta(3,4);
        g.addAresta(4,5);
        g.addAresta(4,6);
        g.addAresta(6,7);
        g.addAresta(6,8);
//        g.addAresta(0,1,1);
//        g.addAresta(1,2);
//        g.addAresta(1,4);
//        g.addAresta(2,3);
//        g.addAresta(3,4);
//        g.addAresta(4,5);
//        g.addAresta(4,6);
//        g.addAresta(6,7);
//        g.addAresta(6,8);
        System.out.println(g);
        
        System.out.println();
        g.printMatriz();
        System.out.println(g.adj(5));
//        BuscaEmProfundidade busca = new BuscaEmProfundidade(g, 0);
        
//        BuscaEmLargura bEmLargura = new BuscaEmLargura(g, 0);
    }
}
