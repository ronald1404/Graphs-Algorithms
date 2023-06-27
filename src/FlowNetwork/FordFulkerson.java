package FlowNetwork;

import java.util.ArrayDeque;
import java.util.Queue;

public class FordFulkerson {
    private boolean[] marcado; // true if s->v path in residual network
    private Aresta[] arestaPara; // last edge on s->v path
    private double valor; // value of flow

    public FordFulkerson(redeFluxo G, int s, int t) {
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

    private boolean caminhoAumentante(redeFluxo G, int s, int t) {
        arestaPara = new Aresta[G.V()];
        marcado = new boolean[G.V()];
        Queue<Integer> pilha = new ArrayDeque<>();
        pilha.add(s);
        marcado[s] = true;
        while (!pilha.isEmpty()) {
            int v = pilha.poll();
            for (Aresta e : G.adj(v)) {
                int w = e.outro(v);
                if (!marcado[w] && (e.capacidadeResidualPara(w) > 0)) {
                    arestaPara[w] = e;
                    marcado[w] = true;
                    pilha.add(w);
                }
            }
        }
        return marcado[t];
    }

    public double valor() {
        return valor;
    }

    public boolean emCorte(int v) {
        return marcado[v];
    }
}
