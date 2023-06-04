package grafo;

public class FechoTransitivoWarshall {
    public FechoTransitivoWarshall(Grafo G) {
        G.percorreMatriz();
        int[][] A = new int[G.V()][G.V()];

        for (int i = 0; i < G.V(); i++) {
            for (int j = 0; j < G.V(); j++) {
                A[i][j] = G.MatrizAdjacente[i][j];
            }
        }

        for (int k = 0; k < G.V(); k++) {
            for (int i = 0; i < G.V(); i++) {
                for (int j = 0; j < G.V(); j++) {
                    if (A[i][j] == 0 && A[i][k] == 1 && A[k][j] == 1) {
                        A[i][j] = 1;
                    }
                }
            }
        }
        
        for (int i = 0; i < G.V(); i++) {
            for (int j = 0; j < G.V(); j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }
    }
}
