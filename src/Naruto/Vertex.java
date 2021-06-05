package Naruto;

import java.util.Map;

public class Vertex<V> {
    public double weight;
    public V data;

    public Vertex(V dest, double w) {
        this.data = dest;
        this.weight = w;
    }

    public Vertex(V y) {
        this.data = y;
    }

    public V getAdj() {
        return this.data;
    }
}
