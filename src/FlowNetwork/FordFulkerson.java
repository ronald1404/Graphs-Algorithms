package FlowNetwork;

import java.util.ArrayDeque;
import java.util.Queue;

public class FordFulkerson {
    private boolean[] marcado;
    private Aresta[] arestaPara;
    private double valor;

    public FordFulkerson(GrafoRedeFluxo G, int s, int t) {
        valor = 0.0;
        while (caminhoAumentante(G, s, t)) {
            double bottle = Double.POSITIVE_INFINITY;
            for (int v = t; v != s; v = arestaPara[v].outro(v))
                bottle = Math.min(bottle, arestaPara[v].capacidadeResidualPara(v));
            for (int v = t; v != s; v = arestaPara[v].outro(v))
                arestaPara[v].AddFluxoResidualPara(v, bottle);
            valor += bottle;
        }
    }

    private boolean caminhoAumentante(GrafoRedeFluxo G, int s, int t) {
    arestaPara = new Aresta[G.V()]; // Array para armazenar as arestas do caminho aumentante
    marcado = new boolean[G.V()]; // Array para marcar os vértices visitados
    Queue<Integer> pilha = new ArrayDeque<>(); // Fila para armazenar os vértices a serem processados
    pilha.add(s); // Adiciona o vértice de origem à pilha
    marcado[s] = true; // Marca o vértice de origem como visitado

    while (!pilha.isEmpty()) { // Enquanto houver vértices na pilha
        int v = pilha.poll(); // Remove o próximo vértice da pilha para processamento

        for (Aresta e : G.adj(v)) { // Percorre as arestas adjacentes ao vértice v
            int w = e.outro(v); // Obtém o outro vértice da aresta (não v)

            if (!marcado[w] && (e.capacidadeResidualPara(w) > 0)) {
                // Verifica se o vértice w ainda não foi visitado e se a capacidade residual é maior que zero
                arestaPara[w] = e; // Armazena a aresta e como parte do caminho aumentante
                marcado[w] = true; // Marca o vértice w como visitado
                pilha.add(w); // Adiciona o vértice w à pilha para processamento posterior
            }
        }
    }

    return marcado[t]; // Retorna true se o vértice de destino t foi visitado
}


    public double valor() {
        return valor;
    }

    public boolean emCorte(int v) {
        return marcado[v];
    }
}
