package grafo;

import java.util.ArrayList;
import java.util.List;

public class BuscaEmLargura {
    
    private boolean[] marcado;
    private String [] cor;
    private int [] pi;
    private int[] d;

    public BuscaEmLargura(Grafo G, int s) {
        marcado = new boolean[G.V()];
        cor = new String[G.V()];
        d = new int[G.V()];
        pi = new int[G.V()];
        bfs(G, s);
    }

    private void bfs(Grafo G, int s) {

        // Inicializar com vértices brancos
        for (int i = 0; i < G.V() ; i++ ){
            cor[i] = "Branco";
        }

        // Criar Lista e marcar o primeiro indice escolhido
        List <Integer> fila = new ArrayList<Integer>();
        d[s] = 0;
        // s não possui antecessor -1 para representação
        pi[s] = -1;
        cor[s] = "Cinza";
        marcado[s] = true;
        fila.add(s);
        
        // enquanto a fila não estiver vazia
        while (!fila.isEmpty()) {

            // pegue o primeiro elemento
            int u = fila.remove(0);

            System.out.println(String.format("\nd[%d] = %d",u,d[u]));
            System.out.println(String.format("pi[%d] = %d",u,pi[u]));
            System.out.println(String.format("cor[%d] = %s\n",u,cor[u]));
            // marque cada um dos vértice
            for (int v : G.adj(u)){
                if (cor[v] == "Branco" ) {
                    pi[v] = u;
                    cor[v] = "Cinza";
                    marcado[v] = true;
                    d[v] = d[u] + 1;
                    // adicione o vértice descoberto a fila
                    fila.add(v);
                }
            }
            // pinte o vértice de preto
            cor[u] = "Preto";
            System.out.println(String.format("cor[%d] = %s", u, cor[u]));
        }

    }

    public boolean marcado(int w) {
        return marcado[w];
    }
}
