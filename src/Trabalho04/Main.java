package Trabalho04;

public class Main {
    public static void main(String[] args){

        Grafo G = new Grafo(4);

        G.addAresta(1,4);
        G.addAresta(1,4);
        G.addAresta(4,2);
        G.addAresta(4,3);
        G.addAresta(5,3);
        G.addAresta(1,3);
        G.addAresta(3,1);

        System.out.println(G);

        System.out.println();
        System.out.println("Adjacentes de 1:"+G.adj(1));
        System.out.println("Adjacentes de 2:"+G.adj(2));
        System.out.println("Adjacentes de 3:"+G.adj(3));
        System.out.println("Adjacentes de 4:"+G.adj(4));
    }
}
