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
    public int getU() {
            return u;
    }
    @Override
    public String toString() {
        return "Aresta Existente {" +
                + v +
                " -> " + w +
                '}';
    }
}
