package grafo;

public class Aresta {
    private int v;
    private int w;
    private int u;

    public Aresta(){
    }
    public Aresta(int v, int w){
        this.v = v;
        this.w = w;
    }
    public Aresta(int v, int w, int u){
        this.v = v;
        this.w = w;
        this.u = u;
    }
    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    public int getU(int v, int w) {
        if( v == this.v && w == this.w) 
        return u;
        return -1;
    }
    @Override
    public String toString() {
        return "Aresta Existente {" +
                + v +
                " -> " + w +
                '}';
    }
}
