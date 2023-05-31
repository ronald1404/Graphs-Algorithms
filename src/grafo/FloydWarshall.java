package grafo;

public class FloydWarshall extends Algoritmos {

    private int [][] matriz;

    public FloydWarshall(Grafo g){
        pi = new int[g.V()];
        matriz = new int[g.V()][g.V()];
        for(int i = 0;i < g.V();i++){
            for(int j = 0; j < g.V();j++){
                if (i == j) matriz[i][j] = 0;
                else matriz[i][j] = 
                    g.vertices.get(i).ListAdjacencias.contains(j) ?
                         g.getAresta(i, j).getPeso(i, j)
                         : 9999;;
            }
        }
        System.out.println();
        for(int i = 0;i < g.V();i++){
            for(int j = 0; j < g.V(); j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println();
        }
        for(int k = 0; k < g.V();k++){
            for(int i = 0;i < g.V();i++){
                for(int j = 0; j < g.V();j++){
                    if(matriz[i][k] + matriz[k][j] < matriz[i][j]){
                        matriz[i][j] = matriz[i][k] + matriz[k][j];
                        pi[k] = i;
                    }
                }
            }
        }
        System.out.println();
        for(int i = 0;i < g.V();i++){
            for(int j = 0; j < g.V(); j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println();
        }
    }
}