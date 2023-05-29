package grafo;

public class Aresta {
    private int v;
    private int w;
    private int peso;

    public Aresta(){
    }
    public Aresta(int v, int w){
        this.v = v;
        this.w = w;
    }
    public Aresta(int v, int w, int peso){
        this.v = v;
        this.w = w;
        this.peso = peso;
    }
    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    public int getPeso(int v, int w) {
        if( v == this.v && w == this.w) 
        return peso;
        return -1;
    }
    public int getPeso() {
        return peso;
    }
    @Override
    public String toString() {
        return "Aresta Existente {" +
                + v +
                " -> " + w +
                '}';
    }
}
