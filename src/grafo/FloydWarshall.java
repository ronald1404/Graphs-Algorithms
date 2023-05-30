package grafo;

public class FloydWarshall extends Algoritmos {

    private int [][] matriz;

    public FloydWarshall(Grafo g){
        pi = new int[g.V()];
        matriz = new int[g.V()][g.V()];
        for(int i = 0;i < g.V();i++){
            for(int j = 0; j < g.V();j++){
                if (i == j) matriz[i][j] = 0;
                else matriz[i][j] = g.pesoAresta(i, j);
        }
        }
        for(int i = 0;i < g.V();i++){
            for(int j = 0; j < g.V();j++){
                for(int k = 0; k < g.V();k++){
                    if(matriz[j][i] + matriz[i][k] < matriz[j][k]){
                        matriz[j][k] = matriz[j][i] + matriz[i][k];
                        pi[k] = i;
                    }
                }
            }
        }
    }
}